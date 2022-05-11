package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	// "C:\\Users\\model\\Documents\\GitHub\\TEKSYS_05_Java\\SBA-CoreProgramming(Java)\\src\\sample.txt"
	// Your code here
	private HashMap<String, Item> itemCollection;

	public TheSystem() {
		// Your code here
		this.itemCollection = new HashMap<String, Item>();
		if (getClass().getSimpleName().equals("AppSystem")) {

			try {
				File file = new File(
						"C:\\Users\\model\\Documents\\GitHub\\TEKSYS_05_Java\\SBA-CoreProgramming(Java)\\src\\customsample.txt");
				Scanner input = new Scanner(file);

				while (input.hasNextLine()) {
					String line = input.nextLine();
					String[] itemInfo = line.split("\\s ");

					String itemName = itemInfo[0];
					String itemDesc = itemInfo[1];
					Double itemPrice = Double.parseDouble(itemInfo[2]);
					Integer availableQuantity = Integer.parseInt(itemInfo[3]);

					Item item = new Item(itemName, itemDesc, itemPrice, availableQuantity);

					itemCollection.put(item.getItemName(), item);
				}

				input.close();

			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}

		}
	}

	public HashMap<String, Item> getItemCollection() {
		// Your code here
		return itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the card. System only has "
					+ item.getAvailableQuantity() + " " + item.getItemName() + "s.");
			return false;
		}
		return true;
	}

	public Boolean add(Item item) {
		// Your code here
		if (item == null || itemCollection == null) {
			return false;
		} else if (itemCollection.containsKey(item.getItemName())) {
			Item collectionItem = itemCollection.get(item.getItemName());

			if (collectionItem.getAvailableQuantity() > 0) {
				Integer quantity = collectionItem.getQuantity();
				collectionItem.setQuantity(quantity + 1);
				return true;
			}

		} else if (!itemCollection.containsKey(item.getItemName())) {
			item.setQuantity(1);  //is this necessary since item constructor sets quantity to 1
			itemCollection.put(item.getItemName(), item);
			return true;
		}
		return false;
	}

	public Item remove(String itemName) {
		// Your code here
		if (itemCollection.containsKey(itemName)) {
			Item collectionItem = itemCollection.get(itemName);
			itemCollection.remove(itemName);
			return collectionItem;
		}
		return null;
	}

	public void setItemCollection(HashMap<String, Item> itemCollection) {
		// Your code here
		this.itemCollection = itemCollection;
	}

	public abstract void display();
}
