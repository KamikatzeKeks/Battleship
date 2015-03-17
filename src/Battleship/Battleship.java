package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Battleship extends JFrame {

	// TODO Fehler beheben bei dem es Möglich ist ein Schiff e mit
	// permanenten feuern auf einen Punkt(der trifft) zu zerstören
	// TODO Anzeigen wo schon hingeschossen wurde
	// TODO Anzeigen ob getroffen wurde
	// TODO Schiffe werden vertikal berechnet bei 0° aber horizontal angezeigt
	//TODO Schiffe dürfen nicht außerhalb des Spielfeldes platziert werden
	//TODO Es dürfen keine Schiffe auf den selben Feldern platziert werden

	GameGrid jGameGridPlayer1 = new GameGrid(10, 10, 60, Color.green,
			"sprites/background.png");
	GameGrid jGameGridPlayer2 = new GameGrid(10, 10, 60, Color.red,
			"sprites/background.png");

	JButton jBtnSetFleetPlayer1 = new JButton("Set Fleet Player 1");
	JButton jBtnSetFleetPlayer2 = new JButton("Set Fleet Player 2");
	JButton jBtnStartGame = new JButton("Start Game");
	JButton jBtnShoot = new JButton("Shoot");
	JPanel jPanelButton = new JPanel();
	Ship[] fleetPlayer1 = new Ship[5];
	Ship[] fleetPlayer2 = new Ship[5];
	int player1FleetDestroyed = 0;
	int player2FleetDestroyed = 0;
	boolean player1Turn = true; // TODO umbennen in Usershot

	public Battleship() {
		// Sets values of Mainframe
		{
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setSize(1350, 700);
		}

		getContentPane().add(jPanelButton, BorderLayout.SOUTH);
		jPanelButton.add(jBtnSetFleetPlayer1);
		jPanelButton.add(jBtnStartGame);
		jPanelButton.add(jBtnShoot);
		jPanelButton.add(jBtnSetFleetPlayer2);

		{
			jBtnSetFleetPlayer1.setSize(new Dimension(100, 50));
		}

		{
			jBtnSetFleetPlayer2.setSize(new Dimension(100, 50));
		}
		
		{
			jBtnStartGame.setEnabled(true);
		}
		
		{
			jBtnShoot.setVisible(false);
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
			
			jBtnSetFleetPlayer1.addActionListener(new java.awt.event.ActionListener()  {
							public void actionPerformed(ActionEvent evt) {
					jBtnSetFleetPlayer1ActionPerformed(evt);
				}});
			
			
			jBtnSetFleetPlayer2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jBtnSetFleetPlayer2ActionPerformed(evt);
				}});

			jBtnStartGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {						
					jBtnStartGameActionPerformed(evt);
				}
			});

			jBtnShoot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jBtnShootActionPerformed(evt);
				}
			});

		}
	}
		

	public void battleshipRounds() {

		playerShotFrame playerShotFrame = new playerShotFrame(null, true);
		Location playerShot;

		playerShot = playerShotFrame.showDialog();

		if (player1Turn == true) {

			player1Turn = false;

			for (Ship ship : fleetPlayer1) {

				if (ship.isDestroyed(playerShot) == true) {
					player1FleetDestroyed++;
				}

			}

		} else {
			player1Turn = true;

			for (Ship ship : fleetPlayer2) {

				if (ship.isDestroyed(playerShot) == true) {
					player2FleetDestroyed++;
				}

			}

		}

		if (player1FleetDestroyed == 5) {

			// TODO Handlings falls gewonnen
			JOptionPane.showMessageDialog(null, "Player 2 won");
		} else if (player2FleetDestroyed == 5) {
			JOptionPane.showMessageDialog(null, "Player 1 won");

		}

	}
	

	private void jBtnSetFleetPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Schiffklassen ableiten (Carrier etc)
				FleetSetterFrame player1 = new FleetSetterFrame(null, true); // Erstellt
																				// modalen
																				// jDialog
				fleetPlayer1 = player1.showDialog(); // Zeigt den Dialog und
														// bekommt das Array
														// aus Shiffobjekten
														// vom Dialog

				for (Ship currentActor : fleetPlayer1) {
					jGameGridPlayer1.addActor(currentActor,
							currentActor.getStartLocation());
				}

				jBtnSetFleetPlayer1.setEnabled(false);
				// Testschleife um die Positionen zu überprüfen
				for (Ship testBody : fleetPlayer1) {
					System.out.println("Schiff: ");
					testBody.showLocationPosition();

				}
		
		
		
	}

	

	private void jBtnSetFleetPlayer2ActionPerformed(
			java.awt.event.ActionEvent evt) {
		

		// TODO Schiffklassen ableiten (Carrier etc)
		FleetSetterFrame player2 = new FleetSetterFrame(null, true); //modaler Dialog zum festlegen der Schiffspositionen
		fleetPlayer2 = player2.showDialog();											 // anzeigen des Dialogs Rückgabewert Array aus Schiffen											// aus Shiffobjekten												// vom Dialog

		for (Ship currentActor : fleetPlayer2) {
			jGameGridPlayer2.addActor(currentActor,
					currentActor.getStartLocation());
		}
		jBtnSetFleetPlayer2.setEnabled(false);
	}

	private void jBtnStartGameActionPerformed(java.awt.event.ActionEvent evt) {
		
		if(jBtnSetFleetPlayer1.isEnabled() == false && jBtnSetFleetPlayer2.isEnabled() == false){
		jBtnSetFleetPlayer1.setVisible(false);
		jBtnSetFleetPlayer2.setVisible(false);
		jBtnShoot.setVisible(true);
		jBtnStartGame.setVisible(false);
		}
	}

	private void jBtnShootActionPerformed(java.awt.event.ActionEvent evt) {
		battleshipRounds();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Battleship().setVisible(true);

			}
		});

	}

}
