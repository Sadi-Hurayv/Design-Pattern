package LongParameterList.preserveWholeObject;

public class Solution {

	public Solution() {

	}

	public double calculateTotalCarCost(Journey journey, Car car) {

		double traveledDistance = calculateDistanceTravelled(journey);
		return car.costPerKM * traveledDistance;
		// return car.costPerKM * calculateDistanceTravelled(journey);
	}

	private double calculateDistanceTravelled(Journey journey) {
		// TODO Auto-generated method stub
		return journey.getTime() * journey.getAverageSpeed();
	}

}
