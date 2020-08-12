package pokemongoeggs;

public class EggsNew {

		final private String NAME; 
		final private double EGG_WALKING_DISTANCE;
		//private boolean isIncubating = false;
		private double distanceWalked = 0.0;
		private double eventMultiplier = 1;
		private double incubatorMultiplier = 1;
		private int eggCount;
		private double distanceRemaining;

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