/* Improvement of ConstInheritenceShape2Demo,  here we have added many different constructors for both super class and sub-class
 * This program is to give demo on Constructors & inheritence.
 * We are going to copy the code from "SuperCl	assPrivateMembersAccesDemo.Java".
 * TwoDShapeNew(super - adding its own constructor)-->TwoDShapeNew2  & TriangleNew(sub copied to TriangleNewShape1)-->Triangle Classes created in "SuperClassPrivateMembersAccesDemo.Java"
 * In this demo we will have constructor only on the sub-class(TriangleNew) and use super() to construct the super class members
 */

package inheritence;

class TraingleNewShape6 extends TwoDShapeNew6 { // Sub-class which is an extension of TwoDShapeNew2 super class

	private String style;

	TraingleNewShape6() {
		super();
		style = "no style defined";
	}

	TraingleNewShape6(String s, double w, double h) { // Defined constructor for sub-class only

		super("Triangle", w, h); // using super() keywords to invoke the super-class i.e TwoDShapeNew2
		// constructor
		// and this should be called first before constructing TriangleNewShape2
		// members(ex. style);
		style = s;

	}

	TraingleNewShape6(String s, double x) {
		super("Triangle", x);
		style = s;
	}

	TraingleNewShape6(TraingleNewShape6 obj) { // This constructor is created to create a copy of a given object
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