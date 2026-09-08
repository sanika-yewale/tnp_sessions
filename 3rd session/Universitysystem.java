import java.util.*;
public class Universitysystem {
    void eligibility(String category,double marks,boolean sports, boolean ncc,boolean hostel){
        int cutoff=0;
        int fees=0;
        if(category.equals("general") && marks>=85){
            cutoff=85;
            fees=100000;
        }else if(category.equals("obc")&& marks>=75){
            cutoff=75;
            fees=75000;
        }else if(category.equals("sc") && category.equals("st") && marks>=65){
            cutoff=65;
            fees=50000;
        }
        if(sports==true ){
            cutoff-=5;
        }
        if(ncc==true){
            cutoff-=3;
        }
        if(hostel==true){
            fees+=40000;
        }
        System.out.println("Category:"+ category);
        System.out.println("Score: " + marks);
        System.out.println(" Final Cutoff: " + cutoff);
        System.out.println("Total Fees: " + fees);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String category=sc.nextLine();
        double marks=sc.nextDouble();
        boolean sports=sc.nextBoolean();
        boolean ncc=sc.nextBoolean();
        boolean hostel=sc.nextBoolean();
        Universitysystem us = new Universitysystem();
        us.eligibility(category,marks,sports,ncc,hostel);
        sc.close();
    }
}
