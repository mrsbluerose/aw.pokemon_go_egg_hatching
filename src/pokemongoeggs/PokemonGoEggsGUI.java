package pokemongoeggs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;

public class PokemonGoEggsGUI {

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(12, 12, 265, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnDisplayEggHatching = new JRadioButton("Display egg hatching table");
		rdbtnDisplayEggHatching.setBounds(12, 35, 307, 23);
		frame.getContentPane().add(rdbtnDisplayEggHatching);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Calculate when an egg will hatch");
		rdbtnNewRadioButton.setBounds(12, 62, 307, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Create a plan for 9 eggs and incubators");
		rdbtnNewRadioButton_1.setBounds(12, 89, 307, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
