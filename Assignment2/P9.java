import java.util.Scanner;

class Program9{
    public static void main(String args[]){

     Scanner sc = new Scanner(System.in);

       System.out.println("Enter the side : ");
       int side = sc.nextInt();
     // area of equilateral triangle = ((3^(1/2))/4)*side^2
    double area_traingle = (Math.sqrt(3)/4) * side * side;

    System.out.println("Area of equilateral traingle : " + area_traingle + "cm");
  }
}