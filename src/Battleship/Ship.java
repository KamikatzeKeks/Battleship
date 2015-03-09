package Battleship;

import java.awt.image.BufferedImage;

import ch.aplu.jgamegrid.*;

public abstract class Ship extends Actor {
	private int angle;
	private int size;
	private Boolean isDestroyed = false;
	Location[] position;

	public Ship(int angle, int size, Location[] hitPoints) 
	{
		super("sprites/destroyer_" + angle + ".gif", 1);
		this.angle = angle;
		this.size = size;
		position = new Location[size];
	}

	public Boolean isDestroyed(Location userShot) 
	{

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

}
