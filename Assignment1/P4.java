/*4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate 
of $6 per hundred square m. */


class Program4{
    public static void main(String args[]){

      int length_of_plot = 300;
      int breadth_of_plot = 150;
      int cost_of_tile = 6;
     
    
      int area_of_plot = length_of_plot * breadth_of_plot;
      int cost_of_totaltiles = (area_of_plot * cost_of_tile )/100;


        System.out.println("Total cost of Tiles : $"+ cost_of_totaltiles );
       



    }

}