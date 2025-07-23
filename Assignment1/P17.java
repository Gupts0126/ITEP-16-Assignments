/* 17. Luci is making a display board for the school exhibition. The display board is 
 a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board.
 What is the length of ribbon that he needs?*/

class Program17{
    public static void main(String args[]){

      int length_of_board = 3;
      int breadth_of_board = 2;

      int perimeter = 2*(length_of_board + breadth_of_board);

        System.out.println("The length of ribbon needed : " +perimeter+"m");
       
    }

}