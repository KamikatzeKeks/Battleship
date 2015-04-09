package Battleship;

import java.awt.image.BufferedImage;



import ch.aplu.jgamegrid.*;

/**
 * Die abstrakte Klasse Ship erbt von Actor und repräsentiert ein Schiff auf dem Spielfeld.
 * Jedes Objekt der Klasse Schiff besteht aus einem Integer der die Größe in Spielfeldern angibt,
 * einem int der den Winkel angibt in welchen das Schiff platziert wird, einem Boolean der angibt ob ein Schiff zerstört
 * wurde oder nicht
 * 
 * 
 * Jedes Schiff besteht vorallem aus einem Array von Objekten der Klasse Location. 
 * Ein Schiff der Größe " 5 " besteht z.B. aus 5 Objekten der Klasse Location, da es 5 Spielfelder belegt.
 * 
 * @param angle
 * @param size 
 * @param hitPoints
 * @param shipType
 * 
 * @author Brian Korduan
 * @author Davis Fröse
 */
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
	/**
	 * 
	 * @param userShot
	 * @return
	 */
	public int isHit(Location userShot)
	{
		int isHitOrDestroyed = 0; // 0=nicht getroffen, 1=getroffen, 2= getroffen und versenkt
		for (Location hitPoint : hitPoints) 
		{
			if (hitPoint.equals(userShot)) 
			{
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
	
	/**
	 * 
	 * @return
	 */
	public Location getStartLocation(){
				
		return hitPoints[hitPoints.length -1];
		
	}
/**
 * 
 */
	public void showLocationPosition() {

		for (Location bla : hitPoints) {

			System.out.println("x: " + bla.getX() + " y: " + bla.getY());

		}

	}
	
	/**
	 * 
	 * @return
	 */
	
	public Location[] getShipPositions(){
		 return hitPoints;
	}
}
