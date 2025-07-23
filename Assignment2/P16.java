import java.util.Scanner;

class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of length : ");
        int length_of_room = sc.nextInt();
        System.out.println("Enter value of width : ");
        int breadth_of_room = sc.nextInt();

        int area_of_room = length_of_room * breadth_of_room;
         

        System.out.println("The size of carpet " + area_of_room + " m\u00B2 of carpet");
        
               
    }
}