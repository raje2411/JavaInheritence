//Program to demo the usage of superclass references with subclass objects.  Read the comments in the main()

package inheritence;

class SuperClass {

	int x;

	SuperClass(int i) {
		x = i;

	}

}

class SubClass extends SuperClass {
	int y;

	SubClass(int i, int j) {
		super(i);
		y = j;
	}

}

public class SuperClassRefAndSubClassObjDemo {

	public static void main(String[] args) {

		SuperClass obj_super = new SuperClass(5);
		SuperClass obj_super_class_ref;
		SubClass obj_sub = new SubClass(15, 20);

		// Case1: This is valid as both the objects obj_super and reference obj
		// obj_super_class_ref, both are of the same type SuperClass.
		obj_super_class_ref = obj_super;
		System.out.println("obj_super_class_ref object is referring to " + obj_super_class_ref.getClass());
		System.out.println("Accessing obj_super 'x' value : " + obj_super_class_ref.x);

		System.out.println("");

		// Case2: This is also valid, as obj_super_class_ref is of type superclass which
		// is superior to subclass. but there is a catch.
		obj_super_class_ref = obj_sub;
		System.out.println("obj_super_class_ref object is NOW referring to " + obj_super_class_ref.getClass());
		System.out.println("Accessing obj_super 'x' value : " + obj_super_class_ref.x); // This is good.
		System.out.println("Accessing obj_super 'y' value : " + obj_sub.y); // only access through obj_sub
		// This won't work if we use "obj_super_class_ref.y" in the above println -
		// because obj_super_class_ref doesn't know it subclass
		// objects members.

	}

}
