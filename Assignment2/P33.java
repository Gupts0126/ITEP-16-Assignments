import java.util.Scanner;
class Program33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int length_of_garden = sc.nextInt();

        System.out.println("Enter breadth_of_garden : ");
        int breadth_of_garden = sc.nextInt();

        System.out.println("Enter path_breadth1 : ");
        int path_breadth1 = sc.nextInt();
        
        System.out.println("Enter path_breadth2 : ");
        int path_breadth2 = sc.nextInt();

        int area_of_garden = length_of_garden * breadth_of_garden;

        int path_area1 = length_of_garden * path_breadth1;
        int path_area2 = breadth_of_garden * path_breadth2;
        int commonpath_area = path_breadth1 * path_breadth2;

        int path_area = path_area1 + path_area2 - commonpath_area;

        int usable_area = area_of_garden - path_area;

        System.out.println("Usable area of the garden: " + usable_area + " m\u00B2");
    }
}