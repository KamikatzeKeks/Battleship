package Battleship;

import java.awt.image.CropImageFilter;
import java.io.ObjectInputStream.GetField;
import java.util.Enumeration;





import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import ch.aplu.jgamegrid.Location;

/**
 * <pre>Die FleetSetterFrame ist ein modaler JDialog zur Eingabe der Startfelder des jeweiligen Schiffstypes, 
 * sowie seines Verlaufs in einer Gradangabe 
 * 
 * <i>(0° = Verlauf rechts horizontal, 90° = Verlauf  unten vertikal, 180°=Verlauf links horizontal, 270°=Verlauf oben vertikal)</i>
 * 
 * Basierend auf dieser Eingabe werden für alle 5 Schiffstypen  (1xCarrier,2xDestroyer,1xSubmarine,1xPatrolboat) 
 * die Felder berechnet und im jeweiligen Objekt gespeichert. 
 * Die 5 Schiffstypen sind im Array fleet gespeichert.</pre>
 * 
 * @return Rückgabewert des Dialogs ist ein Array der Größe 5 aus Objekten der Klasse Schiff
 * @author Brian Korduan
 * 
 *
 */

public class FleetSetterFrame extends javax.swing.JDialog {
	


	Ship[] fleet = new Ship[5];

	/**
	 * @param parent
	 * @param modal
	 */
	public FleetSetterFrame(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jBtnGroupCarrier = new javax.swing.ButtonGroup();
		jBtnGroupDestroyer1 = new javax.swing.ButtonGroup();
		jBtnGroupDestroyer2 = new javax.swing.ButtonGroup();
		jBtnGroupSubmarine = new javax.swing.ButtonGroup();
		jBtnGroupPatrolboat = new javax.swing.ButtonGroup();
		jCbCarrierX = new javax.swing.JComboBox();
		jLPatrolboat = new javax.swing.JLabel();
		jLSubmarine = new javax.swing.JLabel();
		jCbPatrolboatY = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jCbPatrolboatX = new javax.swing.JComboBox();
		jCbDestroyer1Y = new javax.swing.JComboBox();
		jBtnSetFleet = new javax.swing.JButton();
		jCbDestroyer1X = new javax.swing.JComboBox();
		jRBtnCarrier360 = new javax.swing.JRadioButton();
		jLDestroyer1 = new javax.swing.JLabel();
		jRBtnCarrier180 = new javax.swing.JRadioButton();
		jCbDestroyer2Y = new javax.swing.JComboBox();
		jRBtnCarrier0 = new javax.swing.JRadioButton();
		jCbDestroyer2X = new javax.swing.JComboBox();
		jRBtnCarrier90 = new javax.swing.JRadioButton();
		jLDestroyer3 = new javax.swing.JLabel();
		jLCarrier = new javax.swing.JLabel();
		jCbCarrierY = new javax.swing.JComboBox();
		jCbSubmarineY = new javax.swing.JComboBox();
		jCbSubmarineX = new javax.swing.JComboBox();
		jRBtnDestroyer190 = new javax.swing.JRadioButton();
		jRBtnDestroyer10 = new javax.swing.JRadioButton();
		jRBtnDestroyer1180 = new javax.swing.JRadioButton();
		jRBtnDestroyer1270 = new javax.swing.JRadioButton();
		jRBtnDestroyer290 = new javax.swing.JRadioButton();
		jRBtnDestroyer2270 = new javax.swing.JRadioButton();
		jRBtnDestroyer2180 = new javax.swing.JRadioButton();
		jRBtnDestroyer20 = new javax.swing.JRadioButton();
		jRBtnSubmarine180 = new javax.swing.JRadioButton();
		jRBtnSubmarine0 = new javax.swing.JRadioButton();
		jRBtnSubmarine270 = new javax.swing.JRadioButton();
		jRBtnSubmarine90 = new javax.swing.JRadioButton();
		jRBtnPatrolboat180 = new javax.swing.JRadioButton();
		jRBtnPatrolboat0 = new javax.swing.JRadioButton();
		jRBtnPatrolboat270 = new javax.swing.JRadioButton();
		jRBtnPatrolboat90 = new javax.swing.JRadioButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setModal(true);
		setResizable(false);

		jCbCarrierX.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		jCbCarrierX.setSelectedIndex(0);

		jLPatrolboat.setText("PatrolBoat");

		jLSubmarine.setText("MineTurtle");

		jCbPatrolboatY
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbPatrolboatY.setSelectedIndex(4);

		jCbPatrolboatY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbPatrolboatYActionPerformed(evt);
			}
		});

		jLabel2.setBackground(new java.awt.Color(102, 102, 255));
		jLabel2.setForeground(new java.awt.Color(0, 0, 255));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Carrier");
		jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jCbPatrolboatX.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));
		jCbPatrolboatX.setSelectedIndex(0);

		jCbDestroyer1Y
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbDestroyer1Y.setSelectedIndex(1);

		jCbDestroyer1Y.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbDestroyer1YActionPerformed(evt);
			}
		});

		jBtnSetFleet.setText("Set Fleet");
		jBtnSetFleet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBtnSetFleetActionPerformed(evt);
			}
		});

		jCbDestroyer1X.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));
		jCbDestroyer1X.setSelectedIndex(0);

		jBtnGroupCarrier.add(jRBtnCarrier360);
		jRBtnCarrier360.setText("270");
		jRBtnCarrier360
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnCarrier360.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBtnCarrier360ActionPerformed(evt);
			}
		});

		jLDestroyer1.setText("Destroyer 1");

		jBtnGroupCarrier.add(jRBtnCarrier180);
		jRBtnCarrier180.setText("180");

		jCbDestroyer2Y
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbDestroyer2Y.setSelectedIndex(2);
		jCbDestroyer2Y.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbDestroyer2YActionPerformed(evt);
			}
		});

		jBtnGroupCarrier.add(jRBtnCarrier0);
		jRBtnCarrier0.setText("0");
		jRBtnCarrier0.setSelected(true);

		jCbDestroyer2X.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));
		jCbDestroyer2X.setSelectedIndex(0);

		jBtnGroupCarrier.add(jRBtnCarrier90);
		jRBtnCarrier90.setText("90");
		jRBtnCarrier0.setActionCommand("90");

		jLDestroyer3.setText("NyanCat");

		jLCarrier.setText("Carrier");

		jCbCarrierY.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbCarrierY.setSelectedIndex(0);
		jCbCarrierY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbCarrierYActionPerformed(evt);
			}
		});

		jCbSubmarineY
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbSubmarineY.setSelectedIndex(3);
		jCbSubmarineY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbSubmarineYActionPerformed(evt);
			}
		});

		jCbSubmarineX.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));
		jCbSubmarineX.setSelectedIndex(0);

		jBtnGroupDestroyer1.add(jRBtnDestroyer190);
		jRBtnDestroyer190.setText("90");

		jBtnGroupDestroyer1.add(jRBtnDestroyer10);
		jRBtnDestroyer10.setText("0");
		jRBtnDestroyer10.setSelected(true);

		jBtnGroupDestroyer1.add(jRBtnDestroyer1180);
		jRBtnDestroyer1180.setText("180");

		jBtnGroupDestroyer1.add(jRBtnDestroyer1270);
		jRBtnDestroyer1270.setText("270");
		jRBtnDestroyer1270
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnDestroyer1270
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBtnDestroyer1361ActionPerformed(evt);
					}
				});

		jBtnGroupDestroyer2.add(jRBtnDestroyer290);
		jRBtnDestroyer290.setText("90");

		jBtnGroupDestroyer2.add(jRBtnDestroyer2270);
		jRBtnDestroyer2270.setText("270");
		jRBtnDestroyer2270
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnDestroyer2270
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBtnCarrier362ActionPerformed(evt);
					}
				});

		jBtnGroupDestroyer2.add(jRBtnDestroyer2180);
		jRBtnDestroyer2180.setText("180");

		jBtnGroupDestroyer2.add(jRBtnDestroyer20);
		jRBtnDestroyer20.setText("0");
		jRBtnDestroyer20.setSelected(true);

		jBtnGroupSubmarine.add(jRBtnSubmarine180);
		jRBtnSubmarine180.setText("180");
		jRBtnSubmarine180.setContentAreaFilled(false);

		jBtnGroupSubmarine.add(jRBtnSubmarine0);
		jRBtnSubmarine0.setText("0");
		jRBtnSubmarine0.setContentAreaFilled(false);
		jRBtnSubmarine0.setSelected(true);

		jBtnGroupSubmarine.add(jRBtnSubmarine270);
		jRBtnSubmarine270.setText("270");
		jRBtnSubmarine270.setContentAreaFilled(false);
		jRBtnSubmarine270
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnSubmarine270
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBtnCarrier363ActionPerformed(evt);
					}
				});

		jBtnGroupSubmarine.add(jRBtnSubmarine90);
		jRBtnSubmarine90.setText("90");
		jRBtnSubmarine90.setContentAreaFilled(false);

		jBtnGroupPatrolboat.add(jRBtnPatrolboat180);
		jRBtnPatrolboat180.setText("180");

		jBtnGroupPatrolboat.add(jRBtnPatrolboat0);
		jRBtnPatrolboat0.setText("0");
		jRBtnPatrolboat0.setSelected(true);

		jBtnGroupPatrolboat.add(jRBtnPatrolboat270);
		jRBtnPatrolboat270.setText("270");
		jRBtnPatrolboat270
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnPatrolboat270
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBtnCarrier364ActionPerformed(evt);
					}
				});

		jBtnGroupPatrolboat.add(jRBtnPatrolboat90);
		jRBtnPatrolboat90.setText("90");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLDestroyer3)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jCbDestroyer2Y,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jCbDestroyer2X,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jRBtnDestroyer2180)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jRBtnDestroyer290)
																				.addComponent(
																						jRBtnDestroyer2270)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(70,
																										70,
																										70)
																								.addComponent(
																										jRBtnDestroyer20))))
												.addComponent(jBtnSetFleet)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLPatrolboat)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jCbPatrolboatY,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jCbPatrolboatX,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jRBtnPatrolboat180)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(70,
																										70,
																										70)
																								.addComponent(
																										jRBtnPatrolboat0))
																				.addComponent(
																						jRBtnPatrolboat270)
																				.addComponent(
																						jRBtnPatrolboat90)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jCbSubmarineY,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jCbSubmarineX,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						jLSubmarine))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jRBtnSubmarine180)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jRBtnSubmarine270)
																				.addComponent(
																						jRBtnSubmarine90)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(70,
																										70,
																										70)
																								.addComponent(
																										jRBtnSubmarine0))))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(0,
																		0,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLDestroyer1)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jCbDestroyer1Y,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jCbDestroyer1X,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addGap(32,
																										32,
																										32)
																								.addComponent(
																										jRBtnDestroyer1180)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jRBtnDestroyer190)
																												.addComponent(
																														jRBtnDestroyer1270)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(70,
																																		70,
																																		70)
																																.addComponent(
																																		jRBtnDestroyer10))))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jCbCarrierY,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jCbCarrierX,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addGap(24,
																																		24,
																																		24)
																																.addComponent(
																																		jRBtnCarrier180))
																												.addComponent(
																														jLCarrier))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jRBtnCarrier360)
																												.addComponent(
																														jRBtnCarrier90)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel2,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		62,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jRBtnCarrier0)))))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLCarrier)
												.addComponent(jRBtnCarrier360))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jCbCarrierY,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jCbCarrierX,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jRBtnCarrier180)
												.addComponent(jRBtnCarrier0)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jRBtnCarrier90)
								.addGap(7, 7, 7)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLDestroyer1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jCbDestroyer1Y,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jCbDestroyer1X,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jRBtnDestroyer1270)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnDestroyer1180)
																				.addComponent(
																						jRBtnDestroyer10))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnDestroyer190)))
								.addGap(9, 9, 9)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLDestroyer3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jCbDestroyer2Y,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jCbDestroyer2X,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jRBtnDestroyer2270)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnDestroyer2180)
																				.addComponent(
																						jRBtnDestroyer20))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnDestroyer290)))
								.addGap(21, 21, 21)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLSubmarine)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jCbSubmarineY,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jCbSubmarineX,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jRBtnSubmarine270)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnSubmarine180)
																				.addComponent(
																						jRBtnSubmarine0))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnSubmarine90)))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLPatrolboat)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jCbPatrolboatY,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jCbPatrolboatX,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jRBtnPatrolboat270)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnPatrolboat180)
																				.addComponent(
																						jRBtnPatrolboat0))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnPatrolboat90)))
								.addGap(17, 17, 17).addComponent(jBtnSetFleet)
								.addContainerGap()));
		pack();

		jBtnSetFleet.requestFocus();

	}// </editor-fold>//GEN-END:initComponents

	private void jCbPatrolboatYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbPatrolboatYActionPerformed
		//
	}// GEN-LAST:event_jCbPatrolboatYActionPerformed

	private void jCbDestroyer1YActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbDestroyer1YActionPerformed
	}// GEN-LAST:event_jCbDestroyer1YActionPerformed

	private void jBtnSetFleetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtnSetFleetActionPerformed
		defineShipSetDirection(); // Berechnet die Positionen der Schiffe anhand
									// der Eingaben
		if(crossedShipPosition()==true){
			
			JOptionPane.showMessageDialog(null, "Schiffe kreuzen sich");
			
		}else if(fleetOutOfGameGrid() ==  true) {
			
			JOptionPane.showMessageDialog(null, "Schiff außerhalb des Spielfeldes");

			
		}else {
			
			System.out.println("Crossed:  " + crossedShipPosition());
			System.out.println("outOfBorder: " +fleetOutOfGameGrid());
			setVisible(false); // schließt Dialog
			dispose();
			
			
		}
		
	}

	private void jRBtnCarrier360ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRBtnCarrier360ActionPerformed
	}

	private void jCbDestroyer2YActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbDestroyer2YActionPerformed
	}

	private void jCbCarrierYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbCarrierYActionPerformed

	}

	private void jCbSubmarineYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbSubmarineYActionPerformed
	}

	private void jRBtnDestroyer1361ActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	private void jRBtnCarrier362ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRBtnCarrier362ActionPerformed
	}

	private void jRBtnCarrier363ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRBtnCarrier363ActionPerformed
	}

	private void jRBtnCarrier364ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRBtnCarrier364ActionPerformed
	}

	public Ship[] showDialog() {
		setVisible(true);
		return fleet;
	}
	
	/**
	 * Generiert 5 Schiffsobjekte mit ihren jeweiligen Positionen. Nach dem einlesen der Startpositionen und des Winkels aus der GUI wird die Methode
	 * @see getAllShipPositions verwendet um alle Weiteren Location Objekte eines Schiffes zu erzeugen. 
	 * Beispiel: Carrier auf A1 bei 0 ° (>)  daraus ergibt sich das Startfeld Location(0,0) und die weiteren Locations: Location(1,0), Location(2,0),Location(3,0),Location(4,0)
	 */

	public void defineShipSetDirection() {

		String selectedCarrierAngle;
		String selectedDestroyer1Angle;
		String selectedDestroyer2Angle;
		String selectedSubmarineAngle;
		String selectedPatrolboatAngle;
		Location[] carrierPositions;
		Location[] destroyer1Positions;
		Location[] destroyer2Positions;
		Location[] submarinePositions;
		Location[] patrolboatPositions;

		Location[] shipsStartPositions = new Location[5];

		// Liest aus der GUI für jedes Schiff die festgelegte Startposition
		shipsStartPositions[0] = new Location(jCbCarrierX.getSelectedIndex(),
				jCbCarrierY.getSelectedIndex());
		shipsStartPositions[1] = new Location(
				jCbDestroyer1X.getSelectedIndex(),
				jCbDestroyer1Y.getSelectedIndex());
		shipsStartPositions[2] = new Location(
				jCbDestroyer2X.getSelectedIndex(),
				jCbDestroyer2Y.getSelectedIndex());
		shipsStartPositions[3] = new Location(jCbSubmarineX.getSelectedIndex(),
				jCbSubmarineY.getSelectedIndex());
		shipsStartPositions[4] = new Location(
				jCbPatrolboatX.getSelectedIndex(),
				jCbPatrolboatY.getSelectedIndex());

		// Liest für jedes Schiff den in der GUI festgelegten Winkel
		selectedCarrierAngle = getSelectedJRadioBtn(jBtnGroupCarrier);
		selectedDestroyer1Angle = getSelectedJRadioBtn(jBtnGroupDestroyer1);
		selectedDestroyer2Angle = getSelectedJRadioBtn(jBtnGroupDestroyer2);
		selectedSubmarineAngle = getSelectedJRadioBtn(jBtnGroupSubmarine);
		selectedPatrolboatAngle = getSelectedJRadioBtn(jBtnGroupPatrolboat);

		// Generiert für jeden Schiffstyp die je nach Startposition und Winkel
		// zugehörigen Koordinaten auf dem Spielfeld
		carrierPositions = getAllShipPositions(shipsStartPositions[0],
				selectedCarrierAngle, 5);
		destroyer1Positions = getAllShipPositions(shipsStartPositions[1],
				selectedDestroyer1Angle, 4);
		destroyer2Positions = getAllShipPositions(shipsStartPositions[2],
				selectedDestroyer2Angle, 4);
		submarinePositions = getAllShipPositions(shipsStartPositions[3],
				selectedSubmarineAngle, 3);
		patrolboatPositions = getAllShipPositions(shipsStartPositions[4],
				selectedPatrolboatAngle, 2);

		// TODO zu Ints ummünzen
		// TODO Überprüfung, dass Schiffe nicht auf den selben Feldern stehen
		fleet[0] = new Carrier(Integer.parseInt(selectedCarrierAngle), 5,
				carrierPositions);
		fleet[1] = new Destroyer(Integer.parseInt(selectedDestroyer1Angle), 4,
				destroyer1Positions);
		fleet[2] = new Destroyer(Integer.parseInt(selectedDestroyer2Angle), 4,
				destroyer2Positions);
		fleet[3] = new Submarine(Integer.parseInt(selectedSubmarineAngle), 3,
				submarinePositions);
		fleet[4] = new Patrolboat(Integer.parseInt(selectedPatrolboatAngle), 2,
				patrolboatPositions);

	}

	// TODO diese Funktion verstehen
	private String getSelectedJRadioBtn(ButtonGroup buttonGroup) {

		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons
				.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				return button.getText();
			}
		}

		return null;

	}
