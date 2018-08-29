package inheritence;

class rectangle extends TwoDShape { // TwoDshape class is part of inheritence package, so directly extending without
									// import
	String style;

	double area() {
		return (width * height);
	}

	void showStyle() {
		System.out.println("Rectangle Style is : " + style);
	}
}

class RectangleSubClassExtendsTwoDShape { // Demo class to use rectangle sub-class and print both super-class and
											// rectange class members
	public static void main(String args[]) {

		rectangle obj_rect1 = new rectangle();
		rectangle obj_rect2 = new rectangle();

		obj_rect1.width = 10;
		obj_rect1.height = 20;
		obj_rect1.style = "Half-Filled";

		obj_rect2.width = 15;
		obj_rect2.height = 2;
		obj_rect2.style = "Semi-Filled";

		System.out.println("Objects dimension");
		System.out.println("");
		obj_rect1.showDim();
		obj_rect2.showDim();
		System.out.println("");

		System.out.println("Objects area");
		System.out.println("");
		System.out.println(obj_rect1.area());
		System.out.println(obj_rect2.area());
		System.out.println("");

		System.out.println("Objects Style");
		System.out.println("");
		obj_rect1.showStyle();
		obj_rect2.showStyle();
		System.out.println("");

	}

}