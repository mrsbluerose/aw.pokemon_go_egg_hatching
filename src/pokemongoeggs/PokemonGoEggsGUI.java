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
import java.util.Arrays;
import java.util.Comparator;
import java.awt.event.ItemEvent;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;

class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	//private String[] distanceNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private MasterList masterList = new MasterList();
	//private Inventory inventory = new Inventory();
	private EggsNew[] eggList;// = new EggsNew[masterList.getMaxEggAllowed()];
	private int eggCount = 1;
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
		frame.setBounds(100, 100, 450, 537);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		/**********************************************************************
		 * Create text areas and tables
		 **********************************************************************/
		//Instructions pane
		JTextArea textAreaInstructions = new JTextArea();
		textAreaInstructions.setBounds(273, 27, 164, 70);
		frame.getContentPane().add(textAreaInstructions);
		
		//Results pane
		JScrollPane scrollPaneResults = new JScrollPane();
		scrollPaneResults.setBounds(11, 295, 426, 170);
		frame.getContentPane().add(scrollPaneResults);
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 322, 426, 198);
		scrollPaneResults.add(textAreaResults);
		scrollPaneResults.setViewportView(textAreaResults);

		/**********************************************************************
		 * Create Event Panel
		 **********************************************************************/
		JPanel panelEvent = new JPanel();
		panelEvent.setBounds(11, 109, 426, 24);
		frame.getContentPane().add(panelEvent);
		panelEvent.setLayout(null);
		panelEvent.setVisible(false);
		
		JComboBox comboBoxEventWalkingDistance = new JComboBox(masterList.getEventCollection());
		comboBoxEventWalkingDistance.setBounds(336, 0, 90, 24);
		panelEvent.add(comboBoxEventWalkingDistance);
		comboBoxEventWalkingDistance.setBackground(Color.WHITE);

		JLabel lblEventWalkingDistance = new JLabel("What is the event walking distance multiplier?");
		lblEventWalkingDistance.setBounds(0, 0, 341, 24);
		panelEvent.add(lblEventWalkingDistance);
		
		/**********************************************************************
		 * Create Egg Count Panel
		 **********************************************************************/
		
		JPanel panelEggCount = new JPanel();
		panelEggCount.setBounds(14, 141, 423, 24);
		frame.getContentPane().add(panelEggCount);
		panelEggCount.setLayout(null);
		panelEggCount.setVisible(false);
		
		JLabel lblEggcount = new JLabel("How many eggs will there be total?");
		lblEggcount.setBounds(5, 9, 250, 15);
		panelEggCount.add(lblEggcount);
		lblEggcount.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox comboBoxEggCount = new JComboBox(masterList.getMaxEggsAllowedNumbers());
		comboBoxEggCount.setBounds(336,0, 36, 24);
		panelEggCount.add(comboBoxEggCount);
		comboBoxEggCount.setBackground(Color.WHITE);
		
		/**********************************************************************
		 * Create Egg information panel
		 **********************************************************************/
		JPanel panelEggOptions = new JPanel();
		panelEggOptions.setBounds(14, 177, 249, 82);
		frame.getContentPane().add(panelEggOptions);
		panelEggOptions.setLayout(null);
		panelEggOptions.setVisible(false);
		
		//Egg Type
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		lblEggType.setBounds(0, -1, 117, 26);
		panelEggOptions.add(lblEggType);
		
		JComboBox comboBoxEggType = new JComboBox(masterList.getEggCollection());
//		comboBoxEggType.insertItemAt("", 0);
//		comboBoxEggType.setSelectedIndex(0);
		comboBoxEggType.setBackground(Color.WHITE);
