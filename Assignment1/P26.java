/*26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth
  if a brick is 24 cm long and 15 cm wide?*/

  class Program26{
    public static void main(String args[]){

      int length_of_path = 120;
      double breadth_of_path = 2.4;
      

      int length_of_brick = 24;
      int breadth_of_brick = 15;
      

      double area_of_path = length_of_path * breadth_of_path ; 
      double area_of_brick = length_of_brick * breadth_of_brick; 

      double areaofbrick_in_msq = area_of_brick/10000;

      System.out.println("Number of bricks used are : "+(int)(area_of_path/areaofbrick_in_msq));
    }
}