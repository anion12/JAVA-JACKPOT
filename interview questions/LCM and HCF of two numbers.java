// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       
       int min = Math.max(x,y);
       int c = 2;
       int hc = 1;
       
       
       while(c<=min)
       {
           if(x%c==0 && y%c==0)
           {
               hc = Math.max(hc,c);
           }
           
           c++;
           
       }
       System.out.println("The H.C.F of " + x + " and " + y +" is "+hc);
       
       int lc = (x*y)/hc;
       System.out.println("The L.C.M of " + x + " and " + y +" is "+lc);
       
       
    }
}
