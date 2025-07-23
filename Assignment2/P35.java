import java.util.Scanner;

class Program35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height  = sc.nextDouble();

        double surface_area = 2 *Math.PI* radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surface_area + " cm\u00B2");
         
    }
}