package Battleship;

import java.awt.image.BufferedImage;

import ch.aplu.jgamegrid.*;

public abstract class Ship extends Actor {
	private int angle;
	private int size;
	private Boolean isDestroyed = false;
	Location[] hitPoints;

	public Ship(int angle, int size, Location[] hitPoints) {

		super("sprites/destroyer_" + angle + ".gif", 1);
		this.hitPoints = hitPoints;
		this.angle = angle;
		this.size = size;
	}

	public Boolean isDestroyed(Location userShot) {
		
		//TODO Fehler beheben bei dem es Möglich ist die ganze Flotte mit permanenten feuern auf einen Punkt(der trifft) zu zerstören
		//TODO Anzeigen wo schon hingeschossen wurde
		//TODO Anzeigen ob getroffen wurde 
		//TODO Schiffe werden vertikal berechnet bei 0° aber horizontal angezeigt

		for (Location hitPoint : hitPoints) {

			if (hitPoint.equals(userShot)) {
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
	
	public Location getStartLocation(){
				
		return hitPoints[hitPoints.length -1];
		
	}

	public void showLocationPosition() {

		for (Location bla : hitPoints) {

			System.out.println("x: " + bla.getX() + " y: " + bla.getY());

		}

	}
}
