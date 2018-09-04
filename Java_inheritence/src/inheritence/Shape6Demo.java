package inheritence;

public class Shape6Demo {

	public static void main(String[] args) {
		TwoDShapeNew6[] Shapes = new TwoDShapeNew6[3]; // I can create a reference variable (or array) using super class
														// TwoDShapeNew6 but not
														// objects , see Shapes[2] comments

		Shapes[0] = new TraingleNewShape6("Outline only", 5.0);
		Shapes[1] = new TraingleNewShape6("Partial fill", 10.0, 5.0);
		Shapes[2] = new TraingleNewShape6("Generic", 20.0, 11.0);
		// Shapes[2] = new TwoDShapeNew6(20.0, 11.0); // It would fail to compile with
		// "Can not instantiate the
		// TwoDShapeNew6 as this is an abstract class"

		for (int i = 0; i < (Shapes.length);) {
			System.out.println("Object is " + Shapes[i].getName());
			System.out.print("Object dimension --> ");
			Shapes[i].showDim();
			System.out.println("Object area : " + Shapes[i].area());
			// System.out.println("Object style ");
			Shapes[i].showStyle();
			i++;
			if (i < Shapes.length) {
				System.out.println("++++++++++++++++++++++++++++Next Object++++++++++++++++++++++++++++++++++");
			}
			else {
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}

		}

	}

}
