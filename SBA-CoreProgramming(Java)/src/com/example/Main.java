package com.example;

import com.example.TheSystemTest;

public class Main {

	public static void main(String[] args) {

	    final String EXPECTED_NAME = "HOT JAVA";
	    final String EXPECTED_ITEM_DESC = "VERY ADDICTIVE DRINK";
	    final Double EXPECTED_ITEM_PRICE = Double.valueOf(4.2000000000000002D);
	    final Integer EXPECTED_QUANTITY = Integer.valueOf(69);
	    final Integer EXPECTED_AVAILABLE_QUANTITY = Integer.valueOf(1337);

	
	    AppSystem testAppSystem = new AppSystem();
        Item testItem = new Item("HOT JAVA", "VERY ADDICTIVE DRINK", EXPECTED_ITEM_PRICE, EXPECTED_AVAILABLE_QUANTITY);
        System.out.println(testAppSystem.reduceAvailableQuantity("HOT JAVA"));

        testAppSystem.add(testItem);
        System.out.println(testAppSystem.reduceAvailableQuantity("HOT JAVA"));

        Integer reduced_EXPECTED_AVAILABLE_QUANTITY = Integer.valueOf(EXPECTED_AVAILABLE_QUANTITY.intValue() - 1);
        System.out.println(testItem.getAvailableQuantity());
        
        testItem.setAvailableQuantity(Integer.valueOf(1));
        /*
        
        testAppSystem.reduceAvailableQuantity("HOT JAVA");
        Assert.assertEquals("Checks if an item was removed when its available quantity reached 0: ", null, testAppSystem.getItemCollection().get("HOT JAVA"));
*/
	}

}
