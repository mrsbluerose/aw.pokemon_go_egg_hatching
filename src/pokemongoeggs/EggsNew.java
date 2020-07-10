package pokemongoeggs;

public class EggsNew {

		private String name; 
		private int eggWalkingDistance;
		private boolean isIncubating = false;
		private double distanceWalked = 0.0;
		private double eventMultiplier = 1;
		private double incubatorMultiplier = 1;

		public EggsNew() {
			
		}
		public EggsNew(String name, int eggWalkingDistance) {
			this.name = name;
			this.eggWalkingDistance = eggWalkingDistance;
		}
		
		public double getEggWalkingDistance() {
			return eggWalkingDistance;
		}

		public boolean isIncubating() {
			return isIncubating;
		}

		public void setIncubating(boolean isIncubating) {
			this.isIncubating = isIncubating;
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
	    @Override
	    public String toString() {
	        return name;
	    }

	}