package Battleship;

import java.awt.image.BufferedImage;

import ch.aplu.jgamegrid.*;

public class Ship extends Actor
{
	private int angle;

	public Ship(int angle) 
	{		
		super("sprites/destroyer_" + angle + ".gif", 1);
		this.angle = angle;
	}
}
