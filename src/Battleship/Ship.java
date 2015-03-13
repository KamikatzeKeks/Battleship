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

	public void showLocationPosition() {

		for (Location bla : hitPoints) {

			System.out.println("x: " + bla.getX() + " y: " + bla.getY());

		}

	}
}
