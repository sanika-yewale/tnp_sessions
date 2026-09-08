import java.util.*;
public class resturantbilling {
    public void billing(String custe,double amount,boolean weekend,String payment_mode){
        double total_price=cust(custe,amount);
        total_price=loyal_dis(total_price);
        double surcharges=0;
        if(weekend){
            surcharges=total_price*0.05;
            total_price+=surcharges;
        }
        double gst_price=0;
        gst_price=total_price*0.05;
        double final_price=0;
        final_price=total_price+gst_price;
        double final_amount=mode(payment_mode,final_price);
        System.out.println("Total Amount : "+final_amount);
    }
    public double cust(String custe,double price){
        switch(custe){
            case "regular":
                return price;
            case "member":
                price+=price*0.1;
                return price;
            case "VIP":
                price+=price*0.2;
                return price;
        }
        return price;
        // if(custe.equals("Regular")){ 
        //     discount=0;
        // }
        // else if(custe.equals("Member")){
        //     discount=price*0.1;
        // }else if(custe.equals("VIP")){
        //     discount=price*0.2;
        // }
        // return discount;
    }
    public double loyal_dis(double total_price){
        if(total_price>5000){
            total_price+=total_price*0.05;
            return total_price;
        }
        return total_price;
    } 
    public double mode(String payment_mode,double final_price){
        switch(payment_mode){
            case "UPI":
                final_price-=50;
                return final_price;
            case "cash":
                return final_price;
            case "card":
                final_price+=final_price*0.02;
                return final_price;
        }
        return final_price;
    }
    public static void main(String[]args){
        resturantbilling rest=new resturantbilling();
        Scanner sc=new Scanner(System.in);
        System.out.println("Amount : ");
        double amount=sc.nextDouble();
        sc.nextLine();
        System.out.println("customer type :");
        String cust=sc.nextLine();
        System.out.println("payment mode :");
        String payment_mode=sc.nextLine();
        System.out.println("Is weekend  true/false ? :");
        boolean weekend=sc.nextBoolean();
        rest.billing(cust, amount, weekend, payment_mode);
    }
}
