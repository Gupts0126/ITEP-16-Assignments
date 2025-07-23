import java.util.Scanner;

class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder : ");
        int diameter = sc.nextInt();

        System.out.print("Enter height of the cylinder : ");
        int height = sc.nextInt();

        int radius = diameter / 2;

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of the cylinder: " + volume + " cm\u00B3");

    }
}
