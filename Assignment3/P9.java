import java.util.Scanner;
class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character (a to z OR A to Z): ");
        char a = sc.next().charAt(0);

        if(a>='a' && a<='z'){
            System.out.println("Lowercase is entered");
        }
        else if(a>='A' && a<='Z'){
            System.out.println("Uppercase is entered");
        }
        else{
            System.out.println("invalid character");
        }
    }
}
