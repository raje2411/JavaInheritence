package inheritence;

class A1 {
	 A1() {
		System.out.println("Constructing A1 ");
	}
	{													//This is a default constructor  that is executed first before calling A1() constructor 
		System.out.println("Constructing A1..... ");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("Constructing B1 ");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("Constructing C1");
	}
}

public class Constructor_execution_order_demo {

	public static void main(String[] args) {
		
		C1 obj_c =new C1();
		
		System.out.println(obj_c.getClass());
	}

}
