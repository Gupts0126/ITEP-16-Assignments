import java.util.Scanner;
class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of a");
        int a = sc.nextInt();
        
        System.out.println("Enter age of b");
        int b = sc.nextInt();

        System.out.println("Enter age of c");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
         System.out.println("A is the oldest one");
        }
         else if((b>a)&&(b>c)){
          System.out.println("B is the oldest one");
        }
         else{
            System.out.println("C is the oldest one");
         } 
        

          if((a<b)&&(a<c)){
         System.out.println("A is the yongest one");
        }
         else if((b<a)&&(b<c)){
          System.out.println("B is the youngest one");
        }
         else{
            System.out.println("C is the youngest one");
         } 
        
    }
}
