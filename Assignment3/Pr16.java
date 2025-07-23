import java.util.Scanner;
class Program016{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter celsius/fahrenheit('c' or 'C'/ 'f' or 'F') : ");
         char type = sc.next().charAt(0);
        
        System.out.println("Enter temperature : ");
        float temperature = sc.nextFloat();

       if(type == 'c' || type == 'C'){

         float fahrenheit = temperature;
         float celsius = (fahrenheit- 32)*5/9.0f ;

          System.out.println("Temperature in celsius : "+celsius);
       }
       else if(type == 'f' || type == 'F'){
         float celsius = temperature;
         float fahrenheit = (celsius*9/5.0f) + 32 ;

          System.out.println("Temperature in fahrenheit : "+fahrenheit);
       }
       else{
         System.out.println("Wrong type..");
       }
    }
}
