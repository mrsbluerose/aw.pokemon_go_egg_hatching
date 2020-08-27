/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

package pokemongoeggs;

public class Event {
	
	private String eventName;
	private double eventMultiplier;
	
	public Event() {
		
	}
	
	public Event(String name, double multiplier) {
		super();
		this.eventName = name;
		this.eventMultiplier = multiplier;
	}

	public String getName() {
		return eventName;
	}

	public void setName(String name) {
		this.eventName = name;
	}

	public double getMultiplier() {
		return eventMultiplier;
	}

	public void setMultiplier(double multiplier) {
		this.eventMultiplier = multiplier;
	}
	
    @Override
    public String toString() {
        return eventName;
    }
}
