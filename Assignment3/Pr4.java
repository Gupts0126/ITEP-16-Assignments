import java.util.Scanner;
class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer value :");
        int a = sc.nextInt();
        
        System.out.println("Enter second integer value : ");
        int b = sc.nextInt();
        
        System.out.println("Values before swap--");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
       
        // with third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value after swap using third variable--");
        System.out.println("Value of a : "+a);    
        System.out.println("Value of b : "+b);
       
        // without third variable
        a = a-b;
        b = a+b;
        a = b-a;

        System.out.println("Value after swap by not using third variable--");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        
    }
}