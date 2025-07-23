
import java.util.Scanner;

class Program11 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base_ratio : ");
        int base_ratio = sc.nextInt();

        System.out.println("Enter the height_ratio : ");
        int height_ratio = sc.nextInt();

        System.out.println("Enter the area : ");
        int area = sc.nextInt();

        float x;

        // area = 1/2(base*height)
        // assume base = base_ratio*x and height = height_ratio*x
        // area = 1/2(base_ratio*x*height_ratio*x)
        x = (float) Math.sqrt((2 * area) / 40);

        float base =  base_ratio*x;
        float height = height_ratio*x;

        System.out.println("Base is : " + base + "cm");
        System.out.println("Height is : " + height + "cm");

    }
}
