
import java.util.Scanner;

class Program14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diagonal : ");
        int diagonal = sc.nextInt();

        System.out.println("Enter the vertix1 : ");
        int vertix1 = sc.nextInt();
        
        System.out.println("Enter the vertix2 : ");
        int vertix2 = sc.nextInt();

        float area = (1/2.0f) * (vertix1 + vertix2) * diagonal;

        System.out.println("Area of Quadrilateral : " + area + "m\u00B2");

    }

}
