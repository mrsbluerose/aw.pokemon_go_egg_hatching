package pokemongoeggs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Pokemon Egg and Incubator Inventory</h1> Keep track of the quantity of
 * each egg and incubator types.
 * 
 * @author audra
 *
 */
public class Inventory {

	private int egg10KMQty;
	private int egg7KMQty;
	private int egg5KMQty;
	private int egg2KMQty;
	private int incubatorRegularQty;
	private int incubatorSuperQty;

	private Egg egg10KM = new Egg10KM();
	private Egg egg7KM = new Egg7KM();
	private Egg egg5KM = new Egg5KM();
	private Egg egg2KM = new Egg2KM();
	private Incubator incubatorRegular = new IncubatorRegular();
	private Incubator incubatorSuper = new IncubatorSuper();

//	private double[][] egg10KMIncubating;
//	private double[][] egg7KMIncubating;
//	private double[][] egg5KMIncubating;
//	private double[][] egg2KMIncubating;

	public int getEgg10KMQty() {
		return egg10KMQty;
	}

	public void setEgg10KMQty(int egg10kmQty) {
		egg10KMQty = egg10kmQty;
	}

	public int getEgg7KMQty() {
		return egg7KMQty;
	}

	public void setEgg7KMQty(int egg7kmQty) {
		egg7KMQty = egg7kmQty;
	}

	public int getEgg5KMQty() {
		return egg5KMQty;
	}

	public void setEgg5KMQty(int egg5kmQty) {
		egg5KMQty = egg5kmQty;
	}

	public int getEgg2KMQty() {
		return egg2KMQty;
	}

	public void setEgg2KMQty(int egg2kmQty) {
		egg2KMQty = egg2kmQty;
	}

	public int getIncubatorRegularQty() {
		return incubatorRegularQty;
	}

	public void setIncubatorRegularQty(int incubatorRegularQty) {
		this.incubatorRegularQty = incubatorRegularQty;
	}

	public int getIncubatorSuperQty() {
		return incubatorSuperQty;
	}

	public void setIncubatorSuperQty(int incubatorSuperQty) {
		this.incubatorSuperQty = incubatorSuperQty;
	}

	public Egg getEgg10KM() {
		return egg10KM;
	}

	public void setEgg10KM(Egg egg10km) {
		egg10KM = egg10km;
	}

	public Egg getEgg7KM() {
		return egg7KM;
	}

	public void setEgg7KM(Egg egg7km) {
		egg7KM = egg7km;
	}

	public Egg getEgg5KM() {
		return egg5KM;
	}

	public void setEgg5KM(Egg egg5km) {
		egg5KM = egg5km;
	}

	public Egg getEgg2KM() {
		return egg2KM;
	}

	public void setEgg2KM(Egg egg2km) {
		egg2KM = egg2km;
	}

	public Incubator getIncubatorRegular() {
		return incubatorRegular;
	}

	public void setIncubatorRegular(Incubator incubatorRegular) {
		this.incubatorRegular = incubatorRegular;
	}

	public Incubator getIncubatorSuper() {
		return incubatorSuper;
	}

	public void setIncubatorSuper(Incubator incubatorSuper) {
		this.incubatorSuper = incubatorSuper;
	}
//	public double[][] getEgg10KMIncubating() {
//		return egg10KMIncubating;
//	}
//	public void setEgg10KMIncubating(double[][] egg10kmIncubating) {
//		egg10KMIncubating = egg10kmIncubating;
//	}
//	public double[][] getEgg7KMIncubating() {
//		return egg7KMIncubating;
//	}
//	public void setEgg7KMIncubating(double[][] egg7kmIncubating) {
//		egg7KMIncubating = egg7kmIncubating;
//	}
//	public double[][] getEgg5KMIncubating() {
//		return egg5KMIncubating;
//	}
//	public void setEgg5KMIncubating(double[][] egg5kmIncubating) {
//		egg5KMIncubating = egg5kmIncubating;
//	}
//	public double[][] getEgg2KMIncubating() {
//		return egg2KMIncubating;
//	}
//	public void setEgg2KMIncubating(double[][] egg2kmIncubating) {
//		egg2KMIncubating = egg2kmIncubating;
//	}

}
