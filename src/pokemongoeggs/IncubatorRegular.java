package pokemongoeggs;

public class IncubatorRegular extends Incubator {

	String name = "regular";
	private double incubatorMultiplier = 1;
	
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
