package com.example.dependiceioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dependiceioc.entity.Item;
import com.example.dependiceioc.repository.ItemRepository;

@Controller
public class ItemController {
	
	//private ItemRepository itemRepo; constructor Dependency Injection- one way of doing DI using a constructor
	//ItemController(ItemRepository itemRepo) {
	//	this.itemRepo = itemRepo;
	//}
	
	
	//setter dependency injection
//	private ItemRepository itemRepo;
//	public void setItemRepo(ItemRepository itemRepo) {
//		this.itemRepo = itemRepo;
//	}
	
	//coupling
	//tight coupling
	//loose coupling
	
	
	//field-based DI
	@Autowired
//	@Qualifier("itemRepo")
	private ItemRepository itemRepo;
	
	@GetMapping(path="/")
	public String show() {
		return "Hello to all";
	}
	
	@PostMapping(path="/add/{name}/{price}")
	public void addItem(@PathVariable String name, @PathVariable int price) {
		Item newItem = new Item();
		newItem.setName(name);
		newItem.setPrice(price);
		itemRepo.save(newItem);
		
	}
	
	@PostMapping(path="/edit")
	public void editItem() {
		
	}
	
	@PostMapping(path="/add/{id}/{username}")
	public void addEmployee(@PathVariable Integer id, @PathVariable String username) {
		
	}
	
	@PostMapping(path="/edit")
	public void editEmployee() {
		
	}
}
