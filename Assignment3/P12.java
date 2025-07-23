import java.util.Scanner;
class Program12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4-digit number : ");
        int number = sc.nextInt();
            
        int reverse = 0;
        int remainder ;
         if(number<1000 || number>9999){
            System.out.println("Invalid input");
        }
        else{
        while(number != 0){
            
            remainder = number%10;
            reverse = (reverse*10)+remainder;
            number = number/10;

        }
        System.out.println("Reverse value is : "+reverse);
    }   
    
    }
}
