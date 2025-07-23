
import java.util.Scanner;

class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :  ");
        int length = sc.nextInt();
        System.out.println("Enter width:  ");
        int  width =  sc.nextInt();
        System.out.println("Enter rate :  ");
        int rate = sc.nextInt(); 

        int area = length * width;
        int cost = area * rate;

        System.out.println("The cost of tiling the dining room is: $" + cost);       
    }
}