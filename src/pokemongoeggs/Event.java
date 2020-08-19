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
