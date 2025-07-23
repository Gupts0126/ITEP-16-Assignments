/*15. Shelly has a rectangular garden of length 22 m and breath 15 m. 
Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?*/

class Program15{
    public static void main(String args[]){

     int length_of_garden = 22;
     int breadth_of_garden = 15;
     int  side_of_square = 21;

     int area_of_garden = length_of_garden * breadth_of_garden;
     int area_of_square = side_of_square * side_of_square;
         
       if(area_of_garden > area_of_square){
        System.out.println("Shelly's garden is bigger");
        System.out.println("By "+(area_of_garden-area_of_square)+"m\u00B2");
       }
       else{
        System.out.println("Rachel's garden is bigger");
        System.out.println("By "+(area_of_square-area_of_garden)+"m\u00B2");
       }
    }

}