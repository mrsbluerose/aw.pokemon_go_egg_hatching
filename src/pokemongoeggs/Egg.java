/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

package pokemongoeggs;

public class Egg {

		final private String NAME; 
		final private double EGG_WALKING_DISTANCE;
		private double distanceWalked = 0.0;
		private double eventMultiplier = 1;
		private double incubatorMultiplier = 1;
		private int eggCount;
		private double distanceRemaining;

		public Egg(String name, double eggWalkingDistance, double distanceRemaining) {
			this.NAME = name;
			this.EGG_WALKING_DISTANCE = eggWalkingDistance;
			this.distanceRemaining = distanceRemaining;
		}
		
		public String getName() {
			return NAME;
		}
		
		public double getEggWalkingDistance() {
			return EGG_WALKING_DISTANCE;
		}

		public double getDistanceWalked() {
			return distanceWalked;
		}

		public void setDistanceWalked(double distanceWalked) {
			this.distanceWalked = distanceWalked;
		}

		public double getEventMultiplier() {
			return eventMultiplier;
		}

		public void setEventMultiplier(double eventMultiplier) {
			this.eventMultiplier = eventMultiplier;
		}

		public double getIncubatorMultiplier() {
			return incubatorMultiplier;
		}

		public void setIncubatorMultiplier(double incubatorMultiplier) {
			this.incubatorMultiplier = incubatorMultiplier;
		}
	    public int getEggCount() {
			return eggCount;
		}

		public void setEggCount(int eggCount) {
			this.eggCount = eggCount;
		}

		public double getDistanceRemaining() {
			return distanceRemaining;
		}

		public void setDistanceRemaining(double distanceRemaining) {
			this.distanceRemaining = distanceRemaining;
		}

		@Override
	    public String toString() {
	        return NAME;
	    }

	}