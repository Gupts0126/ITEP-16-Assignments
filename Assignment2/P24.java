
import java.util.Scanner;

class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter wall length : ");
        int wall_length = sc.nextInt();
        System.out.println(" Enter wall height : ");
        int wall_height = sc.nextInt();
        System.out.println(" Enter wall thickness : ");
        double wall_thickness  = sc.nextDouble();       

        System.out.println(" Enter brick length : ");
        int brick_length  = sc.nextInt(); 

        System.out.println(" Enter brick width : ");
        int brick_width  = sc.nextInt(); 
         
        System.out.println(" Enter brick thickness : ");
        double brick_thickness  = sc.nextDouble(); 

        double wall_volume = wall_length * wall_height * wall_thickness;
        double brick_volume = brick_length * brick_width * brick_thickness;
       
        double brick_volume_in_mcu =  brick_volume/1000000.0;

        int brick_number = (int)(wall_volume/brick_volume_in_mcu);

        double costPerThousand = 900;

    
        System.out.println("Number of bricks required: " + brick_number);
        System.out.println("Total cost to build the wall: $" + (brick_number*costPerThousand)/1000.0f);
    }

}