package inheritence;

//import inheritence.Vehicle;   Not needed to import as they are part of the same package inheritence;
import inheritence.Truck;

public class TruckDemo {

	public static void main(String[] args) {

		Truck semi_truck1 = new Truck(4, 10, 33, 1250);
		Truck pickup_truck2 = new Truck(2, 20, 22, 650);
		Truck[] truck_array = { semi_truck1, pickup_truck2 };
		String[] truck_name = { "semi_truck1", "pickup_truck2" };

		double gallons;
		int dist = 300;
		int i = 0;

		for (Truck iterator : truck_array) {
			gallons = iterator.fuelneeded(dist);
			System.out.println(truck_name[i].toUpperCase() + " type truck can carry " + iterator.getCargo() + " pounds maximum");
			System.out.println("To go " + dist + " miles , it needs " + gallons + " gallons of fuel");
			System.out.println("\n");
			i++;
		}

	}

}
