package Battleship;

import ch.aplu.jgamegrid.Location;

public class Boat extends Ship {
	
	

	Location[] position = new Location[2];
	int size;
	Boolean isDestroyed;

	public Boat(int angle, int size, Location[] hitPoints) {
		super(angle, size, hitPoints);

		this.size = size;
		for (Location hitPoint : hitPoints) {
			int i = 0;
			position[i] = hitPoint;
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

	}

	public Location[] getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Location[] hitPoints) {
		this.hitPoints = hitPoints;
	}

}
