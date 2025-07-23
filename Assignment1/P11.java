/* 11. The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m².
 Find the height and base of the triangle.*/



class Program11{
    public static void main(String args[]){
     
     float x;
     int area =320;
     // area = 1/2(base*height)
     // area = 1/2(8x*5x)
     x = (float)Math.sqrt((2*area)/40);

     float base = 8*x;
     float height = 5*x;

     System.out.println("Base is : "+base+"cm");
     System.out.println("Height is : "+height+"cm");




    }
} 