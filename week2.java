import java.util.*;
public class week2{
    public static int maxAmount(int a ,int b,int c){
        int max = Math.max(a,Math.max(b,c));
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter month number:");
        int monthNumber = sc.nextInt();
        // BigAmountThree obj = new BigAmountThree();
        int result1 = maxAmount(a, b, c);
        int result2 = getBig(a, b, c);
        System.out.println("The maximum amount is: " + result2);
        String monthName=month(monthNumber);
        System.out.println("The month name is : "+monthName);
        divisible(monthNumber);

    }
    public static int getBig(int first,int second, int third){
        return (first>second && first>third) ? first:(second>third)?second:third;
    }
    // write a method to define month name by taking month number as input
    public static String month(int number){
        switch(number){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
    }
    public static void divisible(int number){
        if(number%5==0){
            System.out.println("FIZZ");
        }
        else if(number%7==0){
            System.out.println("BUZZ");
        }
        else if(number%5==0 && number%7==0){
            System.out.println("FIZZ BUZZ");
        }
        else{
            System.out.println("none");
        }
    }
    

}