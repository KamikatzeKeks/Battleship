package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Battleship extends JFrame
{
	GameGrid gg = new GameGrid(10, 10, 60, Color.red, "sprites/background.png");
	GameGrid gg1 = new GameGrid(10, 10, 60, Color.green, "sprites/background.png");
	
	
	public Battleship()
	{
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	    this.setSize(1350,700);
		 
	    
		getContentPane().add(gg, BorderLayout.EAST);
	    gg.doRun();
	    
	    getContentPane().add(gg1, BorderLayout.WEST);
	    gg1.doRun();
	    
	    JButton b = new JButton("Start");
	    
	    b.setSize(new Dimension(100,50));
	    b.addActionListener(new ActionListener() 
	    {
	         public void actionPerformed(ActionEvent e)
	         {
	        	Game();
	         }          
	    });
	    getContentPane().add(b, BorderLayout.SOUTH);
	    
	    
	}
	
	public void Game()
	{
		
		for(int i=0; i<5; i++ )
		{
			int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte X Koordinat angeben"));
	 		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Y Koordinat angeben"));
	 		int angle = Integer.parseInt(JOptionPane.showInputDialog("Bitte Winkel angeben (0,90, 180, 270)"));
	 		
	 		Ship s = new Ship(angle);
	 	    gg.addActor(s, new Location(x-1, y-1));
		}
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
