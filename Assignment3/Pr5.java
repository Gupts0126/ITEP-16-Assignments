import java.util.Scanner;
class Program05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value :");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer value : ");
        int b = sc.nextInt();
        
        System.out.println("Values before swap--");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
         a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value after swap without using third variable and arithmetic operator--");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        
    }
}