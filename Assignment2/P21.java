import java.util.Scanner;

class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter brick length : ");
        int brick_length = sc.nextInt();
        System.out.println("Enter brick breadth : ");
        int brick_breadth =  sc.nextInt();
        System.out.println("Enter brick height : ");
        int brick_height  = sc.nextInt();     

        System.out.println("Enter wall length : ");
        int wall_length  = sc.nextInt();   
        
        System.out.println("Enter wall breadth : ");
        int wall_breadth  = sc.nextInt();
        
        System.out.println("Enter wall height : ");
        int wall_height  = sc.nextInt();

        double brick_volume = brick_length * brick_breadth * brick_height;
        double wall_volume =  wall_length * wall_breadth * wall_height;

        double brick_volume_in_mcu = brick_volume/1000000;
       
        System.out.println("Total number of bricks needed: " + (int)(wall_volume/brick_volume_in_mcu));

        

    }

}