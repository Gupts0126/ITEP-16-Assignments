import java.util.Scanner;
class Program014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value : ");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer value : ");
        int b = sc.nextInt();

        System.out.println("Enter third integer value : ");
        int c = sc.nextInt();

        System.out.println("Enter fourth integer value : ");
        int d = sc.nextInt();

        int lowest = (a < b && a < c && a < d) ? a : ((b < c && b < d && b < a) ? b : ((c < d && c < b && c < a) ? c : d));
        System.out.print("The lowest value : "+lowest);
    }
}
