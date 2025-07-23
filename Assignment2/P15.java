import java.util.Scanner;

class Program15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of garden : ");
        int length_of_garden = sc.nextInt();

        System.out.println("Enter the breadth of garden : ");
        int breadth_of_garden = sc.nextInt();

        System.out.println("Enter the side of square : ");
        int side_of_square = sc.nextInt();

        int area_of_garden = length_of_garden * breadth_of_garden;
        int area_of_square = side_of_square * side_of_square;

        if (area_of_garden > area_of_square) {
            System.out.println("Shelly's garden is bigger");
            System.out.println("By " + (area_of_garden - area_of_square) + "m\u00B2");
        } else {
            System.out.println("Rachel's garden is bigger");
            System.out.println("By " + (area_of_square - area_of_garden) + "m\u00B2");
        }
    }

}
