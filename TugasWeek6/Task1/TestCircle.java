package TugasWeek6.Task1;

/**
 *  A Test Driver for the Circle class
 */
public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

      Circle c2 = new Circle(2.0);
      System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " and color " + c2.getColor());
      
      Circle c3 = new Circle(3.0,"blue");
      System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color " + c3.getColor());
   }
}