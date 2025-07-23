
import java.util.Scanner;

class Program12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hypotenuse : ");
        int hypotenuse = sc.nextInt();

        System.out.println("Enter the oneside : ");
        int oneside = sc.nextInt();

        double otherside = Math.sqrt(hypotenuse * hypotenuse - oneside * oneside);
        double area_triangle = (1/2.0) * (oneside * otherside);

        System.out.println("Otherside of Triangle : " + otherside + "cm");
        System.out.println("Area of Triangle : " + area_triangle + "cm\u00B2");
    }

}
