package Battleship;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import ch.aplu.jgamegrid.Location;

public class FleetSetterFrame extends javax.swing.JDialog {

	Ship[] fleet = new Ship[5];

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
		jBtnGroupPatrolBoat = new javax.swing.ButtonGroup();
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
		jRBtnDestroyer1361 = new javax.swing.JRadioButton();
		jRBtnCarrier92 = new javax.swing.JRadioButton();
		jRBtnCarrier362 = new javax.swing.JRadioButton();
		jRBtnCarrier182 = new javax.swing.JRadioButton();
		jRBtnDestroyer20 = new javax.swing.JRadioButton();
		jRBtnCarrier183 = new javax.swing.JRadioButton();
		jRBtnSubmarine0 = new javax.swing.JRadioButton();
		jRBtnCarrier363 = new javax.swing.JRadioButton();
		jRBtnCarrier93 = new javax.swing.JRadioButton();
		jRBtnCarrier184 = new javax.swing.JRadioButton();
		jRBtnPatrolboat0 = new javax.swing.JRadioButton();
		jRBtnCarrier364 = new javax.swing.JRadioButton();
		jRBtnCarrier94 = new javax.swing.JRadioButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setModal(true);
		setResizable(false);

		jCbCarrierX.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		jLPatrolboat.setText("PatrolBoat");

		jLSubmarine.setText("MineTurtle");

		jCbPatrolboatY
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
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

		jCbDestroyer1Y
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
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

		jBtnGroupCarrier.add(jRBtnCarrier90);
		jRBtnCarrier90.setText("90");
		jRBtnCarrier0.setActionCommand("90");

		jLDestroyer3.setText("NyanCat");

		jLCarrier.setText("Carrier");

