/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

package pokemongoeggs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.Color;

class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMainMenu = new ButtonGroup();
	private MasterList masterList = new MasterList();
	private Egg[] eggInventoryArray = {};
	private int eggInventoryCount = 1;
	private DecimalFormat df = new DecimalFormat("#.#");

	/************************************************************************
	 * Launch the application.
	 **********************************************************************/
	//default code from Design editor. Keeping for reference, in case any auto generated code breaks the program
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
		//Auto generated by design editor
		//frame.setVisible(true);
	}

	/**********************************************************************
	 * Initialize the contents of the frame.
	 **********************************************************************/
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 537);
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
		textAreaInstructions.setWrapStyleWord(true);
		textAreaInstructions.setLineWrap(true);
		frame.getContentPane().add(textAreaInstructions);
		
		//Results pane
		JScrollPane scrollPaneResults = new JScrollPane();
		scrollPaneResults.setBounds(11, 295, 426, 170);
		frame.getContentPane().add(scrollPaneResults);
		
		//Results text area
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 322, 426, 198);
		scrollPaneResults.add(textAreaResults);
		scrollPaneResults.setViewportView(textAreaResults);

		/**********************************************************************
		 * Create Event Panel
		 **********************************************************************/
		JPanel panelEvent = new JPanel();
		panelEvent.setBounds(14, 109, 434, 24);
		frame.getContentPane().add(panelEvent);
		panelEvent.setLayout(null);
		panelEvent.setVisible(false);
		
		JLabel lblEventMultiplier = new JLabel("What is the event walking distance multiplier?");
		lblEventMultiplier.setBounds(0, 0, 341, 24);
		panelEvent.add(lblEventMultiplier);
		
		JComboBox comboBoxEventMultiplier = new JComboBox(masterList.getEventCollection());
		comboBoxEventMultiplier.setBounds(336, 0, 90, 24);
		panelEvent.add(comboBoxEventMultiplier);
		comboBoxEventMultiplier.setBackground(Color.WHITE);
		
		/**********************************************************************
		 * Create Egg Count Panel
		 **********************************************************************/
		JPanel panelEggCount = new JPanel();
		panelEggCount.setBounds(14, 141, 434, 24);
		frame.getContentPane().add(panelEggCount);
		panelEggCount.setLayout(null);
		panelEggCount.setVisible(false);
		
		JLabel lblEggcount = new JLabel("How many eggs will there be total?");
		lblEggcount.setBounds(0, 0, 250, 24);
		panelEggCount.add(lblEggcount);
		lblEggcount.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox comboBoxEggCount = new JComboBox(masterList.getMaxEggsAllowedNumbers());
		comboBoxEggCount.setBounds(336,0, 36, 24);
		panelEggCount.add(comboBoxEggCount);
		comboBoxEggCount.setBackground(Color.WHITE);
		//Assign new Egg array with counter length
		comboBoxEggCount.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	eggInventoryArray = new Egg[Integer.parseInt((String)(comboBoxEggCount.getSelectedItem()))];
		    }
		});
		
		/**********************************************************************
		 * Create Egg information panels
		 **********************************************************************/
		//Egg Type panel
		JPanel panelEggType = new JPanel();
		panelEggType.setBounds(14, 171, 233, 24);
		frame.getContentPane().add(panelEggType);
		panelEggType.setLayout(null);
		panelEggType.setVisible(false);
		
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setBounds(0, 1, 117, 26);
		panelEggType.add(lblEggType);
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox comboBoxEggType = new JComboBox(masterList.getEggCollection());
		comboBoxEggType.setBounds(131, 1, 98, 24);
		panelEggType.add(comboBoxEggType);
		comboBoxEggType.setBackground(Color.WHITE);
				
		//Egg Options Panel
		JPanel panelEggOptions = new JPanel();
		panelEggOptions.setBounds(14, 200, 233, 53);
		frame.getContentPane().add(panelEggOptions);
		panelEggOptions.setLayout(null);
		panelEggOptions.setVisible(false);
		
		JLabel lblIncubatorType = new JLabel("Incubator Type");
		lblIncubatorType.setBounds(0, 1, 106, 24);
		panelEggOptions.add(lblIncubatorType);
		lblIncubatorType.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox comboBoxIncubatorType = new JComboBox(masterList.getIncubatorCollection());
		comboBoxIncubatorType.setBackground(Color.WHITE);
		comboBoxIncubatorType.setBounds(131, 1, 98, 24);
		panelEggOptions.add(comboBoxIncubatorType);
		
		JLabel lblDistanceWalked = new JLabel("Distance Walked");
		lblDistanceWalked.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistanceWalked.setBackground(Color.WHITE);
		lblDistanceWalked.setBounds(0, 28, 128, 26);
		panelEggOptions.add(lblDistanceWalked);

		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(masterList.getPossibleEggDistanceWholeNumbers());
		comboBoxDistanceWalkedNumber.setBackground(Color.WHITE);
		comboBoxDistanceWalkedNumber.setBounds(131, 28, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedNumber);
		
		JLabel lblDecimal = new JLabel(".");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDecimal.setBounds(174, 32, 12, 19);
		panelEggOptions.add(lblDecimal);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(masterList.getPossibleEggDistanceDecimals());
		comboBoxDistanceWalkedDecimal.setBackground(Color.WHITE);
		comboBoxDistanceWalkedDecimal.setBounds(189, 28, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedDecimal);
		
		/**********************************************************************
		 * Creates main menu
		 **********************************************************************/
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(11, 0, 426, 23);
		frame.getContentPane().add(lblMenu);
		
		//Creates Display Results button. Actions created later.
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.setVisible(false);
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg table");	
		buttonGroupMainMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggType.setVisible(false);
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
		buttonGroupMainMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggType.setVisible(true);
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
		buttonGroupMainMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggType.setVisible(true);
				panelEggOptions.setVisible(false);
				panelEggCount.setVisible(true);
				btnDisplayResults.setVisible(false);
				textAreaInstructions.setText(displayInstructions(3));
				textAreaResults.setText(null);
				
				JButton btnEnterEgg = new JButton("Enter");
				btnEnterEgg.setBounds(294, 171, 122, 25);
				frame.getContentPane().add(btnEnterEgg);
				btnEnterEgg.addActionListener(new ActionListener() {
					@Override
					
					public void actionPerformed(ActionEvent e) {
						//egg count starts at 1. use eggCount-1 to reference array positions
						eggInventoryArray[eggInventoryCount-1]= SetEggAttributes(eggInventoryCount,
								(Event)comboBoxEventMultiplier.getSelectedItem(),
								(Egg)comboBoxEggType.getSelectedItem(),
								(Incubator)comboBoxIncubatorType.getSelectedItem(),
								(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
								(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1));
						
						textAreaResults.append(displayResultsEggInput(eggInventoryArray[eggInventoryCount-1]));
						if (eggInventoryCount < eggInventoryArray.length) {
							eggInventoryCount ++;
						}
						//Once the egg count amount is reached, hide the "enter" button
						else if (eggInventoryCount == eggInventoryArray.length){
							btnEnterEgg.setVisible(false);
							btnDisplayResults.setVisible(true);
						}
						//reset combo boxes
						comboBoxEggType.setSelectedIndex(0);
						comboBoxIncubatorType.setSelectedIndex(0);
						comboBoxDistanceWalkedNumber.setSelectedIndex(0);
						comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
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
				panelEggType.setVisible(false);
				panelEggOptions.setVisible(false);
				panelEggCount.setVisible(false);
				btnDisplayResults.setVisible(false);
				buttonGroupMainMenu.clearSelection();
				textAreaInstructions.setText(null);
				textAreaResults.setText(null);
				eggInventoryCount = 1;
				comboBoxEventMultiplier.setSelectedIndex(0);
				comboBoxEggCount.setSelectedIndex(0);
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
		 * Create Display result button action and perform actions based on selections
		 **********************************************************************/
		btnDisplayResults.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDisplayTable.isSelected()) {
					
					//This code builds the table data and header arrays
					String[][] tableData = buildTable((Event)comboBoxEventMultiplier.getSelectedItem(), masterList);
					String[] headers = buildHeaders(masterList);

					//print out table
					textAreaResults.append("\t\t");
					//column headers
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
				
				//TODO: when incorporating incubators, decide how to prevent negatives
				else if(rdbtnCalculateEgg.isSelected()) {
					textAreaResults.append("The " + (Egg)comboBoxEggType.getSelectedItem() + " egg will hatch in " + 
							df.format(calculateEgg((Event)comboBoxEventMultiplier.getSelectedItem(), 
							(Egg)comboBoxEggType.getSelectedItem(), 
							(Incubator)comboBoxIncubatorType.getSelectedItem(), 
							(Double.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem())+
									(Double.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem()))*.1))) + " KM\n");
				}
				
				else if (rdbtnCreatePlan.isSelected()){
					
					//TODO: add functionality to choose incubator (regular or super) and calculate the fastest hatching
					//with only the highest distances being in super incubators
					//TODO: add functionality to recognize eggs already incubating and how that affects the plan.
					//any eggs with more distance than those already incubating cannot be walked
					//TODO: add range to consider (within 1-2 KM -- no greater than 5KM, since the fastest you can go
					//during hatching is 10.5 KM/hr)
					//TODO: decide where to require at least 2 eggs for creating a plan (here or in enter button)
					//TODO: update instructions once new functionality is in place
					textAreaResults.append(buildEggPlan(eggInventoryArray));
				}
			}
		});
		btnDisplayResults.setBounds(140, 265, 164, 25);
		frame.getContentPane().add(btnDisplayResults);
}
	
	/**********************************************************************
	 * Holds instruction strings
	 **********************************************************************/
	//separate method to hold strings to help keep instruction language consistent
	private String displayInstructions(int choice) {
		String result = "";
		
		switch(choice) {
			case 1: result = "Enter the event and click \"display results\"";
					break;
			case 2: result = "Enter the event and egg information and click \"display results\"";
					break;
			case 3: result = "Enter the event, egg count and type and click \"enter\". "
					+ "When finished, click \"display results\"";
					break;
					default: result = "error"; //message to help with testing
		}
		
		return result;
	}
	
	/**********************************************************************
	 * set egg attributes based on input
	 **********************************************************************/
	protected Egg SetEggAttributes(int count, Event event, Egg egg, Incubator incubator, double distance) {
		Egg newEgg = new Egg(egg.getName(), egg.getEggWalkingDistance(),calculateEgg(event,egg,incubator,distance));
		newEgg.setEggCount(count);
		newEgg.setEventMultiplier(event.getMultiplier());	
		newEgg.setIncubatorMultiplier(incubator.getIncubatorMultiplier());
		newEgg.setDistanceWalked(distance);
		return newEgg;
	}
	
	/**********************************************************************
	 * Display text for egg entry
	 **********************************************************************/
	private String displayResultsEggInput(Egg eggEntered) {
		StringBuilder results = new StringBuilder();
		
		results.append("Egg " + eggEntered.getEggCount() + ": " + eggEntered.getName() + "\tIncubator Multiplier: " + 
				eggEntered.getIncubatorMultiplier() + "\tDistance Walked" + eggEntered.getDistanceWalked() + "\n");

		return results.toString();
	}
	
	/**********************************************************************
	 * Build table arrays
	 **********************************************************************/
	private String[][] buildTable(Event multiplier, MasterList list){

		Egg[] eggs = list.getEggCollection();
		Incubator[] incubators = list.getIncubatorCollection();
		double answer;
		int length = eggs.length * incubators.length;
		
		//build array of egg walking distances in each type of incubator
		double[] eggsArray = new double[length];
		for (int i=0; i<eggsArray.length;){
			for (int j=0; j<incubators.length; j++) {
				for (int k=0; k<eggs.length; k++) {
					eggsArray[i] = incubators[j].getIncubatorMultiplier() * eggs[k].getEggWalkingDistance() * 
							multiplier.getMultiplier();
					i++;
				}	 
			}
		}
		
		//build table array with each row showing when to put that egg type in compared to that column's egg type
		String[][] eggIncubateDistances = new String[eggsArray.length][eggsArray.length];
		for (int i = 0; i < eggsArray.length; i++) {
			for (int j = 0; j < eggsArray.length; j++) {
				
				//Round the numbers before subtracting to match the game's math. 
				answer = (Math.round(eggsArray[j] * 10) / 10.0) - (Math.round(eggsArray[i] * 10) / 10.0);
				if (answer > 0) {
					//use decimal format to return a single decimal place
					eggIncubateDistances[i][j] = df.format(answer).toString() + " KM"; 
				} else if (answer == 0) {
					//indicates the eggs go in at the same time
					eggIncubateDistances[i][j] = "same time"; 
				} else {
					//indicates the current egg is at a shorter distance than the prospective egg
					eggIncubateDistances[i][j] = "********"; 
				}
			}
		}
		return eggIncubateDistances;
	}	
	
	//Headers Array
	private String[] buildHeaders(MasterList list) {
		Egg[] eggs = list.getEggCollection();
		Incubator[] incubators = list.getIncubatorCollection();
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
	 * Calculate when one egg will hatch, based on entered values
	 **********************************************************************/
	private double calculateEgg(Event event, Egg egg, Incubator incubator, double distance) {		
		return (event.getMultiplier() * egg.getEggWalkingDistance() * incubator.getIncubatorMultiplier())- distance;
	}
	
	/**********************************************************************
	 * Calculate when eggs will hatch, based on egg array
	 **********************************************************************/
	private String buildEggPlan(Egg[] eggs) {
		
		int length = eggs.length;
		StringBuilder results = new StringBuilder();
		Egg[] eggOrder = Sort.bubbleSortDistanceRemaining(eggs, length);
		
		results.append("Egg to Place\t\tWhen Egg " + eggOrder[0].getEggCount() + " is at:\n");
		for (int i=1; i<length;i++) {
			results.append("Egg " + eggOrder[i].getEggCount() + "\t\t\t" + 
					(eggOrder[0].getDistanceRemaining()-eggOrder[i].getDistanceRemaining()) + "\n");
		}
		
		return results.toString();
	}
}
