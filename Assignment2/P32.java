import java.util.Scanner;

class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter garden side : ");
        int garden_side = sc.nextInt();
        System.out.println("Enter pool side : ");
        int  pool_side = sc.nextInt();

        int garden_area = garden_side * garden_side;
        int pool_area = pool_side * pool_side;

        int remaining_area = garden_area - pool_area;

        System.out.println("Area of the garden excluding the swimming pool: " + remaining_area + " m\u00B2");
          
    }
}