import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter customer id  :");
            String custid=sc.next();
            if(custid.equalsIgnoreCase("DONE")){
                break;
            }
            String name="";
            int quantity=0;
            int price =0;
            System.out.println("enter number of items :");
            int items=sc.nextInt();
            int totalprice=0;
            double customersubtotal=0;
            for(int i=0;i<items;i++){
                System.out.println("Name :");
                sc.nextLine();
                 name=sc.nextLine();
                System.out.println("Quantity : ");
                 quantity=sc.nextInt();
                System.out.println("enter unit price :");
                 price = sc.nextInt();
                if(quantity<=0 || price <=0){
                continue;
            }
            double itemprice=quantity*price;
            customersubtotal+=itemprice;
            }
            int subtotal = (int) customersubtotal;
double discount = 0;

if (subtotal >= 1000) {
    discount = subtotal * 0.10;
}

double finalPrice = subtotal - discount + 50;
            System.out.println("subtotal price :"+subtotal);
            System.out.println("discount : "+discount);
            System.out.println("delivery charges :"+50);
            System.out.println("total price : "+finalPrice);
        }
    }
}
