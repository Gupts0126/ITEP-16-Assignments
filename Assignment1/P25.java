/*25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden.
 What is the area of the path?*/

 class Program25{
    public static void main(String args[]){

      int number_of_brick = 100;
      int length_of_brick = 24;
      int breadth_of_brick = 15;

      float area_of_brick = length_of_brick * breadth_of_brick ; 

      System.out.println("Area of the path is : "+(area_of_brick*number_of_brick)+"cm\u00B2");
    }
}