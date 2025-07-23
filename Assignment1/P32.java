/*32. A square garden with a side length of 150 m has a square swimming pool in the very centre 
with a side length of 25 m . Calculate the area of the garden.*/

class Program32{
    public static void main(String args[]){

      int side_of_garden = 150;
      int  side_of_pool = 25;

       int area_of_garden =  side_of_garden * side_of_garden;
       int area_of_pool = side_of_pool * side_of_pool;
       int area_of_remain =  (area_of_garden - area_of_pool); 
       
        System.out.println("Area of garden: " + area_of_garden+"m\u00B2");
        System.out.println("Area of remaining garden: " +area_of_remain+"m\u00B2");

    }

}