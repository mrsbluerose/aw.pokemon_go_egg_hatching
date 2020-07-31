package pokemongoeggs;

public class MasterList {
	private EggsNew egg2KM = new EggsNew("2KM", 2.0);
	private EggsNew egg5KM = new EggsNew("5KM", 5.0);
	private EggsNew egg7KM = new EggsNew("7KM", 7.0);
	private EggsNew egg10KM = new EggsNew("10KM", 10.0);
	private EggsNew[] eggCollection = {egg2KM, egg5KM, egg7KM, egg10KM};
	
	private IncubatorsNew incubatorRegular = new IncubatorsNew("regular", 1.0);
	private IncubatorsNew incubatorSuper = new IncubatorsNew("super", 0.66667);
	private IncubatorsNew[] incubatorCollection = {incubatorRegular,incubatorSuper};
	
	private EventMultiplier eventNone = new EventMultiplier("no event", 1.0);
	private EventMultiplier eventQuarter = new EventMultiplier("1/4", 0.25);
	private EventMultiplier eventHalf = new EventMultiplier("1/2", 0.5);
	private EventMultiplier[] eventCollection = {eventNone,eventQuarter,eventHalf};
	
	private String[] possibleEggDistanceWholeNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String[] possibleEggDistanceDecimals = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private int maxEggAllowed = 9;
	private String[] maxEggsAllowedNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

	public EggsNew[] getEggCollection() {
		return eggCollection;
	}

	public IncubatorsNew[] getIncubatorCollection() {
		return incubatorCollection;
	}

	public EventMultiplier[] getEventCollection() {
		return eventCollection;
	}

	public int getMaxEggAllowed() {
		return maxEggAllowed;
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
