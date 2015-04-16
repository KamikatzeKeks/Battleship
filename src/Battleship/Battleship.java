package Battleship;

import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Battleship extends JFrame {


	GameGrid jGameGridPlayer1 = new GameGrid(10, 10, 60, Color.green,
			"sprites/background.png");
	GameGrid jGameGridPlayer2 = new GameGrid(10, 10, 60, Color.red,
			"sprites/background.png");

	JButton jBtnSetFleetPlayer1 = new JButton("Set Fleet Player 1");
	JButton jBtnSetFleetPlayer2 = new JButton("Set Fleet Player 2");
	JButton jBtnStartGame = new JButton("Start Game");
	JButton jBtnShoot = new JButton("Shoot");
	JButton jBtnGameGridReset = new JButton("Reset");
	JPanel jPanelButton = new JPanel();
	Ship[] fleetPlayer1 = new Ship[5];
	Ship[] fleetPlayer2 = new Ship[5];
	ArrayList<Location> player1Shots = new ArrayList<Location>();
	ArrayList<Location> player2Shots = new ArrayList<Location>();
	int player1FleetDestroyed = 0;
	int player2FleetDestroyed = 0;
	boolean player1Turn = true;
	GGBackground backgroundGameGridPlayer2 = jGameGridPlayer2.getBg();
	GGBackground backroundGameGridPlayer1 = jGameGridPlayer1.getBg();

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
		jPanelButton.add(jBtnGameGridReset);

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

			jBtnSetFleetPlayer1
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jBtnSetFleetPlayer1ActionPerformed(evt);
						}
					});

			jBtnSetFleetPlayer2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jBtnSetFleetPlayer2ActionPerformed(evt);
				}
			});

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

			jBtnGameGridReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jBtnGameGridResetActionPerformed(evt);
				}
			});

		}
	}

	public void battleshipRounds() {

		playerShotFrame playerShotFrame = new playerShotFrame(null, true);
		Location playerShot;

		playerShot = playerShotFrame.showDialog();

		if (player1Turn == true) { // Wählt wer an der Reihe ist

			player1Turn = false;
			ListIterator<Location> i = player1Shots.listIterator(); // erstellt
																	// ein
																	// Iterable
																	// Object
																	// von
																	// player1Shots

			/*
			 * Der folgende Block durchläuft ein Array mit bereits
			 * angeschossenen Feldern Wurde ein Feld schonmal beschossen wird
			 * ein Schiff nicht mehr gefragt ob es getroffen wurde. Auf diese
			 * Weise wird verhindert, dass man mit schießen auf den selben
			 * hitPoint ein ganzes Schiff zerstören kann
			 */
			// Hab es mit einem Iterator umgesetzt sonst kann man wärend der
			// Iteration nicht
			// Objekte in den Array anhängen ohne ein Error zu erzuegen.

			if (!i.hasNext()) // Wenn der Array leer ist wird es mit der ersten
								// Location gefüllt
			{
				ShotPlayer1(playerShot);
			} else {
				while (i.hasNext()) {
					Location next = i.next();

					if (next.equals(playerShot)) {
						JOptionPane.showMessageDialog(null, "Already Shot");
						playerShot = playerShotFrame.showDialog();
						while (i.hasPrevious()) {
							i.previous();
						} // rudert den Iterator zurück damit er wieder von
							// Anfang überprüft wird falls wieder etwas falsches
							// eingegeben wurde.
					}
				}
				ShotPlayer1(playerShot);

			}
		} else {
			player1Turn = true;

			ListIterator<Location> i = player2Shots.listIterator();

			if (!i.hasNext()) {
				ShotPlayer2(playerShot);
			} else {
				while (i.hasNext()) {
					Location next = i.next();

					if (next.equals(playerShot)) {
						JOptionPane.showMessageDialog(null, "Already Shot");
						playerShot = playerShotFrame.showDialog();
						while (i.hasPrevious()) {
							i.previous();
						}
					}
				}

				ShotPlayer2(playerShot);
			}

		}

		if (player1FleetDestroyed == 5) {

			// TODO Handlings falls gewonnen
			JOptionPane.showMessageDialog(null, "Player 2 won");
			resetGame();

		} else if (player2FleetDestroyed == 5) {
			JOptionPane.showMessageDialog(null, "Player 1 won");
			resetGame();

		}

		if (player1Turn == true) {
			for (Ship ship : fleetPlayer2) {
				ship.hide();
			}

			JOptionPane.showMessageDialog(null, "Player 1 turn.");

			for (Ship ship : fleetPlayer1) {
				ship.show();
			}
		} else {
			for (Ship ship : fleetPlayer1) {
				ship.hide();
			}

			JOptionPane.showMessageDialog(null, "Player 2 turn.");

			for (Ship ship : fleetPlayer2) {
				ship.show();
			}
		}

	}

	private void resetGame() {

		backroundGameGridPlayer1.clear();
		backgroundGameGridPlayer2.clear();

		player2FleetDestroyed = 0;
		player1FleetDestroyed = 0;
		player1Turn = true;

		jBtnShoot.setVisible(false);
		jBtnSetFleetPlayer1.setEnabled(true);
		jBtnSetFleetPlayer2.setEnabled(true);
		jBtnSetFleetPlayer1.setVisible(true);
		jBtnSetFleetPlayer2.setVisible(true);
		jBtnStartGame.setVisible(true);

		for (Ship ship : fleetPlayer1) {

			jGameGridPlayer1.removeActor(ship);

			ship = null;
		}
		for (Ship ship : fleetPlayer2) {
			jGameGridPlayer1.removeActor(ship);

			ship = null;
		}
		for (Location location : player1Shots) {
			location = null;
		}
		for (Location location : player2Shots) {
			location = null;
		}

	}

	private void ShotPlayer1(Location playerShot) {
		player1Shots.add(playerShot);
		for (Ship ship : fleetPlayer2) {
			int isHitOrDestroyed = ship.isHit(playerShot);
			if (isHitOrDestroyed == 1) {
				backgroundGameGridPlayer2.fillCell(playerShot, Color.red);
				break;
			} else if (isHitOrDestroyed == 2) {
				player2FleetDestroyed++;
				backgroundGameGridPlayer2.fillCell(playerShot, Color.red);
				if (player2FleetDestroyed == 5) {
					JOptionPane.showMessageDialog(null, "Player 1 won!!");
				} else {
					JOptionPane.showMessageDialog(null, "Ship destroyed.");
				}
				break;
			} else {
				backgroundGameGridPlayer2.fillCell(playerShot, Color.yellow);
			}
		}
	}

	private void ShotPlayer2(Location playerShot) {
		GGBackground bg = jGameGridPlayer1.getBg(); //
		player2Shots.add(playerShot);
		for (Ship ship : fleetPlayer1) {
			int isHitOrDestroyed = ship.isHit(playerShot);
			if (isHitOrDestroyed == 1) {
				bg.fillCell(playerShot, Color.red);
				break;
			} else if (isHitOrDestroyed == 2) {
				player1FleetDestroyed++;
				bg.fillCell(playerShot, Color.red);
				if (player1FleetDestroyed == 5) {
					JOptionPane.showMessageDialog(null, "Player 2 won!!");
				} else {
					JOptionPane.showMessageDialog(null, "Ship destroyed.");
				}
				break;
			} else {
				bg.fillCell(playerShot, Color.yellow);
			}
		}
	}

	private void jBtnSetFleetPlayer1ActionPerformed(
			java.awt.event.ActionEvent evt) {
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

		JOptionPane.showMessageDialog(null, "Player1 ships ready.");

		for (Ship ship : fleetPlayer1) {
			ship.hide();
		}

	}

	private void jBtnSetFleetPlayer2ActionPerformed(
			java.awt.event.ActionEvent evt) {

		// TODO Schiffklassen ableiten (Carrier etc)
		FleetSetterFrame player2 = new FleetSetterFrame(null, true); // modaler
																		// Dialog
																		// zum
																		// festlegen
																		// der
																		// Schiffspositionen
		fleetPlayer2 = player2.showDialog(); // anzeigen des Dialogs
												// Rückgabewert Array aus
												// Schiffen // aus Shiffobjekten
												// // vom Dialog

		for (Ship currentActor : fleetPlayer2) {
			jGameGridPlayer2.addActor(currentActor,
					currentActor.getStartLocation());
		}
		jBtnSetFleetPlayer2.setEnabled(false);

		JOptionPane.showMessageDialog(null, "Player2 ships ready.");

		for (Ship ship : fleetPlayer2) {
			ship.hide();
		}
	}

	private void jBtnStartGameActionPerformed(java.awt.event.ActionEvent evt) {

		if (jBtnSetFleetPlayer1.isEnabled() == false
				& jBtnSetFleetPlayer2.isEnabled() == false) {
			jBtnSetFleetPlayer1.setVisible(false);
			jBtnSetFleetPlayer2.setVisible(false);
			jBtnShoot.setVisible(true);
			jBtnStartGame.setVisible(false);
			JOptionPane.showMessageDialog(null, "Player1's turn.");

			for (Ship ship : fleetPlayer1) {
				ship.show();
			}

		} else {

			JOptionPane.showMessageDialog(null,
					"Es wurden noch nicht alle Schiffe gesetzt");
		}

	}

	private void jBtnShootActionPerformed(java.awt.event.ActionEvent evt) {
		battleshipRounds();
	}

	private void jBtnGameGridResetActionPerformed(java.awt.event.ActionEvent evt) {
		int response = JOptionPane.showConfirmDialog(null,
				"Reset Game and format C ? ", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {
		} else if (response == JOptionPane.YES_OPTION) {
			resetGame();
		} else if (response == JOptionPane.CLOSED_OPTION) {
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Battleship().setVisible(true);

			}
		});

	}

}
