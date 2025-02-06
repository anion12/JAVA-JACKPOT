import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        System.out.flush();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int digit = (int)Math.log10(Math.abs(num))+1;
       
       int original_num = num;
       int sum = 0;
       
       while(num>0)
       {
           int rem = num%10;
           sum += Math.pow(rem,digit);
           num/=10;
           
       }
       
       if(sum == original_num)
       {
           System.out.println("It is an Armstrong Number");
       }
       
       else
       {
           System.out.println("It is not Armstrong Number");
       } 
    }
}
