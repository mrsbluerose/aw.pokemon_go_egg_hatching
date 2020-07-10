package pokemongoeggs;

public class IncubatorTypeRegular extends Incubator {

	private final String NAME = "regular";
	private final double INCUBATOR_MULTIPLIER = 1;
	
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
