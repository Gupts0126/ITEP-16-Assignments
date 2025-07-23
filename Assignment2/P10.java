import java.util.Scanner;

class Program10{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

       System.out.println("Enter the base : ");
       int base = sc.nextInt();

       System.out.println("Enter the height : ");
       int height = sc.nextInt();


        double area_isosceles_traingle = (1/2.0) * base * height;

        System.out.println("Area of Isosceles Traingle : " + area_isosceles_traingle + "cm\u00B2");
    }
}