  import java.util.Scanner;
   class Program018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer value");
        int value = sc.nextInt();
        
        if ((value & 1) == 0) {
            System.out.println( "It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }
    }
}