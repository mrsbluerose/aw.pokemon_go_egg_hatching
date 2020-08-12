package pokemongoeggs;

public class Incubator {

	private String name;
	private double incubatorMultiplier;
	
	public Incubator() {
		
	}
	
    public Incubator(String name, double incubatorMultiplier) {
		super();
		this.name = name;
		this.incubatorMultiplier = incubatorMultiplier;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getIncubatorMultiplier() {
		return incubatorMultiplier;
	}


	public void setIncubatorMultiplier(double incubatorMultiplier) {
		this.incubatorMultiplier = incubatorMultiplier;
	}

	@Override
    public String toString() {
        return name;
    }
	
}
