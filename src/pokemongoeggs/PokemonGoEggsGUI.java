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
	private DecimalFormat df = new DecimalFormat("#.#");
	private JTable table;


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
		frame.setBounds(100, 100, 450, 591);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		df.setRoundingMode(RoundingMode.HALF_UP);
		/**********************************************************************
		 * Create text areas and tables
		 **********************************************************************/
		//Instructions pane
		JTextArea textAreaInstructions = new JTextArea();
		textAreaInstructions.setBounds(12, 132, 426, 70);
		frame.getContentPane().add(textAreaInstructions);
		
		//Results pane
		JScrollPane scrollPaneResults = new JScrollPane();
		scrollPaneResults.setBounds(12, 322, 426, 198);
		frame.getContentPane().add(scrollPaneResults);
		scrollPaneResults.setVisible(false);
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 322, 426, 198);
		scrollPaneResults.add(textAreaResults);
		scrollPaneResults.setViewportView(textAreaResults);
		
		//Table panes //DOESN'T WORK. No adjustments make tables or Panes display side by side
		JPanel jPanelTable = new JPanel();
		FlowLayout flowLayout = (FlowLayout) jPanelTable.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		jPanelTable.setBounds(12, 322, 426, 198);
		frame.getContentPane().add(jPanelTable);
		jPanelTable.setVisible(false);
		
		JPanel jPanelRowHeaders = new JPanel();
		jPanelRowHeaders.setBounds(5, 5, 100, 198);
		jPanelTable.add(jPanelRowHeaders);
		jPanelRowHeaders.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JScrollPane scrollPaneTable = new JScrollPane();
		scrollPaneTable.setBounds(5, 101, 320, 198);
		jPanelTable.add(scrollPaneTable);
		
		
		/**********************************************************************
		 * Create Egg information panel
		 **********************************************************************/
		JPanel panelEggOptions = new JPanel();
		panelEggOptions.setBounds(15, 241, 423, 81);
		frame.getContentPane().add(panelEggOptions);
		panelEggOptions.setLayout(null);
		panelEggOptions.setVisible(false);
		
		//Egg Type
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		lblEggType.setBounds(12, 0, 128, 26);
		panelEggOptions.add(lblEggType);
		
		JComboBox comboBoxEggType = new JComboBox(masterList.getEggCollection());
		comboBoxEggType.setBackground(Color.WHITE);
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
		lblDistanceWalked.setBounds(12, 55, 128, 26);
		panelEggOptions.add(lblDistanceWalked);
		
		JLabel lblDecimal = new JLabel(".");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDecimal.setBounds(189, 60, 18, 19);
		panelEggOptions.add(lblDecimal);

		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedNumber.setBackground(Color.WHITE);
		comboBoxDistanceWalkedNumber.setBounds(149, 55, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedNumber);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedDecimal.setBackground(Color.WHITE);
		comboBoxDistanceWalkedDecimal.setBounds(207, 55, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedDecimal);
		
		//TODO: make this work
		JButton btnNextEgg = new JButton("Enter another egg");
		btnNextEgg.setBounds(259, 54, 164, 25);
		panelEggOptions.add(btnNextEgg);
		
		/**********************************************************************
		 * Create Event Panel
		 **********************************************************************/
		JPanel panelEvent = new JPanel();
		panelEvent.setBounds(12, 205, 426, 24);
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
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg hatching reference table");
		buttonGroupMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(false);
				textAreaInstructions.setText(displayInstructions(1));
						
			}
		});
		rdbtnDisplayTable.setBounds(22, 43, 307, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate when an egg will hatch");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				textAreaInstructions.setText(displayInstructions(2));
						
			}
		});
		rdbtnCalculateEgg.setBounds(22, 70, 307, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for up to 9 eggs and incubators");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(true);
				panelEggOptions.setVisible(true);
				textAreaInstructions.setText(displayInstructions(3));
			}
		});
		rdbtnCreatePlan.setBounds(22, 97, 355, 23);
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
				scrollPaneResults.setVisible(false);
				comboBoxEventWalkingDistance.setSelectedIndex(0);
				comboBoxEggType.setSelectedIndex(0);
				comboBoxIncubatorType.setSelectedIndex(0);
				comboBoxDistanceWalkedNumber.setSelectedIndex(0);
				comboBoxDistanceWalkedDecimal.setSelectedIndex(0);
				
			}
		});
		btnReset.setBounds(256, 524, 85, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(353, 524, 85, 25);
		frame.getContentPane().add(btnExit);
		
		/**********************************************************************
		 * Create Display result button and perform actions based on selections
		 **********************************************************************/
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDisplayTable.isSelected()) {
					
					//This code builds the table data and header arrays
					//scrollPaneTable.setVisible(true);
					jPanelTable.setVisible(true);
					String[][] tableData = BuildTable((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(), masterList);
					String[] headers = BuildHeaders(masterList);
					String[][] rowHeaders = BuildRowHeaders(masterList);
					String[] columnNames = {" "};
					
					//test print for arrays
					for (int i=0; i<tableData.length; i++) {
						for (int j=0; j<tableData.length; j++) {
							System.out.print(tableData[i][j] + "\t");
						}
						System.out.println("");
					}
					
					//this lists the table content. same as standard table
					JTable tableContent = new JTable(tableData,headers);
					scrollPaneTable.add(tableContent);
					scrollPaneTable.setViewportView(tableContent);
					tableContent.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					
					//code credit for column width: https://www.codejava.net/java-se/swing/setting-column-width-and-row-height-for-jtable
					for (int i = 0; i < tableContent.getColumnModel().getColumnCount(); i++) {
				        TableColumn column = tableContent.getColumnModel().getColumn(i);
				        column.setPreferredWidth(90);
				    }
					
					JTable tableRowHeaders = new JTable(rowHeaders,columnNames);
					jPanelRowHeaders.add(tableRowHeaders);
					//jPanelTableHeaders.setViewportView(tableRowHeaders);
					//tableRowHeaders.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					

				}
				
				//TODO: format decimal to only one place and no negatives
				else if(rdbtnCalculateEgg.isSelected()) {
					//scrollPaneResults.setViewportView(textAreaResults);
					scrollPaneResults.setVisible(true);
					textAreaResults.append("The egg will hatch in " + 
					calculateEgg((EventMultiplier)comboBoxEventWalkingDistance.getSelectedItem(), (EggsNew)comboBoxEggType.getSelectedItem(), 
							(IncubatorsNew)comboBoxIncubatorType.getSelectedItem(), 
							Integer.valueOf((String)comboBoxDistanceWalkedNumber.getSelectedItem()), 
							Integer.valueOf((String)comboBoxDistanceWalkedDecimal.getSelectedItem())) + " KM");
					
				}
				else {
					scrollPaneResults.setViewportView(textAreaResults);;
				}
			}


		});
		btnDisplayResults.setBounds(44, 524, 164, 25);
		frame.getContentPane().add(btnDisplayResults);
	

		

	}
	
	/**************************************************/
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
	//TODO: clean up this mess. Simplify if possible
	private String[][] BuildTable(EventMultiplier multiplier, MasterList list){
		double answer;
		int length = list.getEggCollection().length * list.getIncubatorCollection().length;
		EggsNew[] eggs = list.getEggCollection();
		IncubatorsNew[] incubators = list.getIncubatorCollection();
		double[] eggsArray = new double[length];
		for (int i=0; i<eggsArray.length;){
			for (int j=0; j<incubators.length; j++) {
				for (int k=0; k<eggs.length; k++) {
					eggsArray[i] = incubators[j].getIncubatorMultiplier() * eggs[k].getEggWalkingDistance() * multiplier.getMultiplier();
					i++;
				}	 
			}
		}
		
		String[][] eggIncubateDistances = new String[eggsArray.length][eggsArray.length];
		for (int i = 0; i < eggsArray.length; i++) {
			for (int j = 0; j < eggsArray.length; j++) {
				
				//Round the numbers before subtracting to match the game's math. 
				answer = (Math.round(eggsArray[j] * 10) / 10.0) - (Math.round(eggsArray[i] * 10) / 10.0);
				if (answer > 0) {
					eggIncubateDistances[i][j] = df.format(answer).toString(); //use decimal format to return a single decimal place
				} else if (answer == 0) {
					eggIncubateDistances[i][j] = "same"; //indicates the eggs go in at the same time
				} else {
					eggIncubateDistances[i][j] = "***"; //indicates the current egg is at a shorter distance than the prospective egg
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
	
	//Row Headers array
	private String[][] BuildRowHeaders(MasterList list) {
		String[] headers = BuildHeaders(list);
		String[][] rowHeaders = new String[headers.length][1];
		
		for (int i=0; i<rowHeaders.length;i++){
			rowHeaders[i][0] = headers[i];
		}
		return rowHeaders;
	}
}
