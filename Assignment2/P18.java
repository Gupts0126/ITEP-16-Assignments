
import java.util.Scanner;

class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter length of Park :  ");
        int length_of_park = sc.nextInt();

        System.out.println("Enter breadth of Park : ");
        int breadth_of_park = sc.nextInt();

        float perimeter_in_m = 2 * ( length_of_park + breadth_of_park);
         
        float perimeter_in_km = (perimeter_in_m/1000.0f);
        

       System.out.println("The total distance cover in a day  : " +(perimeter_in_km*10)+"km");
       
    }
}