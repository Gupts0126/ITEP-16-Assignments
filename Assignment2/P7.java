import java.util.Scanner;

class Program7{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the base : ");
       int base = sc.nextInt();

       System.out.println("Enter the area : ");
       int area = sc.nextInt();


        // Area of traingle = 1/2 * base * height
        int height = ( area / base ) * 2 ;

        System.out.println("Height of Triangle : " + height + "cm");
    }
}