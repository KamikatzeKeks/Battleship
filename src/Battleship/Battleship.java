package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;


public class Battleship extends JFrame
{
	public Battleship()
	{
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		GameGrid gg = new GameGrid(10, 10, 60, Color.red, "sprites/background.png");
	    
		int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte X Koordinat angeben"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Y Koordinat angeben"));
		int angle = Integer.parseInt(JOptionPane.showInputDialog("Bitte Winkel angeben (0,90, 180, 270)"));
		
		Ship s1 = new Ship(angle);
	    gg.addActor(s1, new Location(x-1, y-1));
	    
		getContentPane().add(gg, BorderLayout.EAST);
	    gg.doRun();
	    
	   
	    GameGrid gg1 = new GameGrid(10, 10, 60, Color.green, "sprites/background.png");
	    getContentPane().add(gg1, BorderLayout.WEST);
	    gg1.doRun();
	    
	    JButton b = new JButton();
	    getContentPane().add(b, BorderLayout.SOUTH);

	    
	}

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
	    {
	      public void run()
	      {
	    	  new Battleship().setVisible(true);
	    	  JOptionPane.showMessageDialog(null, "Hi");
	      }
	    });
		
		Boat hans = new Boat();
		
	
	}

}
