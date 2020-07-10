package pokemongoeggs;

public class IncubatorSuper extends Incubator {
	
	private final String NAME = "super";
	private final double INCUBATOR_MULTIPLIER = 0.66667;
	
	@Override
	public double getIncubatorMultiplier() {
		// TODO Auto-generated method stub
		return INCUBATOR_MULTIPLIER;
	}
	public String getName() {
		return NAME;
	}
    @Override
    public String toString() {
        return NAME;
    }

}
