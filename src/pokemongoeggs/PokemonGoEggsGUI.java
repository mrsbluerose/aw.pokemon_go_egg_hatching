/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 */

package pokemongoeggs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;

class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	private String[] distanceNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private MasterList masterList = new MasterList();
	private Inventory inventory = new Inventory();
	private DecimalFormat df = new DecimalFormat("#.#");

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PokemonGoEggsGUI window = new PokemonGoEggsGUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**********************************************************************
	 * Create the application.
	 **********************************************************************/
	PokemonGoEggsGUI() {
		initialize();
		//frame.setVisible(true);
	}

	/**********************************************************************
	 * Initialize the contents of the frame.
	 **********************************************************************/
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 517);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		/**********************************************************************
		 * Create text areas and tables
		 **********************************************************************/
		//Instructions pane
		JTextArea textAreaInstructions = new JTextArea();
		textAreaInstructions.setBounds(273, 43, 164, 70);
		frame.getContentPane().add(textAreaInstructions);
		
		//Results pane
		JScrollPane scrollPaneResults = new JScrollPane();
		scrollPaneResults.setBounds(12, 260, 426, 180);
		frame.getContentPane().add(scrollPaneResults);
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 322, 426, 198);
		scrollPaneResults.add(textAreaResults);
		scrollPaneResults.setViewportView(textAreaResults);
				
		/**********************************************************************
		 * Create Egg information panel
		 **********************************************************************/
		JPanel panelEggOptions = new JPanel();
		panelEggOptions.setBounds(12, 161, 423, 55);
		frame.getContentPane().add(panelEggOptions);
		panelEggOptions.setLayout(null);
		panelEggOptions.setVisible(false);
		
		//Egg Type
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		lblEggType.setBounds(12, 0, 128, 26);
		panelEggOptions.add(lblEggType);
		
		JComboBox comboBoxEggType = new JComboBox(masterList.getEggCollection());
		comboBoxEggType.insertItemAt("", 0);
		comboBoxEggType.setSelectedIndex(0);
		comboBoxEggType.setBackground(Color.WHITE);
		comboBoxEggType.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBoxEggType.getSelectedItem() != null) {
					btnAddEgg.setVisible(true);
				}
			}
		});
		comboBoxEggType.setBounds(149, 1, 98, 24);
		panelEggOptions.add(comboBoxEggType);
		
		//Incubator Type
		JLabel lblIncubatorType = new JLabel("Incubator Type");
		lblIncubatorType.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncubatorType.setBounds(12, 27, 128, 26);
		panelEggOptions.add(lblIncubatorType);
		
		JComboBox comboBoxIncubatorType = new JComboBox(masterList.getIncubatorCollection());
		comboBoxIncubatorType.setBackground(Color.WHITE);
		comboBoxIncubatorType.setBounds(149, 28, 98, 24);
		panelEggOptions.add(comboBoxIncubatorType);
		
		//Distance walked
		JLabel lblDistanceWalked = new JLabel("Distance Walked");
		lblDistanceWalked.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistanceWalked.setBackground(Color.WHITE);
		lblDistanceWalked.setBounds(283, 0, 128, 26);
		panelEggOptions.add(lblDistanceWalked);
		
		JLabel lblDecimal = new JLabel(".");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDecimal.setBounds(334, 29, 18, 19);
		panelEggOptions.add(lblDecimal);

		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedNumber.setBackground(Color.WHITE);
		comboBoxDistanceWalkedNumber.setBounds(283, 28, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedNumber);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedDecimal.setBackground(Color.WHITE);
		comboBoxDistanceWalkedDecimal.setBounds(356, 28, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedDecimal);
		
		
		
		/**********************************************************************
		 * Create Event Panel
		 **********************************************************************/
		JPanel panelEvent = new JPanel();
		panelEvent.setBounds(12, 135, 426, 24);
		frame.getContentPane().add(panelEvent);
		panelEvent.setLayout(null);
		
		JComboBox comboBoxEventWalkingDistance = new JComboBox(masterList.getEventCollection());
		comboBoxEventWalkingDistance.setBounds(336, 0, 90, 24);
		panelEvent.add(comboBoxEventWalkingDistance);
		comboBoxEventWalkingDistance.setBackground(Color.WHITE);
		panelEvent.setVisible(false);
		
		JLabel lblEventWalkingDistance = new JLabel("What is the event walking distance multiplier?");
		lblEventWalkingDistance.setBounds(0, 0, 341, 24);
		panelEvent.add(lblEventWalkingDistance);
		
		/**********************************************************************
		 * Creates main menu
		 **********************************************************************/
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(12, 12, 426, 23);
		frame.getContentPane().add(lblMenu);
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg table");
		buttonGroupMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(false);
				textAreaInstructions.setText(displayInstructions(1));
				textAreaResults.setText(null);		
			}
		});
		rdbtnDisplayTable.setBounds(22, 43, 243, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate egg hatching");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				textAreaInstructions.setText(displayInstructions(2));
				textAreaResults.setText(null);		
			}
		});
		rdbtnCalculateEgg.setBounds(22, 70, 243, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for up to 9 eggs");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				textAreaInstructions.setText(displayInstructions(3));
				textAreaResults.setText(null);
			}
		});
		rdbtnCreatePlan.setBounds(22, 97, 243, 23);
		frame.getContentPane().add(rdbtnCreatePlan);
		
		/**********************************************************************
		 * Creates reset and exit buttons 
		 **********************************************************************/
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(false);
				panelEggOptions.setVisible(false);				
				buttonGroupMenu.clearSelection();
				textAreaInstructions.setText(null);
				textAreaResults.setText(null);
				comboBoxEventWalkingDistance.setSelectedIndex(0);
				comboBoxEggType.setSelectedIndex(0);
				comboBoxIncubatorType.setSelectedIndex(0);
				comboBoxDistanceWalkedNumber.setSelectedIndex(0);
				comboBoxDistanceWalkedDecimal.setSelectedIndex(0);

			}
		});
		btnReset.setBounds(255, 450, 85, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(352, 450, 85, 25);
		frame.getContentPane().add(btnExit);
		
		/**********************************************************************
		 * Creates button to add another egg
		 **********************************************************************/
		JButton btnAddEgg = new JButton("Add another egg");
		btnAddEgg.setVisible(false);
		//creates action for add egg button
				btnAddEgg.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						textAreaResults.append(comboBoxEggType.getSelectedItem() + "\t" + comboBoxIncubatorType.getSelectedItem() + 
								"\t" + comboBoxDistanceWalkedNumber.getSelectedItem() + "." + comboBoxDistanceWalkedDecimal.getSelectedItem() + "\n");
						comboBoxEggType.setSelectedItem(0);
						comboBoxIncubatorType.setSelectedItem(0);
						comboBoxDistanceWalkedNumber.setSelectedItem(0);
						comboBoxDistanceWalkedDecimal.setSelectedItem(0);
					}
				});
		btnAddEgg.setBounds(55, 223, 159, 25);
		frame.getContentPane().add(btnAddEgg);
		
		/**********************************************************************
		 * Create Display result button and perform actions based on selections
		 **********************************************************************/
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddEgg.setVisible(false);
				if(rdbtnDisplayTable.isSelected()) {
					
					//This code builds the table data and header arrays
					String[][] tableData = BuildTable((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(), masterList);
					String[] headers = BuildHeaders(masterList);

					//print out table
					//Column headers
					textAreaResults.append("\t\t");
					for (int i=0; i<headers.length; i++) {
						textAreaResults.append(headers[i] + "\t");
					}
					textAreaResults.append("\n");
					
					//Table rows with row header
					for (int i=0; i<tableData.length; i++) {
						textAreaResults.append(headers[i] + ": place at \t");;
						for (int j=0; j<tableData.length; j++) {
							textAreaResults.append(tableData[i][j] + "\t");
						}
						textAreaResults.append("\n");
					}
				}
				
				//TODO: decide how to prevent negatives (only allow correct distances?)
				else if(rdbtnCalculateEgg.isSelected()) {
					textAreaResults.append("The " + (EggsNew)comboBoxEggType.getSelectedItem() + " egg will hatch in " + 
							df.format(calculateEgg((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(), 
							(EggsNew)comboBoxEggType.getSelectedItem(), 
							(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(), 
							Integer.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem()), 
							Integer.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))) + " KM\n");
				}
				else {
					
				}
			}


		});
		btnDisplayResults.setBounds(226, 223, 164, 25);
		frame.getContentPane().add(btnDisplayResults);
		

	}
	
	/**********************************************************************
	 * 
	 * Pokemon Go Eggs GUI methods
	 * 
	 **********************************************************************/
	
	/**********************************************************************
	 * Holds instruction strings
	 **********************************************************************/
	private String displayInstructions(int choice) {
		String result = "";
		
		switch(choice) {
			case 1: result = "Enter the event multiplier\nand click \"display results\"";
					break;
			case 2: result = "Enter the event multiplier and egg information.\n"
						+ "If you want to enter more than one egg, click \"enter another egg\"\n"
						+ "When you are finished, click \"display results\"";
					break;
			case 3: result = "Enter the event multiplier and egg information.\n" 
								+ "If you want to enter more than one egg, click \"enter another egg\"\n"
								+ "When you are finished, click \"display results\"";
					break;			default: result = "error";
		}
		
		return result;
	}
	
	/**********************************************************************
	 * Calculate when an egg will hatch
	 **********************************************************************/
	private double calculateEgg(EventMultiplier event, EggsNew egg, IncubatorsNew incubator, Integer distance1, Integer distance2) {
		double distance = (distance1 + (distance2/10));			
		return (event.getMultiplier() * egg.getEggWalkingDistance() * incubator.getIncubatorMultiplier())- distance;
	}
	
	/**********************************************************************
	 * Build table arrays
	 **********************************************************************/
	
	private String[][] BuildTable(EventMultiplier multiplier, MasterList list){
		double answer;
		EggsNew[] eggs = list.getEggCollection();
		IncubatorsNew[] incubators = list.getIncubatorCollection();
		int length = eggs.length * incubators.length;
		
		//build array of egg walking distances in each type of incubator
		double[] eggsArray = new double[length];
		for (int i=0; i<eggsArray.length;){
			for (int j=0; j<incubators.length; j++) {
				for (int k=0; k<eggs.length; k++) {
					eggsArray[i] = incubators[j].getIncubatorMultiplier() * eggs[k].getEggWalkingDistance() * multiplier.getMultiplier();
					i++;
				}	 
			}
		}
		
		//build table array with each row showing when to put that eggy type in compared to that column's egg type
		String[][] eggIncubateDistances = new String[eggsArray.length][eggsArray.length];
		for (int i = 0; i < eggsArray.length; i++) {
			for (int j = 0; j < eggsArray.length; j++) {
				
				//Round the numbers before subtracting to match the game's math. 
				answer = (Math.round(eggsArray[j] * 10) / 10.0) - (Math.round(eggsArray[i] * 10) / 10.0);
				if (answer > 0) {
					eggIncubateDistances[i][j] = df.format(answer).toString() + " KM"; //use decimal format to return a single decimal place
				} else if (answer == 0) {
					eggIncubateDistances[i][j] = "same time"; //indicates the eggs go in at the same time
				} else {
					eggIncubateDistances[i][j] = "********"; //indicates the current egg is at a shorter distance than the prospective egg
				}
			}
		}
		return eggIncubateDistances;
	}	
	
	//Headers Array
	private String[] BuildHeaders(MasterList list) {
		EggsNew[] eggs = list.getEggCollection();
		IncubatorsNew[] incubators = list.getIncubatorCollection();
		int length = list.getEggCollection().length * list.getIncubatorCollection().length;
		
		//Build an array of egg names for each type of incubator
		String[] headers = new String[length];
		for (int i=0; i<headers.length;){
			for (int j=0; j<incubators.length; j++) {
				for (int k=0; k<eggs.length; k++) {
					headers[i] = incubators[j].getName() + " " +  eggs[k].getName();
					i++;
				}	 
			}
		}
		return headers;
	}
}
