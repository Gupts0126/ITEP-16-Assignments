import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int length = sc.nextInt();


        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();

        if(length==breadth)
         System.out.println("It is a square");
         else
         System.out.println("It is a rectangle");

    }
}