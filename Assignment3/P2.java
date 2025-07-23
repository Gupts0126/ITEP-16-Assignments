import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchased quantity : ");
        int quantity = sc.nextInt();

        int cost = quantity*100;

        if(cost>1000){
            float discout = cost*(10/100.0f);
          
         System.out.println("After discount total cost : "+(cost-discout));
    }
    else{
        System.out.println("Total cost :"+cost);
    }
   
}

}
