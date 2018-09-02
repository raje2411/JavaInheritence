/* Improvement of ConstInheritenceShape2Demo,  here we have added many different constructors for both super class and sub-class
 * This program is to give demo on Constructors & inheritence.
 * We are going to copy the code from "SuperClassPrivateMembersAccesDemo.Java".
 * TwoDShapeNew(super - adding its own constructor)-->TwoDShapeNew2  & TriangleNew(sub copied to TriangleNewShape1)-->Triangle Classes created in "SuperClassPrivateMembersAccesDemo.Java"
 * In this demo we will have constructor only on the sub-class(TriangleNew) and use super() to construct the super class members
 */

package inheritence;

class TriangleNewShape4 extends TwoDShapeNew4 { // Sub-class which is an extension of TwoDShapeNew2 super class

	String style;

	TriangleNewShape4() {
		super();
		style = "no style defined";
	}

	TriangleNewShape4(String s, double w, double h) { // Defined constructor for sub-class only

		super(w, h); // using super() keywords to invoke the super-class i.e TwoDShapeNew2
		// constructor
		// and this should be called first before constructing TriangleNewShape2
		// members(ex. style);
		style = s;

	}

	TriangleNewShape4(String s, double x) {
		super(x);
		style = s;
	}

	TriangleNewShape4(TriangleNewShape4 obj) { //This constructor is created to create a copy of a given object
		super(obj);
		style = obj.style;
	}

	double area() {
		return (getWidth() * getHeight() * 1 / 2); // Now it can't access the super classes member directly.so using
		// getWidth() method
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}

}
