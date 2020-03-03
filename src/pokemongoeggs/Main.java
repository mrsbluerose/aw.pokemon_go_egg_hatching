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
		double egg;
		String incubator;
		double incubatorMultiplier = 1;
		double eventMultiplier = 1;
		String eventAnswer;

		System.out.println("What egg do you have? (enter distance) ");
		egg = input.nextDouble();
		System.out.println("What incubator do you want to use? REGULAR or SUPER? ");
		incubator = input.next().trim().toUpperCase();
		
		if (incubator.equals("SUPER")) {
			incubatorMultiplier = 0.666667;
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
		PrintFormatter.formatNumbers((egg * incubatorMultiplier * eventMultiplier), true);
		//System.out.print(" km");
	}

	private static Inventory getUserInventory(Scanner input, double eventMultiplier, boolean someIncubating) {

		Inventory inventory = new Inventory();  // do we need this?
		
		Egg egg1;
		Egg egg2;
		Egg egg3;
		Egg egg4;
		Egg egg5;
		Egg egg6;
		Egg egg7;
		Egg egg8;	
		Egg egg9;

		int egg10KMQty;
		int egg7KMQty;
		int egg5KMQty;
		int egg2KMQty;
		int incubatorRegularQty;
		int incubatorSuperQty;	
		
		
		if (someIncubating) {
			// set each egg
			// assign incubators
			
		} else {
			System.out.println("How many 10km eggs do you have? ");
			inventory.setEgg10KMQty(input.nextInt());
			System.out.println("How many 7km eggs do you have? ");
			inventory.setEgg7KMQty(input.nextInt());
			System.out.println("How many 5km eggs do you have? ");
			inventory.setEgg5KMQty(input.nextInt());
			System.out.println("How many 2km eggs do you have? ");
			inventory.setEgg2KMQty(input.nextInt());
			// assign incubators
		}
			
//		System.out.println("How many 10km eggs do you have? ");
//		inventory.setEgg10KMQty(input.nextInt());
//		System.out.println("How many 7km eggs do you have? ");
//		inventory.setEgg7KMQty(input.nextInt());
//		System.out.println("How many 5km eggs do you have? ");
//		inventory.setEgg5KMQty(input.nextInt());
//		System.out.println("How many 2km eggs do you have? ");
//		inventory.setEgg2KMQty(input.nextInt());
//
//		
//		if (hasIncubators && !someIncubating) {
//			System.out.println("How many regular incubators do you have? ");
//			inventory.setIncubatorRegularQty(input.nextInt());
//			System.out.println("How many super incubators do you have? ");
//			inventory.setIncubatorSuperQty(input.nextInt());
//
//		} else if (hasIncubators && someIncubating) {
//			/** TODO: code getting too verbose with scanner input. Need to incorporate user
//			 *  interface to calculate custom distances.
//			 */ 
//
//		} else {
//			inventory.setIncubatorRegularQty(0);
//			inventory.setIncubatorSuperQty(0);
//		}
//
//		return inventory;
	}

	/**
	 * TODO: complete options in ChartedPlan
	 */
	private static void getPlanChoice(Scanner input) {

//		int choice;
//		boolean hasIncubators;
//		boolean someIncubating;
//
//		System.out.println("\n");
//		System.out.println("****************************************************************");
//		System.out.println("\t\t\tChoose what best describes your inventory:\n");
//		System.out.println("\t1 - Eggs: non-incubating. Incubators: have enough for current eggs.\n");
//		System.out.println("\t2 - Eggs: non-incubating. Incubators: plan to purchase what is needed.\n");
//		System.out.println("\t3 - Eggs: some already incubating. Incubators: have enough for current eggs.\n");
//		System.out.println("\t4 - Eggs: already incubating. Incubators: plan to purchase what is needed.\n");
//		System.out.println("****************************************************************");
//		System.out.print("Enter the number for your inventory:\n");
//		choice = input.nextInt();
//
//		switch (choice) {
//			case 1:
//				hasIncubators = true;
//				someIncubating = false;
//				ChartedPlan plan1 = new ChartedPlan(getUserInventory(input, hasIncubators, someIncubating));
//				plan1.printPlan();
//				break;
//
//			case 2:
//				hasIncubators = false;
//				someIncubating = false;
//				ChartedPlan plan2 = new ChartedPlan(getUserInventory(input, hasIncubators, someIncubating));
//				plan2.printPlan();
//				break;
//
//			case 3:
//				System.out.println("Feature coming soon"); // GUI
//				break;
//
//			case 4:
//				System.out.println("Feature coming soon"); // GUI
//				break;
//		}
		
		String eventAnswer = "N";
		double eventMultiplier = 1;
		String incubatingAnswer;
		
		System.out.println("Is there an event happening? Y/N " );
		eventAnswer = input.next().toUpperCase().trim();
		if (eventAnswer.contentEquals("Y")) {
			eventMultiplier = getEventMultiplier(input);
		}
		System.out.println("Are any of your eggs already incubating? Y/N ");
		incubatingAnswer = input.next().toUpperCase().trim();
		
		if (incubatingAnswer.contentEquals("Y")) {
			getUserInventory(input, eventMultiplier, true);
		} else {
			getUserInventory(input, eventMultiplier, false);
		}
		
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
					getPlanChoice(input);
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