		jCbCarrierY.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbCarrierY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbCarrierYActionPerformed(evt);
			}
		});

		jCbSubmarineY
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
		jCbSubmarineY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCbSubmarineYActionPerformed(evt);
			}
		});

		jCbSubmarineX.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));

		jBtnGroupDestroyer1.add(jRBtnDestroyer190);
		jRBtnDestroyer190.setText("90");

		jBtnGroupDestroyer1.add(jRBtnDestroyer10);
		jRBtnDestroyer10.setText("0");
		jRBtnDestroyer10.setSelected(true);

		jBtnGroupDestroyer1.add(jRBtnDestroyer1180);
		jRBtnDestroyer1180.setText("180");

		jBtnGroupDestroyer1.add(jRBtnDestroyer1361);
		jRBtnDestroyer1361.setText("270");
		jRBtnDestroyer1361
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnDestroyer1361
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBtnDestroyer1361ActionPerformed(evt);
					}
				});

		jBtnGroupDestroyer2.add(jRBtnCarrier92);
		jRBtnCarrier92.setText("90");

		jBtnGroupDestroyer2.add(jRBtnCarrier362);
		jRBtnCarrier362.setText("270");
		jRBtnCarrier362
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnCarrier362.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBtnCarrier362ActionPerformed(evt);
			}
		});

		jBtnGroupDestroyer2.add(jRBtnCarrier182);
		jRBtnCarrier182.setText("180");

		jBtnGroupDestroyer2.add(jRBtnDestroyer20);
		jRBtnDestroyer20.setText("0");
		jRBtnDestroyer20.setSelected(true);

		jBtnGroupSubmarine.add(jRBtnCarrier183);
		jRBtnCarrier183.setText("180");
		jRBtnCarrier183.setContentAreaFilled(false);

		jBtnGroupSubmarine.add(jRBtnSubmarine0);
		jRBtnSubmarine0.setText("0");
		jRBtnSubmarine0.setContentAreaFilled(false);
		jRBtnSubmarine0.setSelected(true);

		jBtnGroupSubmarine.add(jRBtnCarrier363);
		jRBtnCarrier363.setText("270");
		jRBtnCarrier363.setContentAreaFilled(false);
		jRBtnCarrier363
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnCarrier363.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBtnCarrier363ActionPerformed(evt);
			}
		});

		jBtnGroupSubmarine.add(jRBtnCarrier93);
		jRBtnCarrier93.setText("90");
		jRBtnCarrier93.setContentAreaFilled(false);

		jBtnGroupPatrolBoat.add(jRBtnCarrier184);
		jRBtnCarrier184.setText("180");

		jBtnGroupPatrolBoat.add(jRBtnPatrolboat0);
		jRBtnPatrolboat0.setText("0");
		jRBtnPatrolboat0.setSelected(true);

		jBtnGroupPatrolBoat.add(jRBtnCarrier364);
		jRBtnCarrier364.setText("270");
		jRBtnCarrier364
				.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jRBtnCarrier364.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBtnCarrier364ActionPerformed(evt);
			}
		});

		jBtnGroupPatrolBoat.add(jRBtnCarrier94);
		jRBtnCarrier94.setText("90");

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
																		jRBtnCarrier182)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jRBtnCarrier92)
																				.addComponent(
																						jRBtnCarrier362)
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
																		jRBtnCarrier184)
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
																						jRBtnCarrier364)
																				.addComponent(
																						jRBtnCarrier94)))
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
																		jRBtnCarrier183)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jRBtnCarrier363)
																				.addComponent(
																						jRBtnCarrier93)
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
																														jRBtnDestroyer1361)
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
																		jRBtnDestroyer1361)
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
																		jRBtnCarrier362)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnCarrier182)
																				.addComponent(
																						jRBtnDestroyer20))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnCarrier92)))
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
																		jRBtnCarrier363)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnCarrier183)
																				.addComponent(
																						jRBtnSubmarine0))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnCarrier93)))
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
																		jRBtnCarrier364)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRBtnCarrier184)
																				.addComponent(
																						jRBtnPatrolboat0))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jRBtnCarrier94)))
								.addGap(17, 17, 17).addComponent(jBtnSetFleet)
								.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jCbPatrolboatYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbPatrolboatYActionPerformed
		// 
	}// GEN-LAST:event_jCbPatrolboatYActionPerformed

	private void jCbDestroyer1YActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCbDestroyer1YActionPerformed
	}// GEN-LAST:event_jCbDestroyer1YActionPerformed

	private void jBtnSetFleetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtnSetFleetActionPerformed
		defineShipSetDirection(); //Berechnet die Positionen der Schiffe anhand der Eingaben
		setVisible(false); // schließt Dialog
		dispose();
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
		shipsStartPositions[0] = new Location(jCbCarrierX.getSelectedIndex(),jCbCarrierY.getSelectedIndex());
		shipsStartPositions[1] = new Location(jCbDestroyer1X.getSelectedIndex(),jCbDestroyer1Y.getSelectedIndex());
		shipsStartPositions[2] = new Location(jCbDestroyer2X.getSelectedIndex(),jCbDestroyer2Y.getSelectedIndex());
		shipsStartPositions[3] = new Location(jCbSubmarineX.getSelectedIndex(),jCbSubmarineY.getSelectedIndex());
		shipsStartPositions[4] = new Location(jCbPatrolboatX.getSelectedIndex(),jCbPatrolboatY.getSelectedIndex());

		// Liest für jedes Schiff den in der GUI festgelegten Winkel
		selectedCarrierAngle = getSelectedJRadioBtn(jBtnGroupCarrier);
		selectedDestroyer1Angle = getSelectedJRadioBtn(jBtnGroupDestroyer1);
		selectedDestroyer2Angle = getSelectedJRadioBtn(jBtnGroupDestroyer2);
		selectedSubmarineAngle = getSelectedJRadioBtn(jBtnGroupSubmarine);
		selectedPatrolboatAngle = getSelectedJRadioBtn(jBtnGroupPatrolBoat);

		// Generiert für jeden Schiffstyp die je nach Startposition und Winkel
		// zugehörigen Koordinaten auf dem Spielfeld
		carrierPositions = getAllShipPositions(shipsStartPositions[0],selectedCarrierAngle, 5);
		destroyer1Positions = getAllShipPositions(shipsStartPositions[1],selectedDestroyer1Angle, 4);
		destroyer2Positions = getAllShipPositions(shipsStartPositions[2],selectedDestroyer2Angle, 4);
		submarinePositions = getAllShipPositions(shipsStartPositions[3],selectedSubmarineAngle, 3);
		patrolboatPositions = getAllShipPositions(shipsStartPositions[4],selectedPatrolboatAngle, 2);

		// TODO zu Ints ummünzen
		//TODO Überprüfung, dass Schiffe nicht auf den selben Feldern stehen 
		fleet[0] = new Carrier(Integer.parseInt(selectedCarrierAngle), 5,carrierPositions);
		fleet[1] = new Destroyer(Integer.parseInt(selectedDestroyer1Angle), 4,destroyer1Positions);
		fleet[2] = new Destroyer(Integer.parseInt(selectedDestroyer2Angle), 4,destroyer2Positions);
		fleet[3] = new Submarine(Integer.parseInt(selectedSubmarineAngle), 3,submarinePositions);
		fleet[4] = new Patrolboat(Integer.parseInt(selectedPatrolboatAngle), 2,patrolboatPositions);

	}
	
	//TODO diese Funktion verstehen
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

	private Location[] getAllShipPositions(Location startPosition, String angle, int shipLength) {
		// TODO 360 er Buttons in 270er umbennen ...
		Location[] shipLocations = new Location[shipLength]; 	//Erstellt ein Array aus Locations(x und y-Werte auf dem Spielfeld) je nach Schiffsgröße

		shipLength--; 												//Verringert die Schiffslänge um 1 damit nicht außerhalb des Arrays versucht wird zu schreiben
		shipLocations[shipLength] = startPosition;						//Speichert die Startposition des Schiffes an letzter Stelle des Arrays
		shipLength--;												

		while (shipLength >= 0) {
			// TODO oberstes linkes Spielfeld = x 0 y= 0? Wenn nein den index+1
			switch (angle) { //
			case "0":
				shipLocations[shipLength] = new Location(shipLocations[shipLength + 1].getX(),shipLocations[shipLength + 1].getY() + 1);
				break;
			case "90":
				shipLocations[shipLength] = new Location(shipLocations[shipLength + 1].getX() + 1,shipLocations[shipLength + 1].getY());
				break;
			case "180":
				shipLocations[shipLength] = new Location(shipLocations[shipLength + 1].getX() + 2,shipLocations[shipLength + 1].getY() + 1);
				break;
			case "270":
				shipLocations[shipLength] = new Location(shipLocations[shipLength + 1].getX() + 1,shipLocations[shipLength + 1].getY() + 2);
				break;
				//TODO Fokus setzen für Default
			}
			shipLength--;
		}
		return shipLocations;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup jBtnGroupCarrier;
	private javax.swing.ButtonGroup jBtnGroupDestroyer1;
	private javax.swing.ButtonGroup jBtnGroupDestroyer2;
	private javax.swing.ButtonGroup jBtnGroupPatrolBoat;
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
	private javax.swing.JRadioButton jRBtnCarrier182;
	private javax.swing.JRadioButton jRBtnCarrier183;
	private javax.swing.JRadioButton jRBtnCarrier184;
	private javax.swing.JRadioButton jRBtnDestroyer20;
	private javax.swing.JRadioButton jRBtnSubmarine0;
	private javax.swing.JRadioButton jRBtnCarrier360;
	private javax.swing.JRadioButton jRBtnCarrier362;
	private javax.swing.JRadioButton jRBtnCarrier363;
	private javax.swing.JRadioButton jRBtnCarrier364;
	private javax.swing.JRadioButton jRBtnPatrolboat0;
	private javax.swing.JRadioButton jRBtnCarrier90;
	private javax.swing.JRadioButton jRBtnCarrier92;
	private javax.swing.JRadioButton jRBtnCarrier93;
	private javax.swing.JRadioButton jRBtnCarrier94;
	private javax.swing.JRadioButton jRBtnDestroyer10;
	private javax.swing.JRadioButton jRBtnDestroyer1180;
	private javax.swing.JRadioButton jRBtnDestroyer1361;
	private javax.swing.JRadioButton jRBtnDestroyer190;
}
