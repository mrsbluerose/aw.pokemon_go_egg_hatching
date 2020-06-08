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

public class PokemonGoEggsGUI {

	private JFrame frame;
	private final ButtonGroup buttonGroupMenu = new ButtonGroup();
	private final ButtonGroup buttonGroupEvent = new ButtonGroup();
	private final ButtonGroup buttonGroupIncubator = new ButtonGroup();
	

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
		lblGetEvent.setBounds(12, 133, 290, 15);
		frame.getContentPane().add(lblGetEvent);
		
		JRadioButton rdbtnOneQuarter = new JRadioButton("1/4");
		buttonGroupEvent.add(rdbtnOneQuarter);
		rdbtnOneQuarter.setBounds(46, 156, 61, 23);
		frame.getContentPane().add(rdbtnOneQuarter);
		
		JRadioButton rdbtnOneHalf = new JRadioButton("1/2");
		buttonGroupEvent.add(rdbtnOneHalf);
		rdbtnOneHalf.setBounds(159, 156, 61, 23);
		frame.getContentPane().add(rdbtnOneHalf);
		
		JRadioButton rdbtnNoEvent = new JRadioButton("no event");
		rdbtnNoEvent.setBounds(262, 156, 149, 23);
		frame.getContentPane().add(rdbtnNoEvent);
		

		//Get incubator information
		JLabel lblIncubatorType = new JLabel("Use regular incubators, super or both?");
		lblIncubatorType.setBounds(12, 198, 286, 15);
		frame.getContentPane().add(lblIncubatorType);
		
		JRadioButton rdbtnRegular = new JRadioButton("regular");
		buttonGroupIncubator.add(rdbtnRegular);
		rdbtnRegular.setBounds(46, 221, 101, 23);
		frame.getContentPane().add(rdbtnRegular);
		
		JRadioButton rdbtnSuper = new JRadioButton("super");
		buttonGroupIncubator.add(rdbtnSuper);
		rdbtnSuper.setBounds(159, 221, 101, 23);
		frame.getContentPane().add(rdbtnSuper);
		
		JRadioButton rdbtnBoth = new JRadioButton("both");
		buttonGroupIncubator.add(rdbtnBoth);
		rdbtnBoth.setBounds(262, 221, 149, 23);
		frame.getContentPane().add(rdbtnBoth);
	

		

		
		

	}
}
