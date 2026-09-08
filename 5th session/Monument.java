package session5th;

import java.util.*;

public class Monument {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number : ");
        int size=sc.nextInt();
        while(true){
            if(size<=15)
                break;
            size=15;
            break;
        }
        System.out.println("\n---deafualt border ----");
            printDiamond(size,'#' );
            System.out.println("\n----Custom border-------");
            printDiamond(size,'*' );
            sc.close();
    }
    static void printDiamond(int size,char border){
        if(size%2==0) size++;
        int middle=size/2+1;
        for(int row=1;row<=size;row++){
            int num;

            if(row<=middle){
                num=row;
            }else{
                num=size-row+1;
            }
            for(int s=1;s<=middle-num;s++){
                System.out.print("  ");
            }
            if(num%3==0){
                for(int j=1;j<=2*num-1;j++){
                    System.out.print(border+" ");
                }
            }else{
                System.out.print(border+" ");
                for(int i=1;i<=2*num-3;i++){
                    System.out.print(num+" ");
                }
                if(num>1){
                    System.out.print(border+" ");
                }
            }
            System.out.println();
        }
    }
}
