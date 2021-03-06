/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

package pokemongoeggs;

public class MasterList {
	private Egg egg2KM = new Egg("2KM", 2.0, 2.0);
	private Egg egg5KM = new Egg("5KM", 5.0, 5.0);
	private Egg egg7KM = new Egg("7KM", 7.0, 7.0);
	private Egg egg10KM = new Egg("10KM", 10.0, 10.0);
	private Egg[] eggCollection = {egg2KM, egg5KM, egg7KM, egg10KM};
	
	private Incubator incubatorRegular = new Incubator("regular", 1.0);
	private Incubator incubatorSuper = new Incubator("super", 0.66667);
	private Incubator[] incubatorCollection = {incubatorRegular,incubatorSuper};
	
	private Event eventNone = new Event("no event", 1.0);
	private Event eventQuarter = new Event("1/4", 0.25);
	private Event eventHalf = new Event("1/2", 0.5);
	private Event[] eventCollection = {eventNone,eventQuarter,eventHalf};
	
	private String[] possibleEggDistanceWholeNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String[] possibleEggDistanceDecimals = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private int maxEggsAllowed = 9;
	private String[] maxEggsAllowedNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

	public Egg[] getEggCollection() {
		return eggCollection;
	}

	public Incubator[] getIncubatorCollection() {
		return incubatorCollection;
	}

	public Event[] getEventCollection() {
		return eventCollection;
	}

	public int getMaxEggAllowed() {
		return maxEggsAllowed;
	}

	public String[] getPossibleEggDistanceWholeNumbers() {
		return possibleEggDistanceWholeNumbers;
	}

	public String[] getPossibleEggDistanceDecimals() {
		return possibleEggDistanceDecimals;
	}

	public String[] getMaxEggsAllowedNumbers() {
		return maxEggsAllowedNumbers;
	}
	
	
	
}
