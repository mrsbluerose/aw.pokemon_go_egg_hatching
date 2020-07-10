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
	
	private EventType eventNone = new EventType("no event", 1.0);
	private EventType eventQuarter = new EventType("1/4", 0.25);
	private EventType eventHalf = new EventType("1/2", 0.5);
	private EventType[] eventCollection = {eventNone,eventQuarter,eventHalf};

	public EggsNew[] getEggCollection() {
		return eggCollection;
	}

	public IncubatorsNew[] getIncubatorCollection() {
		return incubatorCollection;
	}

	public EventType[] getEventCollection() {
		return eventCollection;
	}

	
	
	
}