//		comboBoxEggType.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (comboBoxEggType.getSelectedItem() != null) {
//					btnAddEgg.setVisible(true);
//				}
//			}
//		});
		comboBoxEggType.setBounds(131, 1, 98, 24);
		panelEggOptions.add(comboBoxEggType);
		
		//Incubator Type
		JLabel lblIncubatorType = new JLabel("Incubator Type");
		lblIncubatorType.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncubatorType.setBounds(0, 26, 117, 26);
		panelEggOptions.add(lblIncubatorType);
		
		JComboBox comboBoxIncubatorType = new JComboBox(masterList.getIncubatorCollection());
		comboBoxIncubatorType.setBackground(Color.WHITE);
		comboBoxIncubatorType.setBounds(131, 28, 98, 24);
		panelEggOptions.add(comboBoxIncubatorType);
		
		//Distance walked
		JLabel lblDistanceWalked = new JLabel("Distance Walked");
		lblDistanceWalked.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistanceWalked.setBackground(Color.WHITE);
		lblDistanceWalked.setBounds(0, 54, 128, 26);
		panelEggOptions.add(lblDistanceWalked);
		
		JLabel lblDecimal = new JLabel(".");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDecimal.setBounds(174, 61, 12, 19);
		panelEggOptions.add(lblDecimal);

		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(masterList.getPossibleEggDistanceWholeNumbers());
		comboBoxDistanceWalkedNumber.setBackground(Color.WHITE);
		comboBoxDistanceWalkedNumber.setBounds(131, 56, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedNumber);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(masterList.getPossibleEggDistanceDecimals());
		comboBoxDistanceWalkedDecimal.setBackground(Color.WHITE);
		comboBoxDistanceWalkedDecimal.setBounds(189, 56, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedDecimal);
		
		/**********************************************************************
		 * Creates main menu
		 **********************************************************************/
		
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.setVisible(false);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(11, 0, 426, 23);
		frame.getContentPane().add(lblMenu);
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg table");
		buttonGroupMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(false);
				panelEggCount.setVisible(false);
				btnDisplayResults.setVisible(true);
				textAreaInstructions.setText(displayInstructions(1));
				textAreaResults.setText(null);		
			}
		});
		rdbtnDisplayTable.setBounds(22, 23, 243, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate egg hatching");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				panelEggCount.setVisible(false);
				btnDisplayResults.setVisible(true);
				textAreaInstructions.setText(displayInstructions(2));
				textAreaResults.setText(null);		
			}
		});
		rdbtnCalculateEgg.setBounds(22, 50, 243, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for up to 9 eggs");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				panelEggCount.setVisible(true);
				textAreaInstructions.setText(displayInstructions(3));
				textAreaResults.setText(null);
				
				JButton btnEnterEgg = new JButton("Enter");
				btnEnterEgg.setBounds(294, 203, 122, 25);
				frame.getContentPane().add(btnEnterEgg);
				//creates action for enter egg button
				btnEnterEgg.addActionListener(new ActionListener() {
					@Override
					
					//TODO: clean this up!!
					public void actionPerformed(ActionEvent e) {
						eggList = new EggsNew[Integer.parseInt((String)(comboBoxEggCount.getSelectedItem()))];
						if (eggCount < eggList.length) {
							//egg count starts at 1. use eggCount-1 to reference array positions
							eggList[eggCount-1]= SetEggAttributes(eggCount,
									(EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(),
									(EggsNew)comboBoxEggType.getSelectedItem(),
									(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(),
									(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1));
							
							textAreaResults.append("Egg " + (eggCount) + ": " + comboBoxEggType.getSelectedItem() + "\t" + comboBoxIncubatorType.getSelectedItem() + 
									"\t" + (Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
											(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1) + "\n");
							comboBoxEggType.setSelectedIndex(0);
							comboBoxIncubatorType.setSelectedIndex(0);
							comboBoxDistanceWalkedNumber.setSelectedIndex(0);
							comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
							eggCount ++;
						}
						//Once the egg count amount is reached, hide the "enter" button
						else if (eggCount == eggList.length){
							eggList[eggCount-1]= SetEggAttributes(eggCount,
									(EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(),
									(EggsNew)comboBoxEggType.getSelectedItem(),
									(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(),
									(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1));
							
							textAreaResults.append("Egg " + (eggCount) + ": " + comboBoxEggType.getSelectedItem() + "\t" + comboBoxIncubatorType.getSelectedItem() + 
									"\t" + (Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
											(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1) + "\n");
							comboBoxEggType.setSelectedIndex(0);
							comboBoxIncubatorType.setSelectedIndex(0);
							comboBoxDistanceWalkedNumber.setSelectedIndex(0);
							comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
							btnEnterEgg.setVisible(false);
							btnDisplayResults.setVisible(true);
						}
					}
				});
			}
		});
		rdbtnCreatePlan.setBounds(22, 77, 243, 23);
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
				panelEggCount.setVisible(false);
				btnDisplayResults.setVisible(false);
				buttonGroupMenu.clearSelection();
				textAreaInstructions.setText(null);
				textAreaResults.setText(null);
				eggCount = 1;
				comboBoxEventWalkingDistance.setSelectedIndex(0);
				comboBoxEggType.setSelectedIndex(0);
				comboBoxIncubatorType.setSelectedIndex(0);
				comboBoxDistanceWalkedNumber.setSelectedIndex(0);
				comboBoxDistanceWalkedDecimal.setSelectedIndex(0);

			}
		});
		btnReset.setBounds(255, 470, 85, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(352, 470, 85, 25);
		frame.getContentPane().add(btnExit);

		
		/**********************************************************************
		 * Create Display result button and perform actions based on selections
		 **********************************************************************/
//		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
							(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1))) + " KM\n");
				}
				
				//TODO: work through storing eggs and then calculating them. Decide whether to print out each egg as it's chosen
				else if (rdbtnCreatePlan.isSelected()){
					
					if(eggCount==1) {
						textAreaResults.append("The " + (EggsNew)comboBoxEggType.getSelectedItem() + " egg will hatch in " + 
								df.format(calculateEgg((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(), 
								(EggsNew)comboBoxEggType.getSelectedItem(), 
								(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(), 
								(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
										(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1))) + " KM\n");
					}
					//TODO: calculate: create method that takes array, calculates total until each egg hatches with it's given
					//attributes and then displays them in order of what to place when.
					//Returning error - fix
					else {
							textAreaResults.append(buildEggPlan(eggList));
					}
					
				}
			}
		});
		btnDisplayResults.setBounds(140, 265, 164, 25);
		frame.getContentPane().add(btnDisplayResults);
		
