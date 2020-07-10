package pokemongoeggs;

public class IncubatorSuper extends Incubator {
	
	String name = "super";
	double incubatorMultiplier = 0.66667;
	
	@Override
	public double getIncubatorMultiplier() {
		// TODO Auto-generated method stub
		return incubatorMultiplier;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIncubatorMultiplier(double incubatorMultiplier) {
		this.incubatorMultiplier = incubatorMultiplier;
	}


}
