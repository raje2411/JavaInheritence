/* This program is to give demo on Constructors & inheritence.
 * We are going to copy the code from "SuperClassPrivateMembersAccesDemo.Java".   
 * TwoDShapeNew(super - adding its own constructor)-->TwoDShapeNew2  & TriangleNew(sub copied to TriangleNewShape1)-->Triangle Classes created in "SuperClassPrivateMembersAccesDemo.Java"
 * In this demo we will have constructor only on the sub-class(TriangleNew) and use super() to construct the super class members
 * 
 * Improvement of ConstInheritenceShape2Demo,  here we have added many different constructors for both super class and sub-class
 *
 */

package inheritence;

class TwoDShapeNew3 { // Superclass

	private double width; // Now these are private and subclasses can access these only through methods
							// getWidth() & setWidth()
	private double height; // Now these are private and subclasses can access these only through methods
							// getHeight() & setHeight()
	
	TwoDShapeNew3(){
		width=height=0;
	}
	
	TwoDShapeNew3(double w, double h) { // Now created this super class constructor on this TwoDShapeNew2 class
		width = w;
		height = h;
	}
	
	TwoDShapeNew3(double x){
		width=height=x;
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

class TriangleNewShape3 extends TwoDShapeNew3 { // Sub-class which is an extension of TwoDShapeNew2 super class

	String style;
	
	TriangleNewShape3(){
		super();
		style = "no style defined";
	}
	
	TriangleNewShape3(String s, double w, double h) { // Defined constructor for sub-class only

		super(w, h); // using super() keywords to invoke the super-class i.e TwoDShapeNew2
						// constructor
						// and this should be called first before constructing TriangleNewShape2
						// members(ex. style);
		style = s;

	}
	
	TriangleNewShape3(String s, double x)
	{
		super(x);
		style =s;
	}
	
	


	double area() {
		return (getWidth() * getHeight() * 1 / 2); // Now it can't access the super classes member directly.so using
													// getWidth() method
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}

}

public class ConstInheritenceShape3Demo {
	public static void main(String[] args) {

		TriangleNewShape3 obj_tglnewshp_1 = new TriangleNewShape3();
		TriangleNewShape3 obj_tglnewshp_2 = new TriangleNewShape3("outlined", 250, 30);
		TriangleNewShape3 obj_tglnewshp_3 = new TriangleNewShape3("semifilled", 30);
		TriangleNewShape3[] arry = { obj_tglnewshp_1, obj_tglnewshp_2,obj_tglnewshp_3 };
		
		for ( TriangleNewShape3 i : arry) {
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
