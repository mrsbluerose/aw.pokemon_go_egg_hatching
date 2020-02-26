package pokemongoeggs;

/**
 * <h1>7 Kilometer Egg</h1>
 * 
 * @author audra
 *
 */
public class Egg7KM extends Egg {

	private int eggWalkingDistance = 7;

	boolean isIncubating = false;
	double distanceWalked = 0.0;

	public int getEggWalkingDistance() {
		return eggWalkingDistance;
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
