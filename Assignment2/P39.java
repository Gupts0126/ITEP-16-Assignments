import java.util.Scanner;

class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder: ");
        int diameter = sc.nextInt();

        System.out.print("Enter height of the cylinder: ");
        int height = sc.nextInt();

        double radius = diameter / 2;

        double surface_area = 2 * Math.PI * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surface_area + " cm\u00B2");

    }
}
