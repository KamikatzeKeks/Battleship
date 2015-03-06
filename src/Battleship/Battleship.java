package Battleship;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import Battleship;
import Carrier;
import Destroyer;
import JFrame;
import PatrolBoat;
import Ship;
import Submarine;

import javax.swing.WindowConstants;

import ch.aplu.jgamegrid.GGMouse;
import ch.aplu.jgamegrid.GGMouseListener;
import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;



public class Battleship extends JFrame implements GGMouseListener{


	
	public Battleship() {

		GameGrid gg = new GameGrid(10, 10, 60, Color.red,
				
				"src/sprites/background.png");


		Ship s1 = new Ship();
		gg.addActor(s1, new Location(3, 3));
		s1.turn(90);
		s1.isRotatable();

		getContentPane().add(gg, BorderLayout.EAST);

		Point Boat = gg.getPosition();
		System.out.println(s1.getLocationStart());

		gg.doRun();

		GameGrid gg1 = new GameGrid(10, 10, 60, Color.green,
				"src/sprites/background.png");
		getContentPane().add(gg1, BorderLayout.WEST);
		gg1.doRun();

	}
	
	public void battleShipApplication(){
		
		 Ship[] player1 =
			    { new Ship(),  new Ship() };
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Battleship().setVisible(true);
			}
		});

	}

	@Override
	public boolean mouseEvent(GGMouse arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
