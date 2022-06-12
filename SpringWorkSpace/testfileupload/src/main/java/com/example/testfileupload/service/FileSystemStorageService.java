package com.example.testfileupload.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.testfileupload.storageexceptions.StorageException;
import com.example.testfileupload.storageexceptions.StorageNotFoundException;

public class FileSystemStorageService {
	
	private final Path rootLocation;
	
	
	//create Storage properties file
	@Autowired
	public FileSystemStorageService(StorageProperties properties) {
		//add our path location
		this.rootLocation = Paths.get(properties.getLocation());
	}
	
	//store our file
	public void store(MultipartFile file) {
		try {
			if(file.isEmpty()) {
				//throw custom Exception
				throw new StorageException("Failed to store empty file");
			}
			Path destinationFile = this.rootLocation.resolve(
					Paths.get(file.getOriginalFilename()))
						.normalize().toAbsolutePath();
			
			if(!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())) {
				//throw custom Exception
				throw new StorageException("Cannot store file outside this location");

			}
			
			try(InputStream inputStream = file.getInputStream()) {
				Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch(IOException e) {
			throw new StorageException("Failed to store file in location", e);
		}
	}
	
	//load our files
	public Stream<Path> loadAll() {
		try {
			return Files.walk(this.rootLocation, 1)
						.filter(path -> !path.equals(this.rootLocation))
						.map(this.rootLocation::relativize);
		} catch(IOException e) {
			throw new StorageException("Failed to read stored files",e);
		}
	}
	
	public Path load(String filename) {
		return rootLocation.resolve(filename);
	}
	
	public Resource loadAsResource(String filename) {
		try {
			Path file = load(filename);		
			Resource resource = new UrlResource(file.toUri());
			
			if(resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new StorageNotFoundException("Could not read file: " + filename);
			}
		} catch(MalformedURLException e) {
			throw new StorageNotFoundException("Could not read file: " + filename, e);
		}
	}
	
	public void deleteALL() {
		FileSystemUtils.deleteRecursively(rootLocation.toFile());
	}
	
	public void init() {
		try {
			Files.createDirectories(rootLocation);
		} catch(IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
		
	}

}
