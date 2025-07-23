 import java.util.Scanner;
class Program15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of bike");
        int cost = sc.nextInt();
        
        if(cost>100000){
            System.out.println("Road tax to be paid : 15%");
            System.out.println("The amount of tax to be paid : "+(cost*15)/100 );
        }
        else if(cost>50000 && cost<=100000){
            System.out.println("Road tax to be paid : 10%");
            System.out.println("The amount of tax to be paid : "+(cost*10)/100 );
        }
        else if(cost<=50000){
            System.out.println("Road tax to be paid : 5%");
            System.out.println("The amount of tax to be paid : "+(cost*5)/100 );
        }
         else{ 
            System.out.println("Invalid cost..");
         }
    }
}
