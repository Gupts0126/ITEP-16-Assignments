import java.util.Scanner;

class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of brick : ");
        int brick_length =   sc.nextInt();
        System.out.println("Enter breadth of brick : ");
        int  brick_breadth = sc.nextInt();
        System.out.println("Enter number of brick : ");
        int  number_Of_bricks =  sc.nextInt();    

        int area_of_brick = brick_length *brick_breadth;
        int area_of_path = area_of_brick * number_Of_bricks;

        System.out.println("Area of the path is: " +area_of_path+ " cm\u00B2");
          
    }
}
