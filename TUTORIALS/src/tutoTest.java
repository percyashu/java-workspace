import java.util.Scanner;

public class tutoTest {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);

        String color;
        double radius;
        System.out.println("Enter  radius, color");

        radius=scan.nextDouble();
        color=scan.next();
        Circle circle = new Circle(radius,color);
        circle.setRadius(radius);
        circle.setColor(color);
        double area = circle.Area();
        System.out.println(" area of circle is ="+area);



    }
}
