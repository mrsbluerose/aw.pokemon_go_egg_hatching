/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

package pokemongoeggs;

public class Incubator {

	private String incubatorName;
	private double incubatorMultiplier;
	
	public Incubator() {
		
	}
	
    public Incubator(String name, double incubatorMultiplier) {
		super();
		this.incubatorName = name;
		this.incubatorMultiplier = incubatorMultiplier;
	}

	public String getName() {
		return incubatorName;
	}


	public void setName(String name) {
		this.incubatorName = name;
	}


	public double getIncubatorMultiplier() {
		return incubatorMultiplier;
	}


	public void setIncubatorMultiplier(double incubatorMultiplier) {
		this.incubatorMultiplier = incubatorMultiplier;
	}

	@Override
    public String toString() {
        return incubatorName;
    }
	
}
