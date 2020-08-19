package pokemongoeggs;

public class Event {
	
	private String name;
	private double multiplier;
	
	public Event() {
		
	}
	
	public Event(String name, double multiplier) {
		super();
		this.name = name;
		this.multiplier = multiplier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	
    @Override
    public String toString() {
        return name;
    }
}
