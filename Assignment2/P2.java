import java.util.Scanner;

class Program2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the area : ");
        int area = sc.nextInt();

        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();

        int length = (area/breadth);
        int perimeter = 2*(length+breadth);
        
        System.out.println("Length of rectangle : "+length+"cm");
        System.out.println("Perimeter of rectangle : "+perimeter+"cm");

    } 


    }