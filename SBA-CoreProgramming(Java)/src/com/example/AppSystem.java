package com.example;

public class AppSystem extends TheSystem {

	AppSystem() {
	}

	@Override
	public void display() {
		// Your code here
		System.out.println("AppSystem Inventory:");
		System.out.format("%-20s %-20s %-10s %-10s\n", "Name", "Description", "Price", "Available Quantity");

		for (Item item : getItemCollection().values()) {
			System.out.format("%-20s %-20s %-10.2f %-10d\n", item.getItemName(), item.getItemDesc(),
					item.getItemPrice(), item.getAvailableQuantity());

		}
	}

	@Override // this overwrites the parents class add method
	public Boolean add(Item item) {
		// Your code here
		if (item == null || getItemCollection() == null) {
			return false;
		} else if (getItemCollection().containsKey(item.getItemName())) {
			System.out.println(item.getItemName() + " is already in the App System");
			return false;
		}

		getItemCollection().put(item.getItemName(), item);
		return true;
	}

	public Item reduceAvailableQuantity(String itemName) {
		// Your code here
		if (getItemCollection().containsKey(itemName)) {
			Item collectionItem = getItemCollection().get(itemName);
			Integer availableQuantity = collectionItem.getAvailableQuantity();

			if (availableQuantity > 1) {
				collectionItem.setAvailableQuantity(availableQuantity - 1);
				return collectionItem;
			} else if (availableQuantity == 1) {
				collectionItem.setAvailableQuantity(availableQuantity - 1);
				getItemCollection().remove(itemName);
				return collectionItem;
			}
		}
		return null;
	}

}
