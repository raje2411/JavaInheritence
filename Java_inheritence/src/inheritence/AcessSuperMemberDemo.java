/* Program to Demo how to use super.<members> in sub-classes
 *
 */
package inheritence;

class A {
	int i;
}

class B extends A {
	int i;

	B(int x, int y) {
		super.i = y;
		i = x;
	}

	B(int x) {
		super.i = x;
		i = x;
	}

	B() {
		i = super.i = 0;
	}

	void show_var() {
		System.out.println("Class A's i value is : " + super.i);
		System.out.println("Class B's i value is : " + i);
	}
}

public class AcessSuperMemberDemo {

	public static void main(String[] args) {

		B obj_B = new B(5, 10); // here 10 is for class A's i and 5 is for class B
		B obj_B1 = new B(33); // here 33 is for class A's i and 33 is for class B
		B obj_B2 = new B(); // here 33 is for class A's i and 33 is for class B

		obj_B.show_var();
		System.out.println("++++++++++++++++++++++++++");
		obj_B1.show_var();
		System.out.println("++++++++++++++++++++++++++");
		obj_B2.show_var();
	}

}
