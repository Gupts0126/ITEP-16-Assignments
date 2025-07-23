import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();

        System.out.println("Enter your year of service : ");
        int year_service = sc.nextInt();

        if(year_service>5){
          float bonus = salary*(5/100.0f);
        
          System.out.println(" Net bonus : "+bonus); 
          System.out.println("Salary after bonus : "+(salary+bonus));
        }
        else{
            System.out.println("You are not eligible");
        }
          

        
    }
    
}
