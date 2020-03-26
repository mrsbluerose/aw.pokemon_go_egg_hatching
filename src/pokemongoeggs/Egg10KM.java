package pokemongoeggs;

/**
 * <h1>10 Kilometer Egg</h1>
 * 
 * @author audra
 *
 */
public class Egg10KM extends Egg {
	private int eggWalkingDistance = 10;
	private boolean isIncubating = false;
	private double distanceWalked = 0.0;
	private double eventMultiplier = 1;
	private double incubatorMultiplier = 1;

	public double getEggWalkingDistance() {
		return eggWalkingDistance * eventMultiplier * incubatorMultiplier;
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

}
