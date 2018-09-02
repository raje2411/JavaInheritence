package inheritence;

public class RectangleShape5 extends TwoDShapeNew5 {
	
	private String style;

	RectangleShape5() {
		super();
		style = "no style defined";
	}

	RectangleShape5(String s, double w, double h) { // Defined constructor for sub-class only

		super("Rectangle",w, h); // using super() keywords to invoke the super-class i.e TwoDShapeNew2
		// constructor
		// and this should be called first before constructing TriangleNewShape2
		// members(ex. style);
		style = s;

	}

	RectangleShape5(String s, double x) {
		super("Rectangle",x);
		style = s;
	}

	RectangleShape5(RectangleShape5 obj) { //This constructor is created to create a copy of a given object
		super(obj);
		style = obj.style;
	}

	double area() {
		return (getWidth() * getHeight()); // Now it can't access the super classes member directly.so using
		// getWidth() method
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}
	

}
