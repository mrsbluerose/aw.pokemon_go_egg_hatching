package pokemongoeggs;

/**
 * <h1>Egg Class</h1> Used to make sure all egg types have the necessary fields.
 * 
 * @author audra
 *
 */
public abstract class Egg {
	int eggWalkingDistance;
	int key; // ?

	boolean isIncubating;
	double distanceWalked;

	public abstract int getEggWalkingDistance();

}
