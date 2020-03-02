package pokemongoeggs;

/**
 * <h1>Egg Class</h1> Used to make sure all egg types have the necessary fields.
 * 
 * @author audra
 *
 */
public abstract class Egg {
	double eggWalkingDistance;
	int key; //may use for table references

	boolean isIncubating;
	double distanceWalked;

	public abstract double getEggWalkingDistance();

}
