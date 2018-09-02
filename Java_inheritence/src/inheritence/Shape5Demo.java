package inheritence;

public class Shape5Demo {

	public static void main(String[] args) {

		TwoDShapeNew5[] Shapes = new TwoDShapeNew5[5];

		Shapes[0] = new TraingleNewShape5("Outline only", 5.0);
		Shapes[1] = new TraingleNewShape5("Partial fill", 10.0, 5.0);
		// Shapes[2] = new TraingleNewShape5( Shapes[1]); Not able to send this as
		// Shapes[1] object is subclass type.
		Shapes[2] = new RectangleShape5("2 dimension ", 6, 12);
		Shapes[3] = new RectangleShape5("Partial fill", 8.0);
		Shapes[4] = new TwoDShapeNew5("Generic", 20.0, 11.0);

	
	for (int i=0;i<(Shapes.length);i++)
	{
		System.out.println("Object is "+ Shapes[i].getName());
		System.out.println("Object dimension ");
		Shapes[i].showDim();
		System.out.println("Object area "+Shapes[i].area());
		
	}
		
	}
	
}
