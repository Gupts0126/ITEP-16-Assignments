import java.util.Scanner;

class Program029{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
         
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Enter a choice(+,>,==) : ");
        char choice = sc.next().charAt(0);
           
            switch (choice) {
                case '+':
                    System.out.println("Addition : "+(a+b));
                    break;
                case '>':
                    System.out.println("Greater than : "+(a>b));
                    break;
                case '=':
                    System.out.println("Equal or not : "+(a==b));
                    break;
                default:
                    System.out.println("Invalid choice..");
                    break;
            }
        }
    }
