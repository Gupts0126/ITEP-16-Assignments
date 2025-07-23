import java.util.Scanner;
class Program019{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of 1st triangle");
        int a  = sc.nextInt();

        System.out.println("Enter side of 2nd triangle");
        int b = sc.nextInt();

        System.out.println("Enter side of 3rd triangle");
        int c = sc.nextInt();
        
        if((a == b && a == c) || ( b == c && b == a)){
            System.out.println("It is a equilateral triangle");
        }
        else if((a == b && a != c) || (b == c && b != a)){
            System.out.println("It is a isosceles triangle");
        }
         else{ 
            System.out.println("It is a scalene triangle");
         }
    }
}
