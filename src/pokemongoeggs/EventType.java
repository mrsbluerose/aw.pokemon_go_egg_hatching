package pokemongoeggs;

public class EventType {
	
	private String name;
	private double multiplier;
	
	public EventType() {
		
	}
	
	public EventType(String name, double multiplier) {
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
