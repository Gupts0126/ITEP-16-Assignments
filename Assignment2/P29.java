
import java.util.Scanner;

class Program29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter floor _length :  ");
        int floor_length =  sc.nextInt();

        System.out.println("Enter floor _width :  ");
        int floor_width =  sc.nextInt();

        System.out.println("Enter tile side : ");
        int tile_side = sc.nextInt();

        int tile_area = tile_side * tile_side;

        int floor_area = floor_length * floor_width;
        int number_of_tiles = floor_area / tile_area;

        System.out.println("Number of tiles required: " + number_of_tiles);       
    }
}