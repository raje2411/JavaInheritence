/* This program is to give demo on Constructors & inheritence.
 * We are going to copy the code from "SuperClassPrivateMembersAccesDemo.Java".   
 * TwoDShapeNew(super - No change, so importing it) & TriangleNew(sub copied to TriangleNewShape1)-->Triangle Classes created in "SuperClassPrivateMembersAccesDemo.Java"
 * In this demo we will have constructor only on the sub-class(TriangleNew) 
*/

package inheritence;

import inheritence.TwoDShapeNew; //Not needed as this class is also in the package inheritence, but added here for future clarity

class TriangleNewShape1 extends TwoDShapeNew { // Sub-class which is an extension of TwoDShape super class

	String style;

	TriangleNewShape1(String s, double w, double h) { // Defined constructor for sub-class only
		setWidth(w);  // Constructing the super class objects using super class methods.
		setHeight(h); // Constructing the super class objects using super class methods.
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

public class ConstInheritenceShape1Demo {
	public static void main(String[] args) {

		TriangleNewShape1 obj_tglnewshp_1 = new TriangleNewShape1("Outlined", 2.5, 5.2);
		TriangleNewShape1 obj_tglnewshp_2 = new TriangleNewShape1("Filled", 35, 64);
		TriangleNewShape1[] arry = { obj_tglnewshp_1, obj_tglnewshp_2 };

		for (TriangleNewShape1 i : arry) {
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
