import java.util.Scanner;

class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder : ");
        int radius = sc.nextInt();

        System.out.print("Enter height of the cylinder : ");
        int height = sc.nextInt();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of the cylinder: " + volume + " cm\u00B3");

    }
}
