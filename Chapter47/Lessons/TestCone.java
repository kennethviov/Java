//import java.util.*;

public class TestCone {
    public static void main (String[] args) {
        /*
        Scanner scan = new Scanner (System.in);

        double radius, height;

        System.out.print("Enter radius: ");
        radius = scan.nextDouble();

        System.out.print("Enter height: ");
        height = scan.nextDouble();

        Cone cone = new Cone (radius, height);

        System.out.println("Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());
        */

        /*
        Cone cone1 = new Cone (2.1,5.8);
        System.out.println( "cone1 area: " + cone1.area() + " volume: " + cone1.volume() );

        Cone cone2 = new Cone (1.2,3.4);
        System.out.println( "cone2 area: " + cone2.area() + " volume: " + cone2.volume() );
        */

        Cone cone = new Cone (0,0);

        cone.setHeight(1.2);
        cone.setRadius(3.4);

        System.out.println(cone.getHeight());
        System.out.println(cone.getRadius());
    }
}