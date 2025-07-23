import java.util.Scanner;

class Program026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Physics:");
        int physics = sc.nextInt();

         System.out.println("Enter the marks of Chemistry :");
        int chemistry = sc.nextInt();

         System.out.println("Enter the marks of Biology :");
        int biology = sc.nextInt();

         System.out.println("Enter the marks of Mathematics :");
        int maths = sc.nextInt();

         System.out.println("Enter the marks of Computer :");
        int computer = sc.nextInt();

        int total_marks = physics + chemistry + biology + maths + computer;
        float percentage = (total_marks*100)/500.0f ; 
         System.out.println("Percentage : "+percentage);
     
         if(percentage >= 90){
         System.out.println("Grade A");
         }
         else if(percentage >= 80){
          System.out.println("Grade B");
        }
         else if(percentage >= 70){
          System.out.println("Grade C");
         }  
         else if(percentage >= 60){ 
          System.out.println("Grade D");
        }
         else if(percentage >=40){ 
          System.out.println("Grade E");
         }  
         else if(percentage < 40){ 
          System.out.println("Grade F");
         }  
         else {
          System.out.println("Invalid value");
       }
}

}