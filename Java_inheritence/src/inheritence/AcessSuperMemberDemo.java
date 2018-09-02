/* Program to Demo how to use super.<members> in sub-classes
 *
 */
package inheritence;

class A {
    int i;

    int get_var() {
        return i;
    }

    void set_var(int x) {
        i = x;
    }
}

class B extends A {
    int i;

    B(int x, int y) {
        set_var(y);
        i = x;
    }

    B(int x) {
        set_var(x);
        i = x;
    }

    B() {
        set_var(0);
        i = 0;
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
