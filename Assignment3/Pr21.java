import java.util.Scanner;
class Program021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st angle : ");
        float a = sc.nextFloat();
        
        System.out.println("Enter the 2nd angle : ");
        float b = sc.nextFloat();

        System.out.println("Enter the 3rd angle : ");
        float c = sc.nextFloat();

        float sum = a+b+c ;

        if(sum == 180){
            System.out.println("It is a triangle");
        }
        else {
            System.out.println("It is not a triangle");
        }
    }

}
