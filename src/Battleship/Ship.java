package Battleship;

import java.awt.image.BufferedImage;

import ch.aplu.jgamegrid.*;

public abstract class Ship extends Actor
{
	private int angle;
	private int size;
	private Boolean isDestroyed = false; 

	public Ship(int angle, int size, Location[] hitPoints) 
 	{		
		super("sprites/destroyer_" + angle + ".gif", 1);
		this.angle = angle;
	}



	public abstract  Boolean  isDestroyed(Location userShot);
	

}
