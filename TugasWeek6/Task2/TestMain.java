package TugasWeek6.Task2;

public class TestMain {

	public static void main(String[] args) {
		/** Test For Circle Class */
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		
		Circle c2 = new Circle(2.0);
		System.out.println(c2.toString());
		
		Circle c3 = new Circle(3.0,"black",false);
		System.out.println(c3.toString());
		
		
		/** Test For Rectangle Class */
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle(2.0,2.0);
		System.out.println(r2.toString());
		
		Rectangle r3 = new Rectangle(3.0,3.0,"black",false);
		System.out.println(r3.toString());
		
		
		/** Test For Square Class */
		Square s1 = new Square();
		System.out.println(s1.toString());
		
		Square s2 = new Square(2.0);
		System.out.println(s2.toString());
		
		Square s3 = new Square(3.0,"black",false);
		System.out.println(s3.toString());
	}

}
