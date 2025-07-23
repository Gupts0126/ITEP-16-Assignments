import java.util.Scanner;

class Program013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
         
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Enter a arithmetic operator(+.-.*,/,%) : ");
        char operator= sc.next().charAt(0);
           
            switch (operator) {
                case '+':
                    System.out.println("Addition : "+(a+b));
                    break;
                case '-':
                    System.out.println("Subtraction : "+(a-b));
                    break;
                case '*':
                    System.out.println("Multiplication : "+(a*b));
                    break;
                case '/':
                    System.out.println("Division : "+(a/b));
                    break;
                case '%':
                    System.out.println("Module : "+(a%b));
                    break;
                default:
                    System.out.println("Invalid operator..");
                    break;
            }
        }
    }
