package LongMetod.preserveWholeObject;

public class Problem {
	
	public Problem() {
		
	}
	
	public double calculateTotalCarCost(Journey journey, Car car) {
		
		int travelTime = journey.getTime();
		double averageSpeed = journey.getAverageSpeed();
		
		double traveledDistance  = calculateDistanceTravelled(travelTime, averageSpeed);
		
		return car.costPerKM * traveledDistance;	
	}

	private double calculateDistanceTravelled(int travelTime, double averageSpeed) {
		// TODO Auto-generated method stub
		return travelTime * averageSpeed;
	}

}
