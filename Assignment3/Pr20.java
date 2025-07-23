import java.util.Scanner;
class Program020{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
  

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("It is a alphabetical letter");
        }
         else{ 
            System.out.println("It is not a alphabetical letter");
         }
    }
}
