import java.util.Scanner;
class Program08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value : ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.print("The value is  : "+result);
    }
}
