import java.util.Scanner;
class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of classes held : ");
        int classes_held = sc.nextInt();
        
        System.out.println("Enter number of classes attended : ");
        int classes_attended = sc.nextInt();

        float percentage = (classes_attended*100.0f)/classes_held;

        if(75<=percentage){
            System.out.println("You are allowed to sit in exam");
        }
        else{

             System.out.println("Do you have medical cause('Y' or 'N')");
              char medical = sc.next().charAt(0);
             
              if(medical== 'Y'){
                System.out.println("Allowed due to medical cause");
              } 
              else {
                System.out.println("You are not allowed to sit in exam ");
              }
             

            
          }

          }  
        }
    


