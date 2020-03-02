package pokemongoeggs;

/**
 * <h1>5 Kilometer Egg</h1>
 * 
 * @author audra
 *
 */
public class Egg5KM extends Egg {

	private double eggWalkingDistance = 5;
	boolean isIncubating = false;
	double distanceWalked = 0.0;
	double eventMultiplier = 1;

	public double getEggWalkingDistance() {
		return eggWalkingDistance * eventMultiplier;
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
}
