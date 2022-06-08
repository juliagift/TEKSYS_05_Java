package com.example.dependiceioc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dependiceioc.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
	
//	@Query("SELECT ...")   
	List<Item> findByItemId(int item_id);
	List<Item> findAllItems(int item_id);
	List<Item> findItemByBrand(int item_id);
}
