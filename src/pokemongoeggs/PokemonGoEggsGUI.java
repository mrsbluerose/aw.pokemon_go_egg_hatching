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
		frame.setBounds(100, 100, 450, 438);
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
				mnEventMenu.setVisible(true);
			}
		});
		rdbtnDisplayTable.setBounds(12, 35, 307, 23);
		frame.getContentPane().add(rdbtnDisplayTable);
		
		JRadioButton rdbtnCalculateEgg = new JRadioButton("Calculate when an egg will hatch");
		buttonGroupMenu.add(rdbtnCalculateEgg);
		rdbtnCalculateEgg.setBounds(12, 62, 307, 23);
		frame.getContentPane().add(rdbtnCalculateEgg);
		
		JRadioButton rdbtnCreatePlan = new JRadioButton("Create a plan for 9 eggs and incubators");
		buttonGroupMenu.add(rdbtnCreatePlan);
		rdbtnCreatePlan.setBounds(12, 89, 307, 23);
		frame.getContentPane().add(rdbtnCreatePlan);
		
		JLabel lblGetEvent = new JLabel("What is the event walking distance?");
		lblGetEvent.setBounds(12, 133, 265, 15);
		frame.getContentPane().add(lblGetEvent);
		
		JRadioButton rdbtnOneQuarter = new JRadioButton("1/4");
		buttonGroupEvent.add(rdbtnOneQuarter);
		rdbtnOneQuarter.setBounds(291, 129, 61, 23);
		frame.getContentPane().add(rdbtnOneQuarter);
		
		JRadioButton rdbtnOneHalf = new JRadioButton("1/2");
		buttonGroupEvent.add(rdbtnOneHalf);
		rdbtnOneHalf.setBounds(361, 129, 61, 23);
		frame.getContentPane().add(rdbtnOneHalf);
		

	}
}
