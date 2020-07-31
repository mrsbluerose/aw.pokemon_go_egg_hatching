package pokemongoeggs;

public class EggsNew {

		final private String NAME; 
		final private double EGG_WALKING_DISTANCE;
		//private boolean isIncubating = false;
		private double distanceWalked = 0.0;
		private double eventMultiplier = 1;
		private double incubatorMultiplier = 1;

		public EggsNew(String name, double eggWalkingDistance) {
			this.NAME = name;
			this.EGG_WALKING_DISTANCE = eggWalkingDistance;
		}
		
		public String getName() {
			return NAME;
		}
		
		public double getEggWalkingDistance() {
			return EGG_WALKING_DISTANCE;
		}

//		public boolean isIncubating() {
//			return isIncubating;
//		}

//		public void setIncubating(boolean isIncubating) {
//			this.isIncubating = isIncubating;
//		}

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
	        return NAME;
	    }

	}