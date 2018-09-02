package inheritence;

public class Shape4Demo {

	public static void main(String[] args) {
		TriangleNewShape4 t1= new TriangleNewShape4("outlined", 8.0, 12.0);
        TriangleNewShape4 t2= new TriangleNewShape4(t1);

        t2.setHeight(10);  //t2 was created with copied  t1 values initially  and then updated here.
        t2.setWidth(10);    //t2 was created with copied  t1 values and then changed here.

        System.out.println("Info for t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());

	}

}
