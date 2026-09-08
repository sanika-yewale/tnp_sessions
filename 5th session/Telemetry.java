package session5th;
import java.util.*;
public class Telemetry {
    public static void main(String[] args){
        
    
   
        Scanner sc =new Scanner(System.in);
        System.out.println("enter corrupted string : ");
        String corrupted=sc.nextLine();
        String[] data=corrupted.split("[;,]");
        Double tempsum=0.0;
        int tempcount=0;
        Double maxpress=Double.MIN_VALUE;
        int presscount=0;
        String[] status=new String[10];
        int statuscount=0;
        for(String item:data){
        String[] pair=item.split(":");
        String key=pair[0];
        String value=pair[1];
        if(key.equals("T")){
            Double temp=Double.parseDouble(value);
            tempsum+=temp;
            tempcount++;
        }else if(key.equals("P")){
            Double press1=Double.parseDouble(value);
            if(press1>maxpress){
                maxpress=press1;
            }
            presscount++;
        }else if(key.equals("S")){
            status[statuscount]=value;
            statuscount++;
        }}
        Double avgtemp=tempsum/tempcount;
        System.out.println("----Telemetry Report ------");
        System.out.println("Temperature Readings: "+tempcount);
        System.out.println("Average temp : "+avgtemp);
        System.out.println("Max Pressure : "+maxpress);
        System.out.println("Pressure Readings : "+presscount);
        System.out.println("System status : ");
        for(int i=0;i<statuscount;i++){
            System.out.println("["+ statuscount+"]"+status[i]);
        }
        sc.close();
    }

}
