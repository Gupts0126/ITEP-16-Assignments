import java.util.Scanner;

class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length_of_brick :  ");
        int  length_of_brick = sc.nextInt();
        System.out.println("Enter breadth_of_brick : ");
        int breadth_of_brick = sc.nextInt();
        System.out.println("Enter height_of_brick : ");
        int height_of_brick = sc.nextInt();    

        int volume_of_brick = length_of_brick * breadth_of_brick * height_of_brick;

        System.out.println("Volume of brick of Ice-cream is : " + volume_of_brick + "cm\u00B3");
        
    }
}