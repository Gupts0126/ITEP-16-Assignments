import java.util.Scanner;
class Program015{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0)||(year%400 == 0)){
            System.out.println("It is a leap year..");
        }
        else{
            System.out.println("It is not a leap year..");
        }
      
    }
}