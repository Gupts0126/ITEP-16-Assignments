import java.util.Scanner;

class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder : ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height of the cylinder : ");
        double height = sc.nextDouble();

        double radius = diameter / 2;
        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of the cylinder: " + volume + " cm\u00B3");

        
    }
}
