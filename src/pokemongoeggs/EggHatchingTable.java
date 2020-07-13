package pokemongoeggs;

/**
 * <h1>Egg Hatching Reference Table</h1> Build and print out a reference table
 * with egg incubator times and when to place the next eggs.
 * 
 * @author audra
 *
 */

public class EggHatchingTable {

	/**
	 * Build Eggs Array Instantiate Eggs and Incubators Build an array of egg
	 * distances for each incubator
	 * 
	 * @param eventMultiplier
	 * @return
	 */
	double[] eggArray;
	double[][] table;
	String[] headers;
	int length;
	double event;
	
	public EggHatchingTable(EventMultiplier eventMultiplier, MasterList masterList) {
		event = eventMultiplier.getMultiplier();
		length = masterList.getEggCollection().length * masterList.getIncubatorCollection().length;
		eggArray = buildEggArray(event, masterList,length);
		//table = buildDistanceArray(eggArray);
	}
	
	private double[] buildEggArray(double eventMultiplier, MasterList masterList, int length) {
//		Egg10KM ten = new Egg10KM();
//		Egg7KM seven = new Egg7KM();
//		Egg5KM five = new Egg5KM();
//		Egg2KM two = new Egg2KM();
//		Incubator regularIncubator = new IncubatorTypeRegular();
//		Incubator superIncubator = new IncubatorTypeSuper();
//
//		double regularIncubatorDistance = regularIncubator.getIncubatorMultiplier();
//		double superIncubatorDistance = superIncubator.getIncubatorMultiplier();
//
//		double[] eggsArray = { (ten.getEggWalkingDistance() * regularIncubatorDistance * eventMultiplier),
//				(seven.getEggWalkingDistance() * regularIncubatorDistance * eventMultiplier),
//				(five.getEggWalkingDistance() * regularIncubatorDistance * eventMultiplier),
//				(two.getEggWalkingDistance() * regularIncubatorDistance * eventMultiplier),
//				(ten.getEggWalkingDistance() * superIncubatorDistance * eventMultiplier),
//				(seven.getEggWalkingDistance() * superIncubatorDistance * eventMultiplier),
//				(five.getEggWalkingDistance() * superIncubatorDistance * eventMultiplier),
//				(two.getEggWalkingDistance() * superIncubatorDistance * eventMultiplier) };
		double[] eggsArray = new double[length];
		EggsNew[] eggs = masterList.getEggCollection();
		IncubatorsNew[] incubators = masterList.getIncubatorCollection();
		for (int i=0; i<eggsArray.length; i++){
			for (int j=0; j<incubators.length; j++) {
				for (int k=0; k<eggs.length; k++) {
					eggsArray[i] = incubators[j].getIncubatorMultiplier() * eggs[k].getEggWalkingDistance() * eventMultiplier;
				}	 
			}
		}
		System.out.print("The eggs array is: ");
		for (int i=0; i<eggsArray.length; i++) {
			System.out.print(eggsArray[i] + "\t");
		}
		
		return eggsArray;
	}

