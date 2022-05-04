/**
 * 
 */
package com.perscholas.java_doorsandlocks;

import java.util.*;

import com.perscholas.java_doorsandlocks.Key.Keyshape;

/**
 * @author model
 *
 */
public class Warehouse {
	private List<Door> doors;
	private Keychain keys;
	
	
	public Warehouse() {
		
	}
	
	
	public Warehouse(int totalDoors, int lockedDoors) {
		doors = new ArrayList<Door>();
		keys = new Keychain();
		addDoor(lockedDoors, "locked");
		addDoor(totalDoors-lockedDoors, "unlocked");
	}
	
	
	public void addDoor(int totalDoors, String doorState) {
		if(doorState.equals("unlocked")) {
			for (int i = 0; i < totalDoors; i++) {
				Door door = new Door(null);
				doors.add(door);
			}
		} else if(doorState.equals("locked")) {
			double randomNum;
			for (int i = 0; i < totalDoors; i++) {
				Key key;
				randomNum = Math.random();
				if(randomNum < 0.25) {
					key = new Key(Keyshape.Circular);
				} else if(randomNum < 0.5) {
					key = new Key(Keyshape.Oval);
				} else if(randomNum < 0.75) {
					key = new Key(Keyshape.Square);
				} else {
					key = new Key(Keyshape.TrapezoidDown);
				}
				Door door = new Door(key);
				doors.add(door);
				keys.addKey(key);
			}
		}
		
	}
	
	public int countDoor() {
		return doors.size();
	}
	
	public int[] countDoor(String keyState) {
		int[] count = new int[5];
		int totalCount = 0, countSquare = 0, countCircular = 0, countOval = 0, countTrapezoidDown = 0;
		
		if(keyState.equals("key")) {
			for(int i = 0; i < doors.size(); i++) {
				Door door = doors.get(i);
				if(door.hasKey()) {
					Key key = door.key();
					if(key.shape() == Keyshape.Circular) {
						countCircular++;
					} else if(key.shape() == Keyshape.Oval) {
						countOval++;
					} else if(key.shape() == Keyshape.Square) {
						countSquare++;
					} else if(key.shape() == Keyshape.TrapezoidDown) {
						countTrapezoidDown++;
					}
					totalCount++;	
				}
			}
		} else if(keyState.equals("nokey" )) {
			for(int i = 0; i < doors.size(); i++) {
				if(!doors.get(i).hasKey()) {
					totalCount++;	
				}
			}
			
		}
		
		count[0] = totalCount;
		count[1] = countSquare;
		count[2] = countCircular;
		count[3] = countOval;
		count[4] = countTrapezoidDown;
		
		return count;
	}
}
