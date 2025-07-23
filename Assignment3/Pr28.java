import java.util.Scanner;

class Program028{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the unit chargees :");
        float units = sc.nextFloat();

        double  charge_per_unit,total_bill; 

         if(units <= 50){
             charge_per_unit = 0.50;
             total_bill = charge_per_unit*units;

             System.out.println("Total electric bill : "+total_bill);
         }
         else if(units <= 100){ 
            charge_per_unit = 0.75;
             total_bill = charge_per_unit*units;

          System.out.println("Total electric bill : "+total_bill);
        }
         else if(units <= 200){
            charge_per_unit = 1.20;
             total_bill = charge_per_unit*units;

          System.out.println("Total electric bill : "+total_bill);
         }  
         else if(units > 250){ 
             charge_per_unit = 1.50;
             total_bill = charge_per_unit*units;

          System.out.println("Total electric bill : "+total_bill);
        }
         else {
          System.out.println("Invalid unit value");
       }
}

}