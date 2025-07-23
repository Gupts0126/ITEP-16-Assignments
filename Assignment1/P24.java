/*24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required fora wall 20 m long, 
 2 m high and 0.75 m thick?If bricks sell at $900 per thousand what will it cost to build the wall?*/

 class Program24{
    public static void main(String args[]){

      int length_of_brick = 25;
      int breadth_of_brick = 10;
      double height_of_brick = 7.5;

      int length_of_wall = 20;
      double breadth_of_wall = 0.75;
      int height_of_wall = 2;

      double volume_of_brick = length_of_brick * breadth_of_brick * height_of_brick; 
      double volume_of_wall = length_of_wall * breadth_of_wall * height_of_wall; 

      double volumeofbrick_in_mcu = volume_of_brick/1000000;
      int number_of_bricks = (int)(volume_of_wall/volumeofbrick_in_mcu);

      System.out.println("Number of bricks used are : "+number_of_bricks);
      System.out.println("Cost of building the wall is : $"+(number_of_bricks*900)/1000);
    }
}