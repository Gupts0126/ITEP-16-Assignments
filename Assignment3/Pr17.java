import java.util.Scanner;

class Program017{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Number is negative(-)");
        } else if (a > 0) {
            System.out.println("Number is positive(+)");
        } else {
            System.out.println("Number is neutral");
        }

    }
}
