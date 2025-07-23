/*23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton 
of dimensions 15 cm × 9 cm × 12 cm.*/
class Program23{
    public static void main(String args[]){
      
      int side_of_cube = 3;
      int length_of_carton = 15;
      int breadth_of_carton = 9;
      int height_of_carton = 12;

      float volume_of_cube = side_of_cube * side_of_cube * side_of_cube; 
      float volume_of_carton = length_of_carton * breadth_of_carton * height_of_carton; 

      System.out.println("The number of cubical boxes fit in carton : "+(volume_of_carton/volume_of_cube));
    }
}