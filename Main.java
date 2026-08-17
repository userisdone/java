import myMath.Arithmetic;
import myMath.Geometry;
public class Main {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        Geometry g = new Geometry();

        System.out.println("Add 4 & 5 " +a.add(4, 5));
        System.out.println("Subtract 10 from 12 " +a.subtract(12, 10));
        System.out.println("Divide 10 by 2 "+a.divide(10,2));
        System.out.println("Multiply 150 with 41 "+a.multiply(150,41));
        System.out.println("Area of circle with radii 4.5: "+g.circleArea(4.5));
        System.out.println("Area of rectangle l=4 b=6: "+g.rectangle(4, 6));
    }
}