/**Generiert weitere Felder eines Schifftyp basierend auf der Start Location und der Richtung in Grad 
 * 0° >
 * 90° v
 * 180°<
 * 270° >
 * @param startPosition 
 * @param angle
 * @param shipLength
 * @return Location[] Gibt ein Array aus Objekten der Klasse Location (X und Y-Wert auf dem Spielfeld) zurück, welche zu einem bestimmten Schiffstyp gehören
 */
	private Location[] getAllShipPositions(Location startPosition,
			String angle, int shipLength) {
		Location[] shipLocations = new Location[shipLength]; // Erstellt ein //
																// Array aus //
																// Locations(x
																// und y-Werte
																// // auf dem //
																// Spielfeld) je
																// nach
																// Schiffsgröße

		shipLength--; // Verringert die Schiffslänge um 1 damit nicht außerhalb
						// des Arrays versucht wird zu schreiben
		shipLocations[shipLength] = startPosition; // Speichert die
													// Startposition des
													// Schiffes an letzter
													// Stelle des Arrays
		shipLength--;

		while (shipLength >= 0) {
			switch (angle) { //
			case "0":
				shipLocations[shipLength] = new Location(
						shipLocations[shipLength + 1].getX()+1,
						shipLocations[shipLength + 1].getY());
				break;
			case "90":
				shipLocations[shipLength] = new Location(
						shipLocations[shipLength + 1].getX(),
						shipLocations[shipLength + 1].getY()+1);
				break;
			case "180":
				shipLocations[shipLength] = new Location(
						shipLocations[shipLength + 1].getX() - 1,
						shipLocations[shipLength + 1].getY() );
				break;
			case "270":
				shipLocations[shipLength] = new Location(
						shipLocations[shipLength + 1].getX() ,
						shipLocations[shipLength + 1].getY() - 1);
				break;
			}
			shipLength--;
		}
		return shipLocations;
	}

	/**
	 * Überprüft ob ein Schiff des Arrays fleet außerhalb des Spielfeldes ist
	 * @param void
	 * @return Boolean (true =  ein Schiff befindet sich außerhalb des Spielfeldes, false= Alle Schiffe befinden sich im Spielfeld)
	 * @author Brian Korduan
	 */
	
	private Boolean fleetOutOfGameGrid() {

		Boolean outOfGameGrid = false;

		for (Ship ship : fleet) {
			for (Location location : ship.getShipPositions()) {
				if (location.getX() < 0 || location.getY() < 0) {
					outOfGameGrid = true;
					return outOfGameGrid;
				} else {
					outOfGameGrid = false;
				}

			}
		}

		return outOfGameGrid;
	}

	/**
	 * Überprüft ob Schiffe innerhalb des Arrays fleet die selbe Position haben und somit die Positionierung unzulässig ist
	 * 
	 * @param void
	 * @return Boolean (true = Schiffe kreuzen sich, false = Schiffe kreuzen sich nicht)
	 * @author Brian Korduan
	 */
	private Boolean crossedShipPosition() { 

		Boolean crossedPosition = false;

		for (Ship firstShip : fleet) {
			for (Ship nextShip : fleet) {
				if (firstShip.equals(nextShip)) { //Damit nicht Ein Carrier aus dem ersten Array mit dem Carrier aus dem 2. Array verglichen wird. Dies würde immer zu einem true führen

				} else {
					
					/*
					 * Jede Position eines Schiffes wird mit jeder Position eines anderen Schiffes verglichen 
					 * im Falle, dass zwei Positionen übereinstimmen wird true zurückgegeben für "Ja Schiffe kreuzen sich"
					 */
					
					for (Location firstShipPosition : firstShip 
							.getShipPositions()) {
						for (Location secondShipPosition : nextShip
								.getShipPositions()) {
							if (firstShipPosition.equals(secondShipPosition)) {
								crossedPosition = true;
								return crossedPosition;
							} else {
								crossedPosition = false;
							}
						}
					}
				}
			}
		}

		return crossedPosition;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup jBtnGroupCarrier;
	private javax.swing.ButtonGroup jBtnGroupDestroyer1;
	private javax.swing.ButtonGroup jBtnGroupDestroyer2;
	private javax.swing.ButtonGroup jBtnGroupPatrolboat;
	private javax.swing.ButtonGroup jBtnGroupSubmarine;
	private javax.swing.JButton jBtnSetFleet;
	private javax.swing.JComboBox jCbCarrierX;
	private javax.swing.JComboBox jCbCarrierY;
	private javax.swing.JComboBox jCbDestroyer1X;
	private javax.swing.JComboBox jCbDestroyer1Y;
	private javax.swing.JComboBox jCbDestroyer2X;
	private javax.swing.JComboBox jCbDestroyer2Y;
	private javax.swing.JComboBox jCbPatrolboatX;
	private javax.swing.JComboBox jCbPatrolboatY;
	private javax.swing.JComboBox jCbSubmarineX;
	private javax.swing.JComboBox jCbSubmarineY;
	private javax.swing.JLabel jLCarrier;
	private javax.swing.JLabel jLDestroyer1;
	private javax.swing.JLabel jLDestroyer3;
	private javax.swing.JLabel jLPatrolboat;
	private javax.swing.JLabel jLSubmarine;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JRadioButton jRBtnCarrier0;
	private javax.swing.JRadioButton jRBtnCarrier180;
	private javax.swing.JRadioButton jRBtnDestroyer2180;
	private javax.swing.JRadioButton jRBtnSubmarine180;
	private javax.swing.JRadioButton jRBtnPatrolboat180;
	private javax.swing.JRadioButton jRBtnDestroyer20;
	private javax.swing.JRadioButton jRBtnSubmarine0;
	private javax.swing.JRadioButton jRBtnCarrier360;
	private javax.swing.JRadioButton jRBtnDestroyer2270;
	private javax.swing.JRadioButton jRBtnSubmarine270;
	private javax.swing.JRadioButton jRBtnPatrolboat270;
	private javax.swing.JRadioButton jRBtnPatrolboat0;
	private javax.swing.JRadioButton jRBtnCarrier90;
	private javax.swing.JRadioButton jRBtnDestroyer290;
	private javax.swing.JRadioButton jRBtnSubmarine90;
	private javax.swing.JRadioButton jRBtnPatrolboat90;
	private javax.swing.JRadioButton jRBtnDestroyer10;
	private javax.swing.JRadioButton jRBtnDestroyer1180;
	private javax.swing.JRadioButton jRBtnDestroyer1270;
	private javax.swing.JRadioButton jRBtnDestroyer190;
}
