package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Battleship extends JFrame
{
	Ship[] fleetPlayer1 = new Ship[5];
	Ship[] fleetPlayer2 = new Ship[5];
	
	GameGrid gg = new GameGrid(10, 10, 60, Color.green, "sprites/background.png");
	GameGrid gg2 = new GameGrid(10, 10, 60, Color.red, "sprites/background.png");
	
	JButton b = new JButton("Start");
	
	
	public Battleship()
	{
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	    this.setSize(1350,700);
	    
		getContentPane().add(gg, BorderLayout.WEST);
	    gg.doRun();
	    
	    getContentPane().add(gg2, BorderLayout.EAST);
	    gg2.doRun();
	    
	    b.setSize(new Dimension(100,50));
	    b.addActionListener(new ActionListener() 
	    {
	         public void actionPerformed(ActionEvent e)
	         {
	        	 
	        	 FleetSetter player1 = new FleetSetter(null, true); // Erstellt modalen jDialog
	        	  fleetPlayer1 = player1.showDialog();  //Zeigt den Dialog und bekommt das Array aus Shiffobjekten vom Dialog
	        	  //TODO Shiffobjekte im Dialog erzeugen und im return Array speichern <<< mit der public void Game() Methode;
	        	//Game();
	         }          
	    });
	    getContentPane().add(b, BorderLayout.SOUTH);
	    
	}
	
//	public void Game()
//	{
//		Location[] position = new Location[2];
//		
//		for(int i=0; i<5; i++ )
//		{
//			
//			int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte X Koordinat angeben"));
//	 		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Y Koordinat angeben"));
//	 		int angle = Integer.parseInt(JOptionPane.showInputDialog("Bitte Winkel angeben (0,90, 180, 270)"));
//	 		
//	 		Location l = new Location(x-1, y-1);
//	 		position[0] = l;
//	 		
//	 		
//	 		Location l1 = new Location();
//	 		switch (angle) 
//	 		{
//	            case 0:  l1 = new Location(x, y-1);
//	                     break;
//	            case 90: l1 = new Location(x-1, y);
//	                     break;
//	            case 180:  l1 = new Location(x-2, y-1);
//	                     break;
//	            case 270:  l1 = new Location(x-1, y-2);
//	                     break;
//	            default: l1 = new Location(x, y-1);
//	                     break;
//	 		}
//	 		position[0] = l;
//	 		position[1] = l1;
//	 		
//	 		Boat b = new Boat(angle, 3, position);
//	 		fleet[i] = b;
//	 	    gg.addActor(b, l);
//		}
//		b.setVisible(false);
//	}
	
	private void addShipToFleet(){
		
		
	}

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
	    {
	      public void run()
	      {
	    	  new Battleship().setVisible(true);
	    	  
	      }
	    });
		
	}

}
