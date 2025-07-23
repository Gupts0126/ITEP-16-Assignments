import java.util.Scanner;

class Program13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the area : ");
        int area = sc.nextInt();

        System.out.println("Enter the one leg : ");
        int oneleg = sc.nextInt();

       
        
        // area of right angle triangle = 1/2(base*height) 
        int other_leg=(area*2)/oneleg;

        System.out.println("Other Leg of Triangle : " +other_leg + "cm");

    } 
}