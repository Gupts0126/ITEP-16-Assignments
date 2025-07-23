import java.util.Scanner;

class Program011{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer value : ");
        int number = sc.nextInt();
        
          int remainder = number%2;
         
          switch (remainder) {
                case 0:
                    System.out.println("It is a even number");
                    break;
                case 1:
                    System.out.println("It is a odd number");
                    break;
                default:
                    System.out.println("Invalid number..");
                    break;
        }
    }
}