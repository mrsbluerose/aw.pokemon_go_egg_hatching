package pokemongoeggs;

/**
 * <h1>5 Kilometer Egg</h1>
 * 
 * @author audra
 *
 */
public class Egg5KM extends Egg {

	private final String NAME = "5 KM";
	private final int EGG_WALKING_DISTANCE = 5;
	private boolean isIncubating = false;
	private double distanceWalked = 0.0;
	private double eventMultiplier = 1;
	private double incubatorMultiplier = 1;

	public double getEggWalkingDistance() {
		return EGG_WALKING_DISTANCE * eventMultiplier * incubatorMultiplier;
	}

	public boolean isIncubating() {
		return isIncubating;
	}

	public void setIncubating(boolean isIncubating) {
		this.isIncubating = isIncubating;
	}

	public double getDistanceWalked() {
		return distanceWalked;
	}

	public void setDistanceWalked(double distanceWalked) {
		this.distanceWalked = distanceWalked;
	}

	public double getEventMultiplier() {
		return eventMultiplier;
	}

	public void setEventMultiplier(double eventMultiplier) {
		this.eventMultiplier = eventMultiplier;
	}

	public double getIncubatorMultiplier() {
		return incubatorMultiplier;
	}

	public void setIncubatorMultiplier(double incubatorMultiplier) {
		this.incubatorMultiplier = incubatorMultiplier;
	}
	public String getName() {
		return NAME;
	}
    @Override
    public String toString() {
        return NAME;
    }

}
