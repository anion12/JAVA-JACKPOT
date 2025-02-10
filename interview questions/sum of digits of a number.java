import java.util.*;

public class Main
  {
    public static void main(String args[])
    {
      System.out.print("Enter the number: ");
      System.out.flush();

      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int sum = 0;
      int num = x;

      while(x>0)
        {
            int rem = x%10;
            sum+=rem;
          x/=10;
        }
  System.out.println("The sum of the digits of " +num+" is "+sum);
      
    }

  }
