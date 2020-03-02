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

	private Egg egg1;
	private Egg egg2;
	private Egg egg3;
	private Egg egg4;
	private Egg egg5;
	private Egg egg6;
	private Egg egg7;
	private Egg egg8;	
	private Egg egg9;

	private int incubatorRegularQty;
	private int incubatorSuperQty;
	
	public Egg getEgg1() {
		return egg1;
	}
	public void setEgg1(Egg egg1) {
		this.egg1 = egg1;
	}
	public Egg getEgg2() {
		return egg2;
	}
	public void setEgg2(Egg egg2) {
		this.egg2 = egg2;
	}
	public Egg getEgg3() {
		return egg3;
	}
	public void setEgg3(Egg egg3) {
		this.egg3 = egg3;
	}
	public Egg getEgg4() {
		return egg4;
	}
	public void setEgg4(Egg egg4) {
		this.egg4 = egg4;
	}
	public Egg getEgg5() {
		return egg5;
	}
	public void setEgg5(Egg egg5) {
		this.egg5 = egg5;
	}
	public Egg getEgg6() {
		return egg6;
	}
	public void setEgg6(Egg egg6) {
		this.egg6 = egg6;
	}
	public Egg getEgg7() {
		return egg7;
	}
	public void setEgg7(Egg egg7) {
		this.egg7 = egg7;
	}
	public Egg getEgg8() {
		return egg8;
	}
	public void setEgg8(Egg egg8) {
		this.egg8 = egg8;
	}
	public Egg getEgg9() {
		return egg9;
	}
	public void setEgg9(Egg egg9) {
		this.egg9 = egg9;
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

	//
//	private int egg10KMQty;
//	private int egg7KMQty;
//	private int egg5KMQty;
//	private int egg2KMQty;
//	private int incubatorRegularQty;
//	private int incubatorSuperQty;
//
//	private Egg egg10KM = new Egg10KM();
//	private Egg egg7KM = new Egg7KM();
//	private Egg egg5KM = new Egg5KM();
//	private Egg egg2KM = new Egg2KM();
//	private Incubator incubatorRegular = new IncubatorRegular();
//	private Incubator incubatorSuper = new IncubatorSuper();
//
////	private double[][] egg10KMIncubating;
////	private double[][] egg7KMIncubating;
////	private double[][] egg5KMIncubating;
////	private double[][] egg2KMIncubating;
//
//	public int getEgg10KMQty() {
//		return egg10KMQty;
//	}
//
//	public void setEgg10KMQty(int egg10kmQty) {
//		egg10KMQty = egg10kmQty;
//	}
//
//	public int getEgg7KMQty() {
//		return egg7KMQty;
//	}
//
//	public void setEgg7KMQty(int egg7kmQty) {
//		egg7KMQty = egg7kmQty;
//	}
//
//	public int getEgg5KMQty() {
//		return egg5KMQty;
//	}
//
//	public void setEgg5KMQty(int egg5kmQty) {
//		egg5KMQty = egg5kmQty;
//	}
//
//	public int getEgg2KMQty() {
//		return egg2KMQty;
//	}
//
//	public void setEgg2KMQty(int egg2kmQty) {
//		egg2KMQty = egg2kmQty;
//	}
//
//	public int getIncubatorRegularQty() {
//		return incubatorRegularQty;
//	}
//
//	public void setIncubatorRegularQty(int incubatorRegularQty) {
//		this.incubatorRegularQty = incubatorRegularQty;
//	}
//
//	public int getIncubatorSuperQty() {
//		return incubatorSuperQty;
//	}
//
//	public void setIncubatorSuperQty(int incubatorSuperQty) {
//		this.incubatorSuperQty = incubatorSuperQty;
//	}
//
//	public Egg getEgg10KM() {
//		return egg10KM;
//	}
//
//	public void setEgg10KM(Egg egg10km) {
//		egg10KM = egg10km;
//	}
//
//	public Egg getEgg7KM() {
//		return egg7KM;
//	}
//
//	public void setEgg7KM(Egg egg7km) {
//		egg7KM = egg7km;
//	}
//
//	public Egg getEgg5KM() {
//		return egg5KM;
//	}
//
//	public void setEgg5KM(Egg egg5km) {
//		egg5KM = egg5km;
//	}
//
//	public Egg getEgg2KM() {
//		return egg2KM;
//	}
//
//	public void setEgg2KM(Egg egg2km) {
//		egg2KM = egg2km;
//	}
//
//	public Incubator getIncubatorRegular() {
//		return incubatorRegular;
//	}
//
//	public void setIncubatorRegular(Incubator incubatorRegular) {
//		this.incubatorRegular = incubatorRegular;
//	}
//
//	public Incubator getIncubatorSuper() {
//		return incubatorSuper;
//	}
//
//	public void setIncubatorSuper(Incubator incubatorSuper) {
//		this.incubatorSuper = incubatorSuper;
//	}
////	public double[][] getEgg10KMIncubating() {
////		return egg10KMIncubating;
////	}
////	public void setEgg10KMIncubating(double[][] egg10kmIncubating) {
////		egg10KMIncubating = egg10kmIncubating;
////	}
////	public double[][] getEgg7KMIncubating() {
////		return egg7KMIncubating;
////	}
////	public void setEgg7KMIncubating(double[][] egg7kmIncubating) {
////		egg7KMIncubating = egg7kmIncubating;
////	}
////	public double[][] getEgg5KMIncubating() {
////		return egg5KMIncubating;
////	}
////	public void setEgg5KMIncubating(double[][] egg5kmIncubating) {
////		egg5KMIncubating = egg5kmIncubating;
////	}
////	public double[][] getEgg2KMIncubating() {
////		return egg2KMIncubating;
////	}
////	public void setEgg2KMIncubating(double[][] egg2kmIncubating) {
////		egg2KMIncubating = egg2kmIncubating;
////	}

}
