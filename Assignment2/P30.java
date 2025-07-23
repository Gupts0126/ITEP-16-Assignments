import java.util.Scanner;

class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter floor length :  ");
        int floor_length = sc.nextInt();
        System.out.println(" Enter Floor width :  ");
        int floor_width =  sc.nextInt();

        System.out.println("Enter tile length :  ");
        int tile_length = sc.nextInt();  

        System.out.println("Enterc tile breadth : ");
        int tile_breadth = sc.nextInt();   

        int floor_area = floor_length * floor_width;
        int tile_area = tile_length * tile_breadth;

        int number_of_tiles = floor_area / tile_area;

        System.out.println("Number of tiles required: " + number_of_tiles);   
    }
}