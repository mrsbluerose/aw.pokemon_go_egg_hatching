package pokemongoeggs;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokemonGoEggsGUI window = new PokemonGoEggsGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PokemonGoEggsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//main menu
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(12, 12, 426, 23);
		frame.getContentPane().add(lblMenu);
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg hatching table");
		buttonGroupMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//mnEventMenu.setVisible(true);
			}
		});
		rdbtnDisplayTable.setBounds(22, 43, 307, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate when an egg will hatch");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.setBounds(22, 70, 307, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for 9 eggs and incubators");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.setBounds(22, 97, 307, 23);
		frame.getContentPane().add(rdbtnCreatePlan);
		
		JTextArea textAreaInstructions = new JTextArea();
		textAreaInstructions.setBounds(12, 132, 426, 70);
		frame.getContentPane().add(textAreaInstructions);
		
		JPanel eggOptionsPanel = new JPanel();
		eggOptionsPanel.setBounds(15, 241, 423, 91);
		frame.getContentPane().add(eggOptionsPanel);
		eggOptionsPanel.setLayout(null);
		
		JLabel label = new JLabel(".");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setBounds(189, 60, 18, 19);
		eggOptionsPanel.add(label);
		
		JButton btnNextEgg = new JButton("Enter another egg");
		btnNextEgg.setBounds(259, 28, 164, 25);
		eggOptionsPanel.add(btnNextEgg);
		
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.setBounds(259, 66, 164, 25);
		eggOptionsPanel.add(btnDisplayResults);
		
		JLabel lblEggType = new JLabel("Egg Type");
		lblEggType.setHorizontalAlignment(SwingConstants.LEFT);
		lblEggType.setBounds(12, 0, 128, 26);
		eggOptionsPanel.add(lblEggType);
		
		JLabel lblIncubatorType = new JLabel("Incubator Type");
		lblIncubatorType.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncubatorType.setBounds(12, 27, 128, 26);
		eggOptionsPanel.add(lblIncubatorType);
		
		JLabel lblDistanceWalked = new JLabel("Distance Walked");
		lblDistanceWalked.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistanceWalked.setBackground(Color.WHITE);
		lblDistanceWalked.setBounds(12, 55, 128, 26);
		eggOptionsPanel.add(lblDistanceWalked);
		
		String[] eggTypes = { " ", "2 KM", "5 KM", "7 KM", "10 KM"};
		JComboBox comboBoxEggType = new JComboBox(eggTypes);
		comboBoxEggType.setBounds(149, 1, 98, 24);
		eggOptionsPanel.add(comboBoxEggType);
		
		String[] incubatorTypes = { "regular", "super"};
		JComboBox comboBoxIncubatorType = new JComboBox(incubatorTypes);
		comboBoxIncubatorType.setBounds(149, 28, 98, 24);
		eggOptionsPanel.add(comboBoxIncubatorType);
		
		String[] distanceNumbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		JComboBox comboBoxDistanceWalkedNumber = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedNumber.setBounds(149, 55, 40, 24);
		eggOptionsPanel.add(comboBoxDistanceWalkedNumber);
		
		JComboBox comboBoxDistanceWalkedDecimal = new JComboBox(distanceNumbers);
		comboBoxDistanceWalkedDecimal.setBounds(207, 55, 40, 24);
		eggOptionsPanel.add(comboBoxDistanceWalkedDecimal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(199, 524, 117, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(321, 524, 117, 25);
		frame.getContentPane().add(btnExit);
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(12, 344, 426, 176);
		frame.getContentPane().add(textAreaResults);
		
		String[] eventDistanceArray = {"no event", "1/4", "1/2"};
		JComboBox comboBoxEventWalkingDistance = new JComboBox(eventDistanceArray);
		comboBoxEventWalkingDistance.setBounds(348, 205, 90, 24);
		frame.getContentPane().add(comboBoxEventWalkingDistance);
		
		JLabel lblEventWalkingDistance = new JLabel("What is the event walking distance multiplier?");
		lblEventWalkingDistance.setBounds(12, 205, 341, 24);
		frame.getContentPane().add(lblEventWalkingDistance);
	

		

		
		

	}
}
