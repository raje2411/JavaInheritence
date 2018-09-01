package inheritence;

class Truck extends Vehicle {
	private int cargocap;

	Truck(int p, int f, int m, int ccap) {
		super(p, f, m);
		cargocap = ccap;
	}

	int getCargo() {
		return cargocap;
	}

	void setCargo(int input_ccap) {
		cargocap = input_ccap;
	}

}
