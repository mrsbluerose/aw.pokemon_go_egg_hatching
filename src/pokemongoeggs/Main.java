package pokemongoeggs;

import java.util.Scanner;

/**
 * <h1>Pokemon Go Egg-Hatching Optimizer</h1> This program helps trainers
 * optimize the XP gain from hatching all eggs at once by calculating when to
 * place them in incubators. Aim for an event window and/or throw on a lucky egg
 * bonus to hatch all your pokemon (hopefully some new ones) at once!
 * 
 * @author audra
 *
 */

public class Main {

	static private int printUserSelectionMenu(Scanner input) {

		int choice;

		System.out.println("\n");
		System.out.println("****************************************************************");
		System.out.println("\t\t\tMENU\n");
		System.out.println("\t1 - Display the Egg Hatching Reference Table\n");
		System.out.println("\t2 - Display an Event Hatching Table\n");
		System.out.println("\t3 - Calculate when an egg will hatch\n");
		System.out.println("\t4 - Create a plan for 9 eggs and incubators\n");
		System.out.println("\t9 - to quit\n");
		System.out.println("****************************************************************");
		System.out.print("Enter the number for what you want to do:\n");
		choice = input.nextInt();
		return choice;

	}

	static private double getEventMultiplier(Scanner input) {

		double multiplier = 1.0;

		System.out.println("What is the event walking multiplier in decimal form? (i.e. .25, .5, etc.) ");
		multiplier = input.nextDouble();

		return multiplier;
	}

	private static void getEggIncubatorEventTypes(Scanner input) {
		int eggType;
		String incubatorType;
		double incubatorMultiplier = 1;
		double eventMultiplier = 1;
		String eventAnswer;
		Egg egg = null;
		Incubator incubator;

		System.out.println("What egg do you have?  10 = 10k, 7 = 7k, 5 = 5k, 2 = 2k");
		eggType = input.nextInt();
		System.out.println("What incubator do you want to use? REGULAR or SUPER? ");
		incubatorType = input.next().trim().toUpperCase();
		
		switch (eggType) {
		case 10:
			egg = new Egg10KM();
		case 7:
			egg = new Egg7KM();
		case 5:
			egg = new Egg5KM();
		case 2:
			egg = new Egg2KM();
		default:
			System.out.println("Invalid egg");
		}
		
		if (incubatorType.equals("SUPER")) {
			incubator = new IncubatorSuper();
			//incubatorMultiplier = incubator.getIncubatorMultiplier();
		} else {
			incubator = new IncubatorRegular();
		}
		
		System.out.println("Is there an event happening? Y/N");
		eventAnswer = input.next().toUpperCase().trim();

		if (eventAnswer.contentEquals("Y")) { 
			eventMultiplier = getEventMultiplier(input);
		} else if (eventAnswer.contentEquals("N")) {
			eventMultiplier = 1;
		} else { 
			eventMultiplier = 1;
		}

		System.out.print("The egg will hatch at: ");
		PrintFormatter.formatNumbers((egg.getEggWalkingDistance() * incubator.incubatorMultiplier * eventMultiplier), true);

	}

	private static Inventory getUserInventory(Scanner input, double eventMultiplier, boolean someIncubating) {

		Inventory inventory = new Inventory();  // do we need this?
		
		Egg egg = null;

		int egg10KMQty;
		int egg7KMQty;
		int egg5KMQty;
		int egg2KMQty;
		int incubatorRegularQty;
		int incubatorSuperQty;	
		
		int eggType = 0;
		double distanceWalked = 0;
		boolean isIncubating = false;
		String plannedIncubator = "regular";
		double currentEventMultiplier = 1;
		int answer = 0;
		
		
		if (someIncubating) {
			System.out.println("For each egg, please enter the following information seperated by spaces: \n"
					+ "Egg type (10, 7, 5, 2) \n"
					+ "Distance walked (if zero, enter 0) \n"
					+ "If incubating: \"true\" or \"false\" \n"
					+ "Planned incubator: \"regular\" or \"super\""
					+ "Event multiplier (if none, enter \"1\"");
			
			for (int i=0; i<9; i++) {
				System.out.print("For each egg, please enter the following information seperated by spaces:");
				//TODO: get input and build eggs
				switch (answer) {
				case 10;
				case 7;
				case 5;
				case 2;
				}
			}
			
		} else {
			System.out.println("How many 10km eggs do you have? ");
			egg10KMQty = input.nextInt();
			System.out.println("How many 7km eggs do you have? ");
			egg7KMQty = input.nextInt();
			System.out.println("How many 5km eggs do you have? ");
			egg5KMQty = input.nextInt();
			System.out.println("How many 2km eggs do you have? ");
			egg2KMQty = input.nextInt();
			System.out.println("How many regular incubators do you have? ");
			incubatorRegularQty = input.nextInt();
			System.out.println("How many super incubators do you have? ");
			incubatorSuperQty = input.nextInt();
		}	
	}

	/**
	 * TODO: complete options in ChartedPlan
	 */
	private static Inventory getPlanChoice(Scanner input) {
		
		String eventAnswer = "N";
		double eventMultiplier = 1;
		String incubatingAnswer;
		Inventory inventory;
		
		System.out.println("Is there an event happening? Y/N " );
		eventAnswer = input.next().toUpperCase().trim();
		if (eventAnswer.contentEquals("Y")) {
			eventMultiplier = getEventMultiplier(input);
		}
		System.out.println("Are any of your eggs already incubating? Y/N ");
		incubatingAnswer = input.next().toUpperCase().trim();
		
		if (incubatingAnswer.contentEquals("Y")) {
			inventory = getUserInventory(input, eventMultiplier, true);
		} else {
			inventory = getUserInventory(input, eventMultiplier, false);
		}
		
		return inventory;
		
	}
	
	/**
	 * Main Method
	 * Creates an input scanner that is passed to each method, based on the user's choices.
	 * All user input is kept in the Main class.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userSelectionMenuAnswer = 0;

		//loop through user selection menu until the user selects to quit
		while (userSelectionMenuAnswer != 9) {
			
			userSelectionMenuAnswer = printUserSelectionMenu(input);
			
			switch (userSelectionMenuAnswer) {
				case 1: // Display the Egg Hatching Reference Table
					EggHatchingTable standardTable = new EggHatchingTable();
					standardTable.printTable(1); // send no-event multiplier of "1"
					break;
				case 2: // Collect user input and show how an event affects egg hatch times in reference table
					EggHatchingTable eventTable = new EggHatchingTable();
					eventTable.printTable(getEventMultiplier(input));
					break;
				case 3: // Collect user input and display when a specified egg will hatch
					getEggIncubatorEventTypes(input);
					break;
				case 4: // Collect user input and print out a recommend incubating plan
					ChartedPlan plan = new ChartedPlan(getPlanChoice(input));
					break;
				case 9: // quit
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Input not recognized. Please try again.");
					break;
			}
		}
		input.close();
	}

}
