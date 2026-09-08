public class railwayticket {
    public void system(int classes,int age,boolean isTatkal){
       double fare = getfare(classes);
       System.out.println("Class : "+classes);
       if(age<5){
            fare=fare*0;
        }
        else if(age<5 &&age>=12){
            fare=fare*0.5;
        }else if(age>=60){
            fare=fare*0.3;
        }
        if(isTatkal){
            System.out.println("Tatkal : "+gettatkal(classes));
            fare=fare+gettatkal(classes);
        }
        System.out.println("Ticket fare is :"+fare); 
    }
    public double getfare(int trainclass){
         switch(trainclass){
            case 1: 
            System.out.println("price :"+3000);return 3000;
            case 2: System.out.println("price :"+2000);return 2000;
            case 3:System.out.println("price :"+800);return 800;
            default:System.out.println("price :"+300);return 300;
        }
    }
    public double gettatkal(int trainclass){
        if(trainclass ==3 || trainclass==4){
            return 200;
        }
        else if(trainclass==1 || trainclass==2){
            return 500;
        }
        return 0;
    }
    public static void main(String[] args) {
        railwayticket obj=new railwayticket();
        obj.system(1, 20, true);
    }
}
