import java.util.Scanner;

class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume of the cylinder : ");
        double volume = sc.nextDouble();

        System.out.print("Enter radius of the cylinder : ");
        double radius = sc.nextDouble();

        double height = volume / (Math.PI * radius * radius);
        double surface_area = 2 * Math.PI * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surface_area + " cm\u00B2");

        
    }
}

