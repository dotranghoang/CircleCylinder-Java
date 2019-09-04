package circlepackage;

public class Maintest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0 , "Red");
        System.out.println(circle+"\n");
//
        Cylinder cylinder1 = new Cylinder();
//        System.out.println(cylinder1);
//        cylinder = new Cylinder(2.0);
//        System.out.println(cylinder1);
//        cylinder = new Cylinder(5.0 , 7.5);
//        System.out.println(cylinder1);
//        cylinder = new Cylinder(3.0, 9.0 , "Orange");
//        System.out.println(cylinder1);

        cylinder1 = new Cylinder(4.0 , 5.0, "Pink");
        System.out.println(cylinder1);
        System.out.println("Volume of cylinder1 is: "+cylinder1.getVolume());

    }
}
