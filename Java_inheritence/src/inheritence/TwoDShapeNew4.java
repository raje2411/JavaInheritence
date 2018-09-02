package inheritence;

public class TwoDShapeNew4 {

	private double width; // Now these are private and subclasses can access these only through methods
	// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
	// getHeight() & setHeight()

	TwoDShapeNew4() {
		width = height = 0;
	}

	TwoDShapeNew4(double w, double h) { // Now created this super class constructor on this TwoDShapeNew2 class
		width = w;
		height = h;
	}

	TwoDShapeNew4(double x) {
		width = height = x;
	}

	TwoDShapeNew4(TwoDShapeNew4 obj) {
		height = obj.height;
		width = obj.width;
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

	void setHeight(double input_height) {
		height = input_height;
	}

	void showDim() {
		System.out.println("Width is : " + width + " and height is : " + height);
	}
}
