//27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.

class Program27{
    public static void main(String args[]){

      int length_of_room = 20;
      int breadth_of_room = 15;

      int area_of_room = length_of_room * breadth_of_room;

        System.out.println("The cost of tiling a dining room : $"+(area_of_room*5));
       
    }

}