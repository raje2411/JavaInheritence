package inheritence;

class TwoDShapeNew { // Superclass

	private double width; // Now these are private and subclasses can access these only through methods
							// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
							// getHeight() & setHeight()

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double input_width) {
		width = input_width;
	}

	void setHeight(double input_height) {
		height = input_height;
	}

	void showDim() {
		System.out.println("Width is : " + width + " and height is : " + height);
	}
}

class TriangleNew extends TwoDShapeNew { // Sub-class which is an extension of TwoDShape super class

	String style;

	double area() {
		return (getWidth() * getHeight() * 1 / 2); // Now it can't access the super classes member directly.so using
													// getWidth() method
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}

}

public class SuperClassPrivateMembersAccesDemo {

	public static void main(String[] args) {

		TriangleNew t1 = new TriangleNew();
		TriangleNew t2 = new TriangleNew();

		t1.setWidth(10); // Now using setWidth and setHeight method to update the width and height
							// members of super class
		t1.setHeight(20);
		t1.style = "Filled";

		t2.setWidth(15);
		t2.setHeight(2);
		t2.style = "outlined";

		System.out.println("Objects dimension");
		System.out.println("");
		t1.showDim();
		t2.showDim();
		System.out.println("");

		System.out.println("Objects area");
		System.out.println("");
		System.out.println(t1.area());
		System.out.println(t2.area());
		System.out.println("");

		System.out.println("Objects Style");
		System.out.println("");
		t1.showStyle();
		t2.showStyle();
		System.out.println("");

	}

}
