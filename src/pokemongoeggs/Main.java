/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

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
