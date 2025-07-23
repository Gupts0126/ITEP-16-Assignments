//29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?

class Program29{
    public static void main(String args[]){

      int side_of_tile = 10;
     
       int  length_of_floor = 800;
       int  breadth_of_floor = 900;

       int area_of_tile =  side_of_tile * side_of_tile;
       int area_of_floor = length_of_floor * breadth_of_floor;
       int number_of_tile =  (area_of_floor / area_of_tile);

        System.out.println("Number of square tiles: " + number_of_tile);



    }

}