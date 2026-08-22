public class incometax{
public static void Incometax(int age,int income){
        double tax=0;
        if(age <=60 ){
            if(income<=300000){
                tax=income*0;
            }
            else if(income >300000 && income <=500000){
                tax=income*0.05;
            }
            else if(income >500000 && income <1000000){
                tax=income*0.2;
            }
            else if(income >1000000){
                tax=income*0.3;
            }
        }
        else if(age>60 && age<=79){
            if(income <=350000){
                tax=income*0;
            }else if(income >350000 && income <=500000){
                tax=income*0.05;
            }else if(income >500000 && income <=1000000){
                tax=income*0.2;
            }else if(income >1000000){
                tax =income* 0.2;
            }
        }else if(age>=80){
            if(income <=500000){
                tax=income *0;
            }
            else if(income >500000 && income <=1000000){
                tax=income*0.2;
            }else if(income >=1000000){
                tax =income *0.3;
            }
        }
        double cess=tax*0.04;
        double totaltax=tax+cess;
        System.out.println("Taxable Income :"+income);
        System.out.println("age : "+age);
        System.out.println("TAX : "+tax);
        System.out.println("cess : "+cess);
        System.out.println("total tax :"+totaltax);
    }
    public static void main(String[] args) {
        incometax obj=new incometax();
        obj.Incometax(10,500000);
    }
}