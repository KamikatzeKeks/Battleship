package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Battleship extends JFrame {
	GameGrid jGameGridPlayer1 = new GameGrid(10, 10, 60, Color.green,
			"sprites/background.png");
	GameGrid jGameGridPlayer2 = new GameGrid(10, 10, 60, Color.red,
			"sprites/background.png");

	JButton jBtnSetFleetPlayer1 = new JButton("Set Fleet Player 1");

	Ship[] fleetPlayer1 = new Ship[5];
	Ship[] fleetPlayer2 = new Ship[5];

	public Battleship() {
		// Sets values of Mainframe
		{
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setSize(1350, 700);
		}

		{
			jBtnSetFleetPlayer1.setSize(new Dimension(100, 50));
			getContentPane().add(jBtnSetFleetPlayer1, BorderLayout.SOUTH);
		}

		// GameGrid Player1
		{
			getContentPane().add(jGameGridPlayer1, BorderLayout.WEST);
			jGameGridPlayer1.doRun();
		}

		// GameGrid Player2
		{
			getContentPane().add(jGameGridPlayer2, BorderLayout.EAST);
			jGameGridPlayer2.doRun();
		}

		// Action Listeners
		{
			jBtnSetFleetPlayer1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) // Aktion beimDrücken desButtons "Set Fleet Player 1"													
				{

					FleetSetterFrame player1 = new FleetSetterFrame(null, true); // Erstellt modalen  jDialog
					fleetPlayer1 = player1.showDialog(); // Zeigt den Dialog und bekommt das Array aus Shiffobjekten  vom Dialog
					Location l = new Location(1,1);
					l  = fleetPlayer1[0].getLocation();
					System.out.println(l.getX());
					System.out.println(l.getY());

					// TODO Shiffobjekte im Dialog erzeugen und im return Array
					// speichern <<< mit der public void Game() Methode;
					
					// Game();
				}
			});
		}

	}

	

	private void addShipToFleet() {

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Battleship().setVisible(true);

			}
		});

	}

}
