import java.util.Scanner;
class Program36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The diameter : ");
        double diameter = sc.nextDouble();
        System.out.println("Enter the Height : ");
        double  height  = sc.nextDouble();
    
        double radius = diameter/2;  

        double surface_area = 2 * Math.PI * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surface_area + " cm\u00B2");
         
    }
}