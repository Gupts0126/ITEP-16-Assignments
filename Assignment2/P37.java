import java.util.Scanner;

class Program37{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the surface area : ");
         int surface_area = sc.nextInt();
      
       System.out.println("Enter the height : ");
          int height = sc.nextInt();
      
        double radius,diameter;
        //area = 2*pi*r*(r+h)
       // r = 2*pi*r*r + 2*pi*h*r - area = 0
       int a = 2;
       int b = 2*height;
       double c = -surface_area/Math.PI;
       
        radius = (Math.sqrt(b*b-4*a*c)/4)-(3);
        diameter = radius*2;

         System.out.println("Diameter of cylinder : " +diameter); 
    }
}
