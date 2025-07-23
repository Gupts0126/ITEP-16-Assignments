/*30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the
 floor of a bed room 200 cm long and 400 cm wide?*/

 class Program30{
    public static void main(String args[]){

      int length_of_tile = 5;
      int breadth_of_tile = 8;
     
       int  length_of_bedroom = 200;
       int  breadth_of_bedroom = 400;

       int area_of_tile = length_of_tile * breadth_of_tile;
       int area_of_bedroom = length_of_bedroom * breadth_of_bedroom;
       int number_of_tile =  (area_of_bedroom / area_of_tile);

        System.out.println("Number of tiles: "+ number_of_tile);



    }

}