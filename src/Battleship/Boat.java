package Battleship;

import ch.aplu.jgamegrid.Location;

public class Boat extends Ship {
	
	

	Location[] position = new Location[2];
	int size = 2;
	Boolean isDestroyed;

	public Boat(int angle, Location[] hitPoints) {
		super(angle,  hitPoints);

		
		for (Location hitPoint : hitPoints) {
			int i = 0;
			position            [i] = hitPoint;
			i++;
		}
		
	}

	@Override
	public Boolean isDestroyed(Location userShot) {

		for (Location position : this.position) {

			if (position.equals(userShot)) {
				size--;
			}
			if (size == 0) {
				isDestroyed = true;
			} else {
				isDestroyed = false;
			}
		}
		return isDestroyed;
	}

	public void setLocation(Location a, Location b) {
		
		position[0] = a;
		position[1] = b; 

	}



}