//		JButton btnEnterEgg = new JButton("Enter");
//		btnEnterEgg.setBounds(294, 203, 122, 25);
//		frame.getContentPane().add(btnEnterEgg);
//		//creates action for enter egg button
//		btnEnterEgg.addActionListener(new ActionListener() {
//			@Override
//			
//			//TODO: clean this up!!
//			public void actionPerformed(ActionEvent e) {
//				eggList = new EggsNew[Integer.parseInt((String)(comboBoxEggCount.getSelectedItem()))];
//				if (eggCount < eggList.length) {
//					//egg count starts at 1. use eggCount-1 to reference array positions
//					eggList[eggCount-1]= SetEggAttributes((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(),
//							(EggsNew)comboBoxEggType.getSelectedItem(),
//							(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(),
//							(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
//							(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1));
//					
//					textAreaResults.append("Egg " + (eggCount) + ": " + comboBoxEggType.getSelectedItem() + "\t" + comboBoxIncubatorType.getSelectedItem() + 
//							"\t" + (Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
//									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1) + "\n");
//					comboBoxEggType.setSelectedIndex(0);
//					comboBoxIncubatorType.setSelectedIndex(0);
//					comboBoxDistanceWalkedNumber.setSelectedIndex(0);
//					comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
//					eggCount ++;
//				}
//				//Once the egg count amount is reached, hide the "enter" button
//				else if (eggCount == eggList.length){
//					textAreaResults.append("Egg " + (eggCount) + ": " + comboBoxEggType.getSelectedItem() + "\t" + comboBoxIncubatorType.getSelectedItem() + 
//							"\t" + (Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
//									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1) + "\n");
//					comboBoxEggType.setSelectedIndex(0);
//					comboBoxIncubatorType.setSelectedIndex(0);
//					comboBoxDistanceWalkedNumber.setSelectedIndex(0);
//					comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
//					btnEnterEgg.setVisible(false);
//				}
//			}
//		});
		

		

		

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
						+ "and click \"display results\"";
					break;
			case 3: result = "Enter the event multiplier, egg count and egg information.\n" 
								+ "click \"enter\" after entering each egg's information\n"
								+ "When finished, click \"display results\"";
					break;			default: result = "error";
		}
		
		return result;
	}
	
	/**********************************************************************
	 * Calculate when one egg will hatch, based on entered values
	 **********************************************************************/
	private double calculateEgg(EventMultiplier event, EggsNew egg, IncubatorsNew incubator, double distance) {
		//double distance = (distance1 + (distance2/10));			
		return (event.getMultiplier() * egg.getEggWalkingDistance() * incubator.getIncubatorMultiplier())- distance;
	}
	
	/**********************************************************************
	 * Calculate when eggs will hatch, based on egg array
	 **********************************************************************/
	private String buildEggPlan(EggsNew[] eggs) {
		StringBuilder results = new StringBuilder();
		eggs = sortEggs(eggs);
		for (int i=0; i<eggs.length;i++) {
			results.append("Egg " + eggs[i].getEggCount() + " at " + (eggs[0].getDistanceRemaining()-eggs[i].getDistanceRemaining()) + "\n");
		}
		return results.toString();
	}
	
	private EggsNew[] sortEggs(EggsNew[] eggs) {
		EggsNew[] eggOrder = new EggsNew[eggs.length];
		EggsNew maxEgg = eggs[0];
		for (int i=0; i<eggOrder.length; i++) {
			for(int j=0; j<eggs.length; j++) {
				if (eggs[j].getDistanceRemaining() > maxEgg.getDistanceRemaining()){
					maxEgg = eggs[j];
				}
			eggOrder[i] = maxEgg;
			}
		}
		return eggOrder;
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
	
	/**********************************************************************
	 * set egg attributes based on input
	 **********************************************************************/
	protected EggsNew SetEggAttributes(int count, EventMultiplier event, EggsNew egg, IncubatorsNew incubator, double distance) {
		egg.setEggCount(count);
		egg.setEventMultiplier(event.getMultiplier());	
		egg.setIncubatorMultiplier(incubator.getIncubatorMultiplier());
		egg.setDistanceWalked(distance);
		egg.setDistanceRemaining(calculateEgg(event,egg,incubator,distance));
		return egg;
	}
}
