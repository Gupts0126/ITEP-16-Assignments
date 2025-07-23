import java.util.Scanner;

class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of the cone : ");
        int height = sc.nextInt();

        System.out.print("Enter slant height of the cone : ");
        int slant_height = sc.nextInt();

        System.out.print("Enter rate of polishing per cm² (₹): ");
        int rate = sc.nextInt();

        double base_radius = Math.sqrt(slant_height * slant_height - height * height);
        double base_area = Math.PI * base_radius * base_radius;
        double cost = base_area * rate;

        System.out.println("Cost of polishing the base: ₹" + cost);

        
    }
}

