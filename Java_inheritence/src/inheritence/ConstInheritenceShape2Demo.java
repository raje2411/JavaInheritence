/* This program is to give demo on Constructors & inheritence.
 * We are going to copy the code from "SuperClassPrivateMembersAccesDemo.Java".   
 * TwoDShapeNew(super - adding its own constructor)-->TwoDShapeNew2  & TriangleNew(sub copied to TriangleNewShape1)-->Triangle Classes created in "SuperClassPrivateMembersAccesDemo.Java"
 * In this demo we will have constructor only on the sub-class(TriangleNew) and use super() to construct the super class members
*/

package inheritence;

class TwoDShapeNew2 { // Superclass

	private double width; // Now these are private and subclasses can access these only through methods
							// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
							// getHeight() & setHeight()

	TwoDShapeNew2(double w, double h) { // Now created this super class constructor on this TwoDShapeNew2 class
		width = w;
		height = h;
	}

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

class TriangleNewShape2 extends TwoDShapeNew2 { // Sub-class which is an extension of TwoDShapeNew2 super class

	String style;

	TriangleNewShape2(String s, double w, double h) { // Defined constructor for sub-class only

		super(w, h); // using super() keywords to invoke the super-class i.e TwoDShapeNew2
						// constructor
						// and this should be called first before constructing TriangleNewShape2
						// members(ex. style);
		style = s;
	}

	double area() {
		return (getWidth() * getHeight() * 1 / 2); // Now it can't access the super classes member directly.so using
													// getWidth() method
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}

}

public class ConstInheritenceShape2Demo {
	public static void main(String[] args) {

		TriangleNewShape2 obj_tglnewshp_1 = new TriangleNewShape2("Semi-filled", 5, 6);
		TriangleNewShape2 obj_tglnewshp_2 = new TriangleNewShape2("outlined", 10, 20);
		TriangleNewShape2[] arry = { obj_tglnewshp_1, obj_tglnewshp_2 };

		for (TriangleNewShape2 i : arry) {
			System.out.println("+++++++++++");
			System.out.println("Objects dimension");
			System.out.println("");
			i.showDim();
			System.out.println("");
			System.out.println("Objects Style");
			System.out.println("");
			i.showStyle();
			System.out.println("");
			System.out.println("Objects area");
			System.out.println("");
			System.out.println(i.area());
			System.out.println("+++++++++++");
		}

	}

}
