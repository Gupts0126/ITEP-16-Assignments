import java.util.Scanner;

class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side cube : ");
        int side_of_cube = sc.nextInt();

        System.out.println("Enter carton length : ");
        int carton_length = sc.nextInt();
        System.out.println("Enter carton breadth :  ");
        int  carton_breadth =  sc.nextInt(); 
        System.out.println("Enter carton height : ");
        int carton_height = sc.nextInt();
        

        int volume_of_cube = side_of_cube * side_of_cube *side_of_cube;

       int volume_of_carton = carton_breadth * carton_height * carton_length;

       System.out.println("Number of cubical boxes fit in the carton:" + (volume_of_carton/volume_of_cube));
            
    }

}