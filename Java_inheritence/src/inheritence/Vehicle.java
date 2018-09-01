/* This is a Vehicle - Super class
 * 
 */
package inheritence;

class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;

	Vehicle(int p, int f, int m) { // Super-class constructor
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	int range() { // calculate range
		return (mpg * fuelcap);
	}

	double fuelneeded(int miles_to_drive) {
		return (double) (miles_to_drive / mpg);
	}

	int getPassengers() { // methods to access private members of Vehicle class
		return passengers;
	}

	void setPassengers(int p) { // methods to access private members of Vehicle class
		passengers = p;
	}

	int getFuelcap() { // methods to access private members of Vehicle class
		return fuelcap;
	}

	void setFuelcap(int f) { // methods to access private members of Vehicle class
		fuelcap = f;
	}

	int getMpg() { // methods to access private members of Vehicle class
		return mpg;
	}

	void setMpg(int m) { // methods to access private members of Vehicle class
		mpg = m;
	}

}
