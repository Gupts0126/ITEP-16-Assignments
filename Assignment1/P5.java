/* 5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per
 m²,find the breadth of the park and its perimeter. Also, find the area of the field.*/


class Program5{
    public static void main(String args[]){

       int total_cost = 1600;
       int cost_per_meter = 25;
       int length = 20;

       int perimeter = (total_cost / cost_per_meter);
       // perimeter = 2*(length+breadth)
       int breadth  = (perimeter/2)-length;
       int area = length * breadth;

       System.out.println("Perimeter is : " + perimeter  + "m");
       System.out.println("Breadth is : " + breadth  + "m");
       System.out.println("Area is : " + area + "m\u00B2" );


    }
}