/*21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. 
How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?*/

class Program21{
    public static void main(String args[]){

      int length_of_brick = 15;
      int breadth_of_brick = 8;
      int height_of_brick = 5;

      int length_of_wall = 15;
      int breadth_of_wall = 10;
      int height_of_wall = 8;

      double volume_of_brick = length_of_brick * breadth_of_brick * height_of_brick; 
      double volume_of_wall = length_of_wall * breadth_of_wall * height_of_wall; 

      double volumeofbrick_in_mcu = volume_of_brick/1000000;

      System.out.println("Number of bricks used are : "+(int)(volume_of_wall/volumeofbrick_in_mcu));
    }
}