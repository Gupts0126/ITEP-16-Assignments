import java.util.Scanner;
class Program06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value : ");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer value : ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.print("The greatest value : "+max);
    }
}
