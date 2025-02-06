import java.util.*;

class Main {
    public static void main(String[] args) {
      System.out.print("Enter the nth position of the number: "); 
        System.out.flush();
       

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = b;
        
        if(n == 1)
        {
            System.out.println(0);
        }
        
        if(n==2)
        {
            System.out.println(1);
        }

        for (int i = 3; i <= n; i++) {
           
            b = b + a;
            a = c;
            c = b;
        }
         System.out.println(b);
    }
}
