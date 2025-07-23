/* 3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed
 to cover a rectangular region whose length and breadth are 520 cm and 140 cm? */

class Program3{
    public static void main(String args[]){

      int length_of_tile = 13;
      int breadth_of_tile = 7;
     
       int  length_of_region = 520;
       int  breadth_of_region = 140;

       int area_of_tile = length_of_tile * breadth_of_tile;
       int area_of_region = length_of_region * breadth_of_region;
       int number_of_tile =  (area_of_region / area_of_tile);

        System.out.println("Area of region: " + area_of_region + "cm\u00B2");
        System.out.println("Area of tile: " + area_of_tile + "cm\u00B2");
        System.out.println("Number of tile: " + number_of_tile);



    }

}