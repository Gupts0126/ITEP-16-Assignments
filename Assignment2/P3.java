import java.util.Scanner;

class  Program3 {
    public static void main(String args[]){
     
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the length of tile ");
       int length_tile = sc.nextInt();

        System.out.println("Enter the breadth of tile ");
        int breadth_tile = sc.nextInt();

         System.out.println("Enter the length of region ");
         int length_region = sc.nextInt();

        System.out.println("Enter the breadth of region");
        int breadth_region = sc.nextInt();

        int area_tile = length_tile*breadth_tile;
        int area_region = length_region*breadth_region;
        int number_tiles = area_region/area_tile;

        System.out.println("Number of tiles :"+number_tiles);




    }
    
}