	/**
	 * Build Egg Distance Array Use Eggs array to calculate distances
	 * 
	 * @param eggsArray
	 * @return
	 */
	private double[][] buildDistanceArray(double[] eggsArray) {
		double[][] eggIncubateDistances = new double[eggsArray.length][eggsArray.length];
		// loop through the array, starting with a row and then filling each column in
		// that row
		for (int i = 0; i < eggsArray.length; i++) {
			for (int j = 0; j < eggsArray.length; j++) {
				// round numbers to one decimal to match the game's math
				eggIncubateDistances[i][j] = (Math.round(eggsArray[j] * 10) / 10.0)
						- (Math.round(eggsArray[i] * 10) / 10.0);
			}
		}
		return eggIncubateDistances;
	}
	
//	private String[] buildHeaders(MasterList masterList) {
//		EggsNew[] eggs = masterList.getEggCollection();
//		String[] headers;
//		for (int i=0; i<eggs.length; i++) {
//			headers[i] = eggs[i].get
//		}
//	}

//	// print everything in table format
//	public void printTable(double eventMultiplier) {
//		double[] eggsArray = buildEggArray(eventMultiplier);
//		double[][] eggIncubateDistances = buildDistanceArray(eggsArray);
//
//		if (eventMultiplier == 1) {
//			System.out.println("****************************************************************"
//					+ "****************************************************************");
//			System.out.println("\t\t\t\t\t\tPOKEMON GO STANDARD EGG HATCHING TABLE\n");
//			System.out.println(
//					"This table helps you determine when to place eggs in incubators to have them hatch at the same time.");
//			System.out.println("The top row refers to the eggs you have in incubators. The left column refers to the "
//					+ "eggs you want to place.");
//			System.out.println("****************************************************************"
//					+ "****************************************************************");
//		} else {
//			System.out.println("****************************************************************"
//					+ "****************************************************************");
//			System.out.println("\t\t\t\t\t\tPOKEMON GO EVENT EGG HATCHING TABLE\n");
//			System.out.println("This table helps you determine when to place eggs in incubators DURING the "
//					+ "event to have them hatch at the same time. \nNote: most events only affect eggs placed during the event.");
//			System.out.println("The top row refers to the eggs you have in incubators. The left column refers "
//					+ "to the eggs you want to place.");
//			System.out.println("****************************************************************"
//					+ "****************************************************************");
//		}
//		
//		// print header row of egg types
//		System.out.print("\t");
//		for (int i = 0; i < eggsArray.length; i++) {
//			PrintFormatter.formatNumbers(eggsArray[i], true);
//			System.out.print("\t\t");
//		}
//
//		// print egg type as first entry in each row
//		for (int i = 0; i < eggsArray.length; i++) {
//			System.out.println("");
//			PrintFormatter.formatNumbers(eggsArray[i], true); //uses static method in Main
//			System.out.print("\t");
//
//			// print distances for each egg type in each incubator column. For "0", print
//			// "same". For negative, print "***"
//			for (int j = 0; j < eggsArray.length; j++) {
//				if (eggIncubateDistances[i][j] > 0) {
//					PrintFormatter.formatNumbers(eggIncubateDistances[i][j], false);
//					System.out.print("\t\t");
//				} else if (eggIncubateDistances[i][j] == 0) {
//					System.out.print("same\t\t");
//				} else {
//					System.out.print("***\t\t");
//				}
//			}
//		}
//
//	}
	
	// print everything in table format
//	public String printTable(double eventMultiplier) {
//		String table = "";
//		double[] eggsArray = buildEggArray(eventMultiplier);
//		double[][] eggIncubateDistances = buildDistanceArray(eggsArray);
//
//		// print header row of egg types
//		System.out.print("\t");
//		for (int i = 0; i < eggsArray.length; i++) {
//			PrintFormatter.formatNumbers(eggsArray[i], true);
//			System.out.print("\t\t");
//		}
//
//		// print egg type as first entry in each row
//		for (int i = 0; i < eggsArray.length; i++) {
//			System.out.println("");
//			PrintFormatter.formatNumbers(eggsArray[i], true); //uses static method in Main
//			System.out.print("\t");
//
//			// print distances for each egg type in each incubator column. For "0", print
//			// "same". For negative, print "***"
//			for (int j = 0; j < eggsArray.length; j++) {
//				if (eggIncubateDistances[i][j] > 0) {
//					PrintFormatter.formatNumbers(eggIncubateDistances[i][j], false);
//					System.out.print("\t\t");
//				} else if (eggIncubateDistances[i][j] == 0) {
//					System.out.print("same\t\t");
//				} else {
//					System.out.print("***\t\t");
//				}
//			}
//		}
//		
//		return table;
//	}

}
