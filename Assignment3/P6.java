import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if (a < 0) {
            int absolute_value = Math.abs(a);
            System.out.println("Absolute value of a : " + absolute_value);
        } else if (a > 0) {
            System.out.println("Absolute value of a : " + a);
        } else {
            System.out.println("a is zero");
        }

    }
}
