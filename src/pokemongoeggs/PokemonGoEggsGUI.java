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
	private final ButtonGroup buttonGroupEvent = new ButtonGroup();
	

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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 132, 426, 70);
		frame.getContentPane().add(textArea);
		
		JPanel eggOptionsPanel = new JPanel();
		eggOptionsPanel.setBounds(15, 241, 423, 91);
		frame.getContentPane().add(eggOptionsPanel);
		eggOptionsPanel.setLayout(null);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setBounds(149, 0, 14, 26);
		eggOptionsPanel.add(mnNewMenu);
		
		JRadioButtonMenuItem rdbtnmntmKm = new JRadioButtonMenuItem("2 KM");
		mnNewMenu.add(rdbtnmntmKm);
		
		JRadioButtonMenuItem rdbtnmntmKm_1 = new JRadioButtonMenuItem("5 KM");
		mnNewMenu.add(rdbtnmntmKm_1);
		
		JRadioButtonMenuItem rdbtnmntmKm_2 = new JRadioButtonMenuItem("7 KM");
		mnNewMenu.add(rdbtnmntmKm_2);
		
		JRadioButtonMenuItem rdbtnmntmKm_3 = new JRadioButtonMenuItem("10 KM");
		mnNewMenu.add(rdbtnmntmKm_3);
		
		JMenu mnNewMenu_1 = new JMenu("");
		mnNewMenu_1.setBounds(149, 27, 14, 26);
		eggOptionsPanel.add(mnNewMenu_1);
		
		JRadioButtonMenuItem rdbtnmntmRegular = new JRadioButtonMenuItem("Regular");
		mnNewMenu_1.add(rdbtnmntmRegular);
		
		JRadioButtonMenuItem rdbtnmntmSuper = new JRadioButtonMenuItem("Super");
		mnNewMenu_1.add(rdbtnmntmSuper);
		
		JMenu mnNewMenu_2 = new JMenu("");
		mnNewMenu_2.setBackground(Color.WHITE);
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.setBounds(149, 55, 14, 26);
		eggOptionsPanel.add(mnNewMenu_2);
		
		JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("1");
		mnNewMenu_2.add(radioButtonMenuItem);
		
		JRadioButtonMenuItem radioButtonMenuItem_1 = new JRadioButtonMenuItem("2");
		mnNewMenu_2.add(radioButtonMenuItem_1);
		
		JRadioButtonMenuItem radioButtonMenuItem_2 = new JRadioButtonMenuItem("3");
		mnNewMenu_2.add(radioButtonMenuItem_2);
		
		JRadioButtonMenuItem radioButtonMenuItem_3 = new JRadioButtonMenuItem("4");
		mnNewMenu_2.add(radioButtonMenuItem_3);
		
		JRadioButtonMenuItem radioButtonMenuItem_4 = new JRadioButtonMenuItem("5");
		mnNewMenu_2.add(radioButtonMenuItem_4);
		
		JRadioButtonMenuItem radioButtonMenuItem_5 = new JRadioButtonMenuItem("6");
		mnNewMenu_2.add(radioButtonMenuItem_5);
		
		JRadioButtonMenuItem radioButtonMenuItem_6 = new JRadioButtonMenuItem("7");
		mnNewMenu_2.add(radioButtonMenuItem_6);
		
		JRadioButtonMenuItem radioButtonMenuItem_7 = new JRadioButtonMenuItem("8");
		mnNewMenu_2.add(radioButtonMenuItem_7);
		
		JRadioButtonMenuItem radioButtonMenuItem_8 = new JRadioButtonMenuItem("9");
		mnNewMenu_2.add(radioButtonMenuItem_8);
		
		JLabel label = new JLabel(".");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setBounds(182, 55, 23, 26);
		eggOptionsPanel.add(label);
		
		JMenu menu = new JMenu("");
		menu.setBackground(Color.WHITE);
		menu.setBounds(198, 55, 14, 24);
		eggOptionsPanel.add(menu);
		
		JRadioButtonMenuItem radioButtonMenuItem_9 = new JRadioButtonMenuItem("1");
		menu.add(radioButtonMenuItem_9);
		
		JRadioButtonMenuItem radioButtonMenuItem_10 = new JRadioButtonMenuItem("2");
		menu.add(radioButtonMenuItem_10);
		
		JRadioButtonMenuItem radioButtonMenuItem_11 = new JRadioButtonMenuItem("3");
		menu.add(radioButtonMenuItem_11);
		
		JRadioButtonMenuItem radioButtonMenuItem_12 = new JRadioButtonMenuItem("4");
		menu.add(radioButtonMenuItem_12);
		
		JRadioButtonMenuItem radioButtonMenuItem_13 = new JRadioButtonMenuItem("5");
		menu.add(radioButtonMenuItem_13);
		
		JRadioButtonMenuItem radioButtonMenuItem_14 = new JRadioButtonMenuItem("6");
		menu.add(radioButtonMenuItem_14);
		
		JRadioButtonMenuItem radioButtonMenuItem_15 = new JRadioButtonMenuItem("7");
		menu.add(radioButtonMenuItem_15);
		
		JRadioButtonMenuItem radioButtonMenuItem_16 = new JRadioButtonMenuItem("8");
		menu.add(radioButtonMenuItem_16);
		
		JRadioButtonMenuItem radioButtonMenuItem_17 = new JRadioButtonMenuItem("9");
		menu.add(radioButtonMenuItem_17);
		
		JButton btnNextEgg = new JButton("Enter another egg");
		btnNextEgg.setBounds(259, 28, 164, 25);
		eggOptionsPanel.add(btnNextEgg);
		
		JButton btnDone = new JButton("Display Results");
		btnDone.setBounds(259, 66, 164, 25);
		eggOptionsPanel.add(btnDone);
		
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
		
		JMenu mnWhatIsThe = new JMenu("What is the current event walking distance?     ");
		mnWhatIsThe.setBounds(12, 214, 344, 19);
		frame.getContentPane().add(mnWhatIsThe);
		
		JRadioButtonMenuItem rdbtnmntmNoEvent = new JRadioButtonMenuItem("no event");
		mnWhatIsThe.add(rdbtnmntmNoEvent);
		
		JRadioButtonMenuItem rdbtnmntmDistance = new JRadioButtonMenuItem("1/4 distance");
		mnWhatIsThe.add(rdbtnmntmDistance);
		
		JRadioButtonMenuItem rdbtnmntmDistance_1 = new JRadioButtonMenuItem("1/2 distance");
		mnWhatIsThe.add(rdbtnmntmDistance_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(199, 524, 117, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(321, 524, 117, 25);
		frame.getContentPane().add(btnExit);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 344, 426, 176);
		frame.getContentPane().add(textArea_1);
	

		

		
		

	}
}
