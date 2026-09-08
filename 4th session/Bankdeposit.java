import java.util.Scanner;

public class Bankdeposit{
    public void Amount(double principal,double rate,int years){
        double interest =0;
        double balance= principal;
        double totalinterest=0;
        System.out.print("Opening balance  : "+principal);
        for(int i=0;i<years ;i++){
            interest=balance*(rate/100);
            double closing=balance+interest;
            totalinterest +=interest;
            System.out.print("year "+i);
            System.out.print(" | Closing balance : "+closing);
            System.out.print(" | with rate :"+rate);
            System.out.print(" | Total interest : "+totalinterest);
            System.out.println();
            balance=closing;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount :" );
        double principal=sc.nextDouble();
        System.out.println("enter rate :");
        double rate=sc.nextDouble();
        System.out.println("enter years : ");
        int years=sc.nextInt();
        Bankdeposit obj=new Bankdeposit();
        obj.Amount(principal, rate, years);

    }
}