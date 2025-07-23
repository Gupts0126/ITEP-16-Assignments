import java.util.Scanner;

class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base1 : ");
        int base1 = sc.nextInt();
        System.out.println("Enter base2 : ");
        int base2 =  sc.nextInt();
        System.out.println("Enter height :   ");
        int height = sc.nextInt();

        System.out.println("Enter walkway width : ");
        int walkway_width = sc.nextInt();  

        int area = (base1 + base2) * height / 2;
        int walkway_area = walkway_width * height;

        int total_area = area + walkway_area;

        System.out.println("Total area after adding the walkway: " + total_area + " m\u00B2");      
    }
}