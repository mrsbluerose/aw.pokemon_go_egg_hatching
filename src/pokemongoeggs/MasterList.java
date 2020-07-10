package pokemongoeggs;

public class MasterList {
	EggsNew egg2KM = new EggsNew("2KM", 2.0);
	EggsNew egg5KM = new EggsNew("5KM", 5.0);
	EggsNew egg7KM = new EggsNew("7KM", 7.0);
	EggsNew egg10KM = new EggsNew("10KM", 10.0);
	EggsNew[] eggColection = {egg2KM, egg5KM, egg7KM, egg10KM};
	
	IncubatorsNew incubatorRegular = new IncubatorsNew("regular", 1.0);
	IncubatorsNew incubatorSuper = new IncubatorsNew("super", 0.66667);
	IncubatorsNew[] incubatorCollection = {incubatorRegular,incubatorSuper};
	
	EventType eventNone = new EventType("no event", 1.0);
	EventType eventQuarter = new EventType("1/4", 0.25);
	EventType eventHalf = new EventType("1/2", 0.5);
	EventType[] eventCollection = {eventNone,eventQuarter,eventHalf};
}
