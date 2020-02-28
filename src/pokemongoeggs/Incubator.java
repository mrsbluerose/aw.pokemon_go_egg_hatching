package pokemongoeggs;

/**
 * <h1>Incubator Class</h1> Used to make sure all Incubators have the necessary
 * fields.
 * 
 * @author audra
 *
 */
public abstract class Incubator {
	double incubatorMultiplier;
	int incubatorKey; // may use for table reference

	public abstract double getIncubatorMultiplier();
}
