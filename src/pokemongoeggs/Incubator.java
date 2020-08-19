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
