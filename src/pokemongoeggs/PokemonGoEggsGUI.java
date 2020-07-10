/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
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
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	private int eggs[] = {2, 5, 7, 10};
	private double incubators[] = {1, 0.666667};
	private double events[] = {0.25, 0.5};
	//int eggType;
	private double eventMultiplier;
	//double incubatorType;
	private Egg2KM egg2KM = new Egg2KM();
	private Egg5KM egg5KM = new Egg5KM();
	private Egg7KM egg7KM = new Egg7KM();
	private Egg10KM egg10KM = new Egg10KM();

	private IncubatorRegular incubatorRegular = new IncubatorRegular();
	private IncubatorSuper incubatorSuper = new IncubatorSuper();
	private String[] eggTypes = {egg2KM.getName(), egg5KM.getName(), egg7KM.getName(), egg10KM.getName()};
	private String[] distanceNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String[] eventDistanceArray = {"no event", "1/4", "1/2"};
	private String[] incubatorTypes = { incubatorRegular.getName(), incubatorSuper.getName()};

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

	/**
	 * Create the application.
	 */
	PokemonGoEggsGUI() {
		initialize();
		//frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 591);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Creates text areas
		JTextArea textAreaInstructions = new JTextArea();
		textAreaInstructions.setBounds(12, 132, 426, 70);
		frame.getContentPane().add(textAreaInstructions);
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 344, 426, 176);
		frame.getContentPane().add(textAreaResults);
		
		//Create Egg information panel
		JPanel panelEggOptions = new JPanel();
		panelEggOptions.setBounds(15, 241, 423, 81);
		frame.getContentPane().add(panelEggOptions);
		panelEggOptions.setLayout(null);
		panelEggOptions.setVisible(false);
		
		JLabel lblDecimal = new JLabel(".");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDecimal.setBounds(189, 60, 18, 19);
		panelEggOptions.add(lblDecimal);
		
		JButton btnNextEgg = new JButton("Enter another egg");
		btnNextEgg.setBounds(259, 54, 164, 25);
		panelEggOptions.add(btnNextEgg);
		
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		lblEggType.setBounds(12, 0, 128, 26);
		panelEggOptions.add(lblEggType);
		
		JLabel lblIncubatorType = new JLabel("Incubator Type");
		lblIncubatorType.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncubatorType.setBounds(12, 27, 128, 26);
		panelEggOptions.add(lblIncubatorType);
		
		JLabel lblDistanceWalked = new JLabel("Distance Walked");
		lblDistanceWalked.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistanceWalked.setBackground(Color.WHITE);
		lblDistanceWalked.setBounds(12, 55, 128, 26);
		panelEggOptions.add(lblDistanceWalked);
		
//		TODO: get egg types from class instead of array		
//		String[] eggTypes = { " ", "2 KM", "5 KM", "7 KM", "10 KM"};
//		String[] eggTypes = { " ", egg2KM.getName(), egg5KM.getName(), egg7KM.getName(), egg10KM.getName()};
		JComboBox comboBoxEggType = new JComboBox(eggTypes);
		comboBoxEggType.setBackground(Color.WHITE);
		comboBoxEggType.setBounds(149, 1, 98, 24);
		panelEggOptions.add(comboBoxEggType);
		
//		TODO: get incubator types from class instead of array		
//		String[] incubatorTypes = { "regular", "super"};
		JComboBox comboBoxIncubatorType = new JComboBox(incubatorTypes);
		comboBoxIncubatorType.setBackground(Color.WHITE);
		comboBoxIncubatorType.setBounds(149, 28, 98, 24);
		panelEggOptions.add(comboBoxIncubatorType);
		
//		TODO: get distance from class instead of array	
//		String[] distanceNumbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedNumber.setBackground(Color.WHITE);
		comboBoxDistanceWalkedNumber.setBounds(149, 55, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedNumber);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedDecimal.setBackground(Color.WHITE);
		comboBoxDistanceWalkedDecimal.setBounds(207, 55, 40, 24);
		panelEggOptions.add(comboBoxDistanceWalkedDecimal);
		
		//Create Event Panel
//		TODO: get event types from class instead of array
//		String[] eventDistanceArray = {"no event", "1/4", "1/2"};

		JPanel panelEvent = new JPanel();
		panelEvent.setBounds(12, 205, 426, 24);
		frame.getContentPane().add(panelEvent);
		panelEvent.setLayout(null);
		
		JComboBox comboBoxEventWalkingDistance = new JComboBox(eventDistanceArray);
		comboBoxEventWalkingDistance.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource() == comboBoxEventWalkingDistance) {
					eventMultiplier = getValue(comboBoxEventWalkingDistance.getSelectedItem().toString());
				}
			}
		});
		
//		TODO: determine whether to use objects and set properties or arrays to reference. Such as: egg, set distance or egg and pick distance

		comboBoxEventWalkingDistance.setBounds(336, 0, 90, 24);
		panelEvent.add(comboBoxEventWalkingDistance);
		comboBoxEventWalkingDistance.setBackground(Color.WHITE);
		panelEvent.setVisible(false);
		
		JLabel lblEventWalkingDistance = new JLabel("What is the event walking distance multiplier?");
		lblEventWalkingDistance.setBounds(0, 0, 341, 24);
		panelEvent.add(lblEventWalkingDistance);
		
		//Creates main menu
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
		
		//Creates reset and exit buttons
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelEvent.setVisible(false);
				panelEggOptions.setVisible(false);
				buttonGroupMenu.clearSelection();
				textAreaInstructions.setText(null);
				textAreaResults.setText(null);
//				TODO: clear egg option fields
				
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
		
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDisplayResults.setBounds(44, 524, 164, 25);
		frame.getContentPane().add(btnDisplayResults);
		
		JScrollPane scrollPaneHatchingTable = new JScrollPane();
		scrollPaneHatchingTable.setBounds(12, 322, 426, 198);
		frame.getContentPane().add(scrollPaneHatchingTable);
		

	}
	
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
	
	//Get the numeric value for a menu choice
	private double getValue(String choice) {
		double value = 1; //no event, regular incubator
		
		if (choice.contentEquals("1/4")){
			value = 0.25;
		}
		else if (choice.contentEquals("1/2")){
			value = 0.5;
		}
		else if (choice.contentEquals(egg2KM.getName())) {
			value = egg2KM.getEggWalkingDistance();
		}
		else if (choice.contentEquals(egg5KM.getName())) {
			value = egg5KM.getEggWalkingDistance();
		}
		else if (choice.contentEquals(egg7KM.getName())) {
			value = egg7KM.getEggWalkingDistance();
		}
		else if (choice.contentEquals(egg10KM.getName())) {
			value = egg10KM.getEggWalkingDistance();
		}
		else if (choice.contentEquals(incubatorSuper.getName())) {
			value = incubatorSuper.getIncubatorMultiplier();
		}
		else {
			value = 0;
		}
		return value;
	}
	

}
