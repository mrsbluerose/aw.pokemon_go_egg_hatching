package pokemongoeggs;

/**
 * <h1>Charted Plan for Hatching</h1> **In Progress**
 * 
 * Based on the user's inventory and choices, print the best plan for hatching
 * all eggs at once. Offer most efficient plan with the given choices
 * 
 * @author audra
 *
 */
public class ChartedPlan {
	Inventory inventory;

	public ChartedPlan(Inventory inventory) {
		this.inventory = inventory;
	}

//	public void getPlan() {
//		if(inventory.getQuantity7KMEggs()>0) {
//			//System.out.println("Place 10 km eggs in SUPER incubators to start.");
//			egg10 = true;
//		} else if(inventory.getQuantity10KMEggs()>0) {
//			//System.out.println("Place 5 km eggs in REGULAR incubators when 10 km eggs are at 1.7 km.");
//			//Testing table
//			//System.out.printf("Place 5 km eggs in REGULAR incubators when 10 km eggs are at %.1f", eggIncubateDistances[index5Reg][index10Sup]);
//			egg7 = true;
//		}else if(inventory.getQuantity5KMEggs()>0) {
//			//System.out.println("Place 7 km eggs in SUPER incubators when 10 km eggs are at 2.0 km.");
//			egg5 = true;
//		} else { //(inventory.getQuantity2KMEggs()>0) {
//			//System.out.println("Place 2 km eggs in REGULAR incubators when 10 km eggs are at 4.7 km.");
//			egg2 = true;
//		}	
//		
//	}


	public void printPlan() {
		// TODO use calculated table to determine most efficient plan
		EggHatchingTable standardTable = new EggHatchingTable();
		double[] eggsArray = standardTable.buildEggArray(1);
		double[][] eggIncubateDistances = standardTable.buildDistanceArray(eggsArray);

		double egg10KMDistance;
		double egg7KMDistance;
		double egg5KMDistance;
		double egg2KMDistance;

		System.out.println("The fastest hatching plan is: ");
		if (inventory.getEgg7KMQty() > 0) {
			egg10KMDistance = eggIncubateDistances[4][1];
			egg5KMDistance = eggIncubateDistances[6][1];
			egg2KMDistance = eggIncubateDistances[7][1];

			System.out.println("1 - Place 7 km eggs in REGUALR incubators.");
			System.out.println("2 - Place 10 km eggs in SUPER incubators when 7 km is at: ");
			PrintFormatter.formatNumbers(egg10KMDistance, false);
			System.out.println("3 - Place 5 km eggs in REGULAR incubators when 7 km is at: ");
			PrintFormatter.formatNumbers(egg5KMDistance, false);
			;
			System.out.println("4 - Place 2 km eggs in REGULAR incubators when 7 km is at: ");
			PrintFormatter.formatNumbers(egg2KMDistance, false);

		} else {
			egg5KMDistance = eggIncubateDistances[2][4];
			egg2KMDistance = eggIncubateDistances[3][4];

			System.out.println("1 - Place 10 km eggs in SUPER incubators.");
			System.out.println("2 - Place 5 km eggs in REGULAR incubators when 10 km is at: ");
			PrintFormatter.formatNumbers(egg5KMDistance, false);
			;
			System.out.println("3 - Place 2 km eggs in REGULAR incubators when 7 km is at: ");
			PrintFormatter.formatNumbers(egg2KMDistance, false);
		}

		//////////////////////
//		int index10Reg = 0;
//		int index10Sup = 4;
//		int index7Reg = 1;
//		int index7Sup = 5;
//		int index5Reg = 2;
//		int index5Sup = 6;
//		int index2Reg = 3;
//		int index2Sup = 7;
//		int index1 = 0;
//		int index2 = 0;
//		boolean egg10 = false;
//		boolean egg7 = false;
//		boolean egg5 = false;
//		boolean egg2 = false;
//		
//		printInventory();
//		
//		if(inventory.getQuantity10KMEggs()>0) {
//			//System.out.println("Place 10 km eggs in SUPER incubators to start.");
//			egg10 = true;
//		} else if(inventory.getQuantity5KMEggs()>0) {
//			//System.out.println("Place 5 km eggs in REGULAR incubators when 10 km eggs are at 1.7 km.");
//			//Testing table
//			//System.out.printf("Place 5 km eggs in REGULAR incubators when 10 km eggs are at %.1f", eggIncubateDistances[index5Reg][index10Sup]);
//			egg7 = true;
//		}else if(inventory.getQuantity7KMEggs()>0) {
//			//System.out.println("Place 7 km eggs in SUPER incubators when 10 km eggs are at 2.0 km.");
//			egg5 = true;
//		} else { //(inventory.getQuantity2KMEggs()>0) {
//			//System.out.println("Place 2 km eggs in REGULAR incubators when 10 km eggs are at 4.7 km.");
//			egg2 = true;
//		}	

//		if(egg10 = true) {
//			//System.out.println("Place 10 km eggs in SUPER incubators to start.");
//		} else if(egg7 = true) {
//			//System.out.println("Place 5 km eggs in REGULAR incubators when 10 km eggs are at 1.7 km.");
//			//Testing table
//			//System.out.printf("Place 5 km eggs in REGULAR incubators when 10 km eggs are at %.1f", eggIncubateDistances[index5Reg][index10Sup]);
//		}else if(egg5 = true) {
//			//System.out.println("Place 7 km eggs in SUPER incubators when 10 km eggs are at 2.0 km.");
//		} else { //(inventory.getQuantity2KMEggs()>0) {
//			//System.out.println("Place 2 km eggs in REGULAR incubators when 10 km eggs are at 4.7 km.");
//		}
//		

	}

//	public void printInventory() {
//		System.out.println("\n");
//		System.out.println("Your Inventory:");
//		System.out.println("10 KM Eggs: " + inventory.getQuantity10KMEggs());
//		System.out.println("7 KM Eggs: " + inventory.getQuantity7KMEggs());
//		System.out.println("5 KM Eggs: " + inventory.getQuantity5KMEggs());
//		System.out.println("2 KM Eggs: " + inventory.getQuantity2KMEggs());
//		System.out.println("Regular Incubators: " + inventory.getQuantityIncubatorsRegular());
//		System.out.println("Super Incubators: " + inventory.getQuantityIncubatorsSuper());
//	}

}
