import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side a : ");
        float a = sc.nextFloat();

        System.out.println("Enter side b : ");
        float b = sc.nextFloat();

        System.out.println("Enter the perimeter : ");
        float perimeter = sc.nextFloat();

        float c = perimeter-(a+b);
        float s = (perimeter/2);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the triangle : "+area+"cm\u00B2");

    }
    
}
