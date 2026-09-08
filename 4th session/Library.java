import java.util.Scanner;

public class Library {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int totalbooks=0;
        double totalfine=0;
        String overduelist="";
        char more;
        do{
            System.out.println("enter book id:");
            int bookid=sc.nextInt();
            System.out.println("enter due date:");
            int duedate=sc.nextInt();
            System.out.println("enter return date:");
            int returndate=sc.nextInt();
            totalbooks++;
            if(returndate>duedate){
                int days=returndate-duedate;
                int fine=days*5;
                totalfine+=fine;
                overduelist+=bookid+" ";
                System.out.println("book id: "+bookid+" is overdue by "+days+" days.");
            }else if(returndate<duedate){
                System.out.println("thank you for returning the book on time!");
            }
            System.out.print("Process another book? (Y/N): ");
more = sc.next().toUpperCase().charAt(0);
        }while(more=='Y');
        sc.close();
        System.out.println("total books: "+totalbooks);
        System.out.println("total fine: "+totalfine);
        System.out.println("overdue books: "+overduelist);
    }
}
