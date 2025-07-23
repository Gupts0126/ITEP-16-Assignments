import java.util.Scanner;

class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length: ");
        double path_length = sc.nextDouble();

        System.out.print("Enter path breadth: ");
        double path_breadth = sc.nextDouble();

        System.out.print("Enter brick length: ");
        int brick_length = sc.nextInt();

        System.out.print("Enter brick breadth: ");
        int brick_breadth = sc.nextInt();
      
        double path_area = path_length * path_breadth;
        int brick_area = brick_length * brick_breadth;

        double brick_area_in_m2 = brick_area/10000.0;

        System.out.println("Number of bricks required: " +(int)(path_area/brick_area_in_m2));

        
    }
}