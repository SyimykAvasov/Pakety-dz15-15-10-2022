public class Circle {
     private static final double PI=3.14;
     static void area(){
         int radius1 = 5;
         int radius2 = 6;
         double v = PI * (radius1*radius2);
         System.out.println("Area (область): "+v);
     }
    static void circumference(){
         int a = 2;
         int radius = 6;
         double v = PI * 2 * radius;
        System.out.println("Circumference (Длина окружности): "+v);
    }

    public double getPI() {
        return PI;
    }
}
