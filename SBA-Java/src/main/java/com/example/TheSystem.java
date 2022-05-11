package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	
	private HashMap<String, Item> itemCollection;

    TheSystem() {
        // Your code here
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {
        if (item.getQuantity() >= item.getAvailableQuantity()) {
            System.out.println('System is unable to add ' + item.getItemName() + ' to the card. System only has ' + item.getAvailableQuantity() + ' ' + item.getItemName() + 's.');
            return false;
        }
        return true;
    }
    
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } else if 
    }

    public Item remove(String itemName) {
        // Your code here
    }
    
    public void setItemCollection(HashMap<String, Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    public abstract void display();

}
