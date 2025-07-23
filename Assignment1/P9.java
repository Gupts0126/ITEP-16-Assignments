// 9. Find the area of an equilateral triangle, the length of whose sides is 12 cm.

class Program9{
    public static void main(String args[]){

    double side_triangle = 12;
     // area of equilateral triangle = ((3^(1/2))/4)*side^2
    double area_traingle = (Math.sqrt(3)/4) * side_triangle * side_triangle;

    System.out.println("Area of equilateral traingle : " + area_traingle + "cm\u00B2");
  }
}