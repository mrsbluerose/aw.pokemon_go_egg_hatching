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

	private EggsNew egg1;
	private EggsNew egg2;
	private EggsNew egg3;
	private EggsNew egg4;
	private EggsNew egg5;
	private EggsNew egg6;
	private EggsNew egg7;
	private EggsNew egg8;	
	private EggsNew egg9;
	private EggsNew eggInventory[] = {egg1,egg2,egg3,egg4,egg5,egg6,egg7,egg8,egg9};

//	private int egg10KMQty;
//	private int egg7KMQty;
//	private int egg5KMQty;
//	private int egg2KMQty;
//	private int incubatorRegularQty;
//	private int incubatorSuperQty;
	
	public EggsNew getEgg1() {
		return egg1;
	}
	public void setEgg1(EggsNew egg1) {
		this.egg1 = egg1;
	}
	public EggsNew getEgg2() {
		return egg2;
	}
	public void setEgg2(EggsNew egg2) {
		this.egg2 = egg2;
	}
	public EggsNew getEgg3() {
		return egg3;
	}
	public void setEgg3(EggsNew egg3) {
		this.egg3 = egg3;
	}
	public EggsNew getEgg4() {
		return egg4;
	}
	public void setEgg4(EggsNew egg4) {
		this.egg4 = egg4;
	}
	public EggsNew getEgg5() {
		return egg5;
	}
	public void setEgg5(EggsNew egg5) {
		this.egg5 = egg5;
	}
	public EggsNew getEgg6() {
		return egg6;
	}
	public void setEgg6(EggsNew egg6) {
		this.egg6 = egg6;
	}
	public EggsNew getEgg7() {
		return egg7;
	}
	public void setEgg7(EggsNew egg7) {
		this.egg7 = egg7;
	}
	public EggsNew getEgg8() {
		return egg8;
	}
	public void setEgg8(EggsNew egg8) {
		this.egg8 = egg8;
	}
	public EggsNew getEgg9() {
		return egg9;
	}
	public void setEgg9(EggsNew egg9) {
		this.egg9 = egg9;
	}
//	public int getIncubatorRegularQty() {
//		return incubatorRegularQty;
//	}
//	public void setIncubatorRegularQty(int incubatorRegularQty) {
//		this.incubatorRegularQty = incubatorRegularQty;
//	}
//	public int getIncubatorSuperQty() {
//		return incubatorSuperQty;
//	}
//	public void setIncubatorSuperQty(int incubatorSuperQty) {
//		this.incubatorSuperQty = incubatorSuperQty;
//	}
	public EggsNew[] getEggInventory() {
		return eggInventory;
	}

//	@Override
//	public String toString(){
//		return "Egg 1: " + egg1 + " " + egg1.get;
//	}

}
