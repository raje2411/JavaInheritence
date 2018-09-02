package inheritence;

public abstract class TwoDShapeNew6 { // It is an abstract class now, so you can't use this class for any new objects,
										// only it can be extended with another sub-classes

	private double width; // Now these are private and subclasses can access these only through methods
	// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
	// getHeight() & setHeight()
	private String style, name; // Newly added this for area() method

	TwoDShapeNew6() {
		width = height = 0;
		style = "No Style";
		name = "Generic";
	}

	TwoDShapeNew6(String n, double w, double h) { // Now created this super class constructor on this
													// TwoDShapeNew2
		// class
		width = w;
		height = h;
		name = n;

	}

	TwoDShapeNew6(String n, double x) {
		width = height = x;
		name = n;
	}

	TwoDShapeNew6(TwoDShapeNew6 obj) {
		height = obj.height;
		width = obj.width;
		name = obj.name;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double input_width) {
		width = input_width;
	}

	double getHeight() {
		return height;
	}

	String getName() {
		return name;
	}

	void setHeight(double input_height) {
		height = input_height;
	}

	void showDim() {
		System.out.println("Width is : " + width + " and height is : " + height);
	}

	abstract double area(); // Abstract method which forces it's sub-class to implement their own area()
							// method with return type of double.

	void showStyle() {
		System.out.println("This is a generice superclass it has no styles " + style);
	}
}