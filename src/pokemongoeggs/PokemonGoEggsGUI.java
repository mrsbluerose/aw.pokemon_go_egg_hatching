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

public class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	private final ButtonGroup buttonGroupEvent = new ButtonGroup();
	private JTextField textField;
	

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
		frame.setBounds(100, 100, 450, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//main menu
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(12, 12, 265, 15);
		frame.getContentPane().add(lblMenu);
		
		JRadioButton rdbtnDisplayTable = new JRadioButton("Display egg hatching table");
		buttonGroupMenu.add(rdbtnDisplayTable);
		rdbtnDisplayTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//mnEventMenu.setVisible(true);
			}
		});
		rdbtnDisplayTable.setBounds(46, 35, 307, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate when an egg will hatch");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.setBounds(46, 62, 307, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for 9 eggs and incubators");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.setBounds(46, 89, 307, 23);
		frame.getContentPane().add(rdbtnCreatePlan);
		
		//Options for all choices
		
		//Get event information
		JLabel lblGetEvent = new JLabel("What is the event walking distance?");
		lblGetEvent.setBounds(12, 202, 290, 15);
		frame.getContentPane().add(lblGetEvent);
		
		JRadioButton rdbtnOneQuarter = new JRadioButton("1/4");
		buttonGroupEvent.add(rdbtnOneQuarter);
		rdbtnOneQuarter.setBounds(46, 225, 61, 23);
		frame.getContentPane().add(rdbtnOneQuarter);
		
		JRadioButton rdbtnOneHalf = new JRadioButton("1/2");
		buttonGroupEvent.add(rdbtnOneHalf);
		rdbtnOneHalf.setBounds(159, 225, 61, 23);
		frame.getContentPane().add(rdbtnOneHalf);
		
		JRadioButton rdbtnNoEvent = new JRadioButton("no event");
		rdbtnNoEvent.setBounds(262, 225, 149, 23);
		frame.getContentPane().add(rdbtnNoEvent);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 120, 369, 70);
		frame.getContentPane().add(textArea);
		
		JLabel lblEgg = new JLabel("Egg");
		lblEgg.setBounds(107, 256, 70, 15);
		frame.getContentPane().add(lblEgg);
		
		JLabel lblIncubator = new JLabel("Incubator");
		lblIncubator.setBounds(181, 257, 70, 15);
		frame.getContentPane().add(lblIncubator);
		
		JLabel lblDistanceWalked = new JLabel("Distance walked");
		lblDistanceWalked.setBounds(272, 256, 124, 15);
		frame.getContentPane().add(lblDistanceWalked);
		
		JPanel eggOptionsPanel = new JPanel();
		eggOptionsPanel.setBounds(46, 306, 331, 194);
		frame.getContentPane().add(eggOptionsPanel);
		eggOptionsPanel.setLayout(new GridLayout(9, 5, 5, 5));
		
		JLabel lblEgg_1 = new JLabel("#1");
		eggOptionsPanel.add(lblEgg_1);
		
		JMenu mnEggType = new JMenu("");
		eggOptionsPanel.add(mnEggType);
		
		JCheckBoxMenuItem chckbxmntmKm = new JCheckBoxMenuItem("2 KM");
		mnEggType.add(chckbxmntmKm);
		
		JCheckBoxMenuItem chckbxmntmKm_1 = new JCheckBoxMenuItem("5 KM");
		mnEggType.add(chckbxmntmKm_1);
		
		JCheckBoxMenuItem chckbxmntmKm_2 = new JCheckBoxMenuItem("7 KM");
		mnEggType.add(chckbxmntmKm_2);
		
		JCheckBoxMenuItem chckbxmntmKm_3 = new JCheckBoxMenuItem("10 KM");
		mnEggType.add(chckbxmntmKm_3);
		
		JLabel lblEgg_1_1 = new JLabel("#2");
		eggOptionsPanel.add(lblEgg_1_1);
		
		JMenu mnEggType_1 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1);
		
		JCheckBoxMenuItem chckbxmntmKm_4 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1.add(chckbxmntmKm_4);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1.add(chckbxmntmKm_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1.add(chckbxmntmKm_2_1);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1.add(chckbxmntmKm_3_1);
		
		JLabel lblEgg_1_2 = new JLabel("#3");
		eggOptionsPanel.add(lblEgg_1_2);
		
		JMenu mnEggType_1_1 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1.add(chckbxmntmKm_4_1);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1.add(chckbxmntmKm_1_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1.add(chckbxmntmKm_2_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1.add(chckbxmntmKm_3_1_1);
		
		JLabel lblNewLabel = new JLabel("#4");
		eggOptionsPanel.add(lblNewLabel);
		
		JMenu mnEggType_1_1_1 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_1 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_1.add(chckbxmntmKm_4_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_1 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_1.add(chckbxmntmKm_1_1_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_1 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_1.add(chckbxmntmKm_2_1_1_1);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_1 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_1.add(chckbxmntmKm_3_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("#5");
		eggOptionsPanel.add(lblNewLabel_1);
		
		JMenu mnEggType_1_1_2 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_2);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_2 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_2.add(chckbxmntmKm_4_1_2);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_2 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_2.add(chckbxmntmKm_1_1_1_2);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_2 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_2.add(chckbxmntmKm_2_1_1_2);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_2 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_2.add(chckbxmntmKm_3_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("#6");
		eggOptionsPanel.add(lblNewLabel_2);
		
		JMenu mnEggType_1_1_3 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_3);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_3 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_3.add(chckbxmntmKm_4_1_3);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_3 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_3.add(chckbxmntmKm_1_1_1_3);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_3 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_3.add(chckbxmntmKm_2_1_1_3);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_3 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_3.add(chckbxmntmKm_3_1_1_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("#7");
		eggOptionsPanel.add(lblNewLabel_1_1);
		
		JMenu mnEggType_1_1_4 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_4);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_4 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_4.add(chckbxmntmKm_4_1_4);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_4 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_4.add(chckbxmntmKm_1_1_1_4);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_4 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_4.add(chckbxmntmKm_2_1_1_4);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_4 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_4.add(chckbxmntmKm_3_1_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("#8");
		eggOptionsPanel.add(lblNewLabel_1_1_1);
		
		JMenu mnEggType_1_1_5 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_5);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_5 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_5.add(chckbxmntmKm_4_1_5);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_5 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_5.add(chckbxmntmKm_1_1_1_5);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_5 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_5.add(chckbxmntmKm_2_1_1_5);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_5 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_5.add(chckbxmntmKm_3_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("#9");
		eggOptionsPanel.add(lblNewLabel_1_1_1_1);
		
		JMenu mnEggType_1_1_5_1 = new JMenu("");
		eggOptionsPanel.add(mnEggType_1_1_5_1);
		
		JCheckBoxMenuItem chckbxmntmKm_4_1_5_1 = new JCheckBoxMenuItem("2 KM");
		mnEggType_1_1_5_1.add(chckbxmntmKm_4_1_5_1);
		
		JCheckBoxMenuItem chckbxmntmKm_1_1_1_5_1 = new JCheckBoxMenuItem("5 KM");
		mnEggType_1_1_5_1.add(chckbxmntmKm_1_1_1_5_1);
		
		JCheckBoxMenuItem chckbxmntmKm_2_1_1_5_1 = new JCheckBoxMenuItem("7 KM");
		mnEggType_1_1_5_1.add(chckbxmntmKm_2_1_1_5_1);
		
		JCheckBoxMenuItem chckbxmntmKm_3_1_1_5_1 = new JCheckBoxMenuItem("10 KM");
		mnEggType_1_1_5_1.add(chckbxmntmKm_3_1_1_5_1);
		
		textField = new JTextField();
		textField.setBounds(282, 279, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	

		

		
		

	}
}
