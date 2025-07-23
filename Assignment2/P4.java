import java.util.Scanner;

class Program4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();

        System.out.println("Enter the rate per 100msq : ");
        int rate_per_100msq = sc.nextInt();

        int area = length*breadth;
        int cost_tiling = (area*rate_per_100msq)/100;

        System.out.println("Cost of tiling : $"+cost_tiling );

    }
    
}
