package Battleship;

import ch.aplu.jgamegrid.Location;

public class Patrolboat extends Ship {
	
	
Location[] position;

	public Patrolboat(int angle, int size, Location[] hitPoints) {
		super(angle, size, hitPoints);
		
		position= hitPoints;
		for (Location hitPoint : hitPoints) {
			int i = 0;
			position            [i] = hitPoint;
			i++;
		}	}

	public void setLocation(Location a, Location b) {
		
		position[0] = a;
		position[1] = b; 

	}

	
	//TODO Schauen ob die Schiffsobjekte stimmen
	@Override
	public void showLocationPosition() {

		for (Location bla : position) {

			System.out.println("x " + bla.getX());
			System.out.println("y " + bla.getY());

		}
	}		
	
	

		
	}
	

		
	
	
	




