package pokemongoeggs;

import java.awt.EventQueue;

/**
 * <h1>Pokemon Go Egg-Hatching Optimizer</h1> This program helps trainers
 * optimize the XP gain from hatching all eggs at once by calculating when to
 * place them in incubators. Aim for an event window and/or throw on a lucky egg
 * bonus to hatch all your pokemon (hopefully some new ones) at once!
 * 
 * @author audra
 *
 */

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PokemonGoEggsGUI();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
