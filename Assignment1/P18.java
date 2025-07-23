/* 18. Ron jogs around a rectangular park of length 50 m and breadth 30 m.
If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?*/

class Program18{
    public static void main(String args[]){

      int length_of_park = 50;
      int breadth_of_park = 30;

      float perimeter_in_m = 2*(length_of_park + breadth_of_park);
      float perimeter_in_km = (perimeter_in_m/1000);

        System.out.println("The total distance cover in a day  : " +(perimeter_in_km*10)+"km");
       
    }

}