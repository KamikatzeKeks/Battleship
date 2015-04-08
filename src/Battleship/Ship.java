package Battleship;

import java.awt.image.BufferedImage;

import ch.aplu.jgamegrid.*;

public abstract class Ship extends Actor {
	private int angle;
	private int size;
	private boolean isDestroyed = false;
	Location[] hitPoints;

	public Ship(int angle, int size, Location[] hitPoints,String shipType) {

		super("sprites/"+shipType + "_" + angle + ".gif", 1);
		this.hitPoints = hitPoints;
		this.angle = angle;
		this.size = size;
	}
	
	public int isHit(Location userShot)
	{
		int isHitOrDestroyed = 0; // 0=nicht getroffen, 1=getroffen, 2= getroffen und versenkt
		for (Location hitPoint : hitPoints) 
		{
			if (hitPoint.equals(userShot)) 
			{
				System.out.println("hit");
				size--;
				if(size == 0)
				{
					isHitOrDestroyed = 2;
				}
				else
				{
					isHitOrDestroyed = 1;
				}
			}
		}
		return isHitOrDestroyed;
	}
	
	public Location getStartLocation(){
				
		return hitPoints[hitPoints.length -1];
		
	}

	public void showLocationPosition() {

		for (Location bla : hitPoints) {

			System.out.println("x: " + bla.getX() + " y: " + bla.getY());

		}

	}
	
	public Location[] getShipPositions(){
		 return hitPoints;
	}
}
