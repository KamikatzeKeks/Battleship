package Battleship;

import ch.aplu.jgamegrid.Location;

public class Boat extends Ship {
	
	

	public Boat(int angle, int size, Location[] hitPoints) {
		super(angle, size, hitPoints);
		for (Location hitPoint : hitPoints) {
			int i = 0;
			position            [i] = hitPoint;
			i++;
		}
	}

	public void setLocation(Location a, Location b) {
		
		position[0] = a;
		position[1] = b; 

	}



}
