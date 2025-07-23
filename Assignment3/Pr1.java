import java.util.Scanner;
class Program01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius : " );
        int radius = sc.nextInt();
        
         double area = Math.PI*radius*radius;

         System.out.println("Area of the circle : "+area);
    }
}
