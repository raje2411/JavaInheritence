package inheritence;

//Program to demo the Super class and sub class usage in Java inheritence
class TwoDShape { // Superclass

	double width;
	double height;

	void showDim() {
		System.out.println("Width is : " + width + " and height is : " + height);
	}
}

class Triangle extends TwoDShape { // Sub-class which is an extension of TwoDShape super class

	String style;

	double area() {
		return (width * height * 1 / 2); // it access the super classes member directly.
	}

	void showStyle() {
		System.out.println("Triangle style is " + style);
	}

}

class SuperandSubClassDemo {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.width = 10;
		t1.height = 20;
		t1.style = "Filled";

		t2.width = 15;
		t2.height = 2;
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
