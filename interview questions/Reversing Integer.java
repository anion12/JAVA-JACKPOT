import java.util.*;

public class Main
  {
    public static void main(String s[])
    {
      System.out.println("Enter the Number to reverse it!: ");
      System.out.flush();
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      int result = 0;

      while(num>0)
        {
          int rem = num%10;
          result = result*10+rem;
          num/=10;
        }
      
      System.out.println("The reverse of the number is : " + result);
      
    }

  }
