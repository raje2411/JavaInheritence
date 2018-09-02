package inheritence;

public class TwoDShapeNew5 {

	private double width; // Now these are private and subclasses can access these only through methods
	// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
	// getHeight() & setHeight()
	private String style, name; // Newly added this for area() method

	TwoDShapeNew5() {
		width = height = 0;
		style = "No Style";
		name = "Generic";
	}

	TwoDShapeNew5(String n, double w, double h) { // Now created this super class constructor on this
															// TwoDShapeNew2
		// class
		width = w;
		height = h;
		name = n;

	}

	TwoDShapeNew5(String n, double x) {
		width = height = x;
		name = n;
	}

	TwoDShapeNew5(TwoDShapeNew5 obj) {
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

	double area() {

		System.out.println(
				"This is placeholder for each sub-class to implement it's own area() method using method override");
		return 0.0;
	}

	void showStyle() {
		System.out.println("This is a generice superclass it has no styles " + style);
	}
}