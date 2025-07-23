import java.util.Scanner;
class Program11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        System.out.println("Enter your sex (M/F or m/f): ");
        int sex = sc.next().charAt(0);

        System.out.println("Enter marital status (Y/N or y/n): ");
        int marital_status = sc.next().charAt(0);

        if(sex =='F' || sex == 'f'){
            System.out.println("You will work only in urban area");
        }
        else if((sex == 'M' || sex == 'm') && (age>=20 && 40>=age)){
            System.out.println("You may work anywhere");
        }
        else if((sex == 'M' || sex == 'm') && (age>=40 && 60>=age)){
            System.out.println("You will work in urban areas only ");
        } 
        else{
            System.out.println("ERROR");
    }
    }
}
