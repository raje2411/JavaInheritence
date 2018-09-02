package inheritence;

public class Shape6Demo {

	public static void main(String[] args) {
		TwoDShapeNew6[] Shapes = new TwoDShapeNew6[3];

		Shapes[0] = new TraingleNewShape6("Outline only", 5.0);
		Shapes[1] = new TraingleNewShape6("Partial fill", 10.0, 5.0);
		Shapes[2] = new TraingleNewShape6("Generic", 20.0, 11.0);

		for (int i = 0; i < (Shapes.length); i++) {
			System.out.println("Object is " + Shapes[i].getName());
			System.out.println("Object dimension ");
			Shapes[i].showDim();
			System.out.println("Object area ");
			System.out.println("Object area " + Shapes[i].area());
			System.out.println("Object style ");
			Shapes[i].showStyle();
		}

	}

}
