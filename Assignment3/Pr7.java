import java.util.Scanner;
class Program07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value : ");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer value : ");
        int b = sc.nextInt();

        System.out.println("Enter third integer value : ");
        int c = sc.nextInt();

        int max = (a > b && a > c) ? a : ((b > c && b > a) ? b : c);
        System.out.print("The greatest value : "+max);
    }
}
