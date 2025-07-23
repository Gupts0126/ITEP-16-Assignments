import java.util.Scanner;
class Program025{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price");
        int cost_price = sc.nextInt();
        
        System.out.println("Enter the selling price");
        int selling_price = sc.nextInt();
      
        if(cost_price > selling_price){
            int loss = cost_price - selling_price;
            float loss_percentage = (loss*100)/cost_price;

            System.out.println("Loss : "+loss_percentage);
        } 
        else if (cost_price < selling_price){
            int profit = selling_price - cost_price;
            float profit_percentage = (profit*100)/cost_price;

            System.out.println("Profit :"+profit_percentage);
        }
        else {
            System.out.println("No loss and no profit");
        }
    }
}
 