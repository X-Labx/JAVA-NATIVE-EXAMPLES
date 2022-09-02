import java.util.*;

public class SimulatedAnnealing {
	private static double temperature = 1000;
	private static double coolingFactor = 0.995;

	public static void main(String[] args) {
		List<City> cities = new ArrayList<>();

		City city1 = new City(100, 100);
		cities.add(city1);

		City city2 = new City(200, 200);
		cities.add(city2);

		City city3 = new City(100, 200);
		cities.add(city3);

		City city4 = new City(200, 100);
		cities.add(city4);

		City city5 = new City(200, 150);
		cities.add(city5);

		City city6 = new City(123, 124);
		cities.add(city6);

		City city7 = new City(105, 300);
		cities.add(city7);

		City city8 = new City(200, 500);
		cities.add(city8);









		Tour current = new Tour(cities);
		Tour best = current.duplicate();

		for (double t = temperature; t > 1; t *= coolingFactor) {
			Tour neighbor = current.duplicate();

			int index1 = (int) (neighbor.noCities() * Math.random());
			int index2 = (int) (neighbor.noCities() * Math.random());

			Collections.swap(neighbor.getCities(), index1, index2);

			int currentLength = current.getTourLength();
			int neighborLength = neighbor.getTourLength();

			if (Math.random() < Util.probability(currentLength, neighborLength, t)) {
				current = neighbor.duplicate();
			}

			if (current.getTourLength() < best.getTourLength()) {
				best = current.duplicate();
			}
		}

		System.out.println("Final tour length: " + best.getTourLength());
		System.out.println("Tour: " + best);
	}
}

