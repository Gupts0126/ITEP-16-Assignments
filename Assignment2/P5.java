import java.util.Scanner;
 
class Program5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total cost : ");
        int cost = sc.nextInt();

        System.out.println("Enter the length :");
        int length = sc.nextInt();

        System.out.println("Enter the rate per msq : ");
        int rate_per_msq = sc.nextInt();

        int perimeter = (cost/rate_per_msq);
        int breadth = (perimeter/2)-length;
        int area = length*breadth;

        System.out.println("Breadth of park : "+breadth+"m");
        System.out.println("Perimeter of park : "+perimeter+"m");
        System.out.println("Area of park : "+area+"m\u00B2");

    }
    
}
