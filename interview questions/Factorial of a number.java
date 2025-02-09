import java.util.*;

public class Main
  {
public static void main(String s[])
    {
        System.out.print("Enter a number: ");
      System.out.flush();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int x = 1;
      int result = 1;

      while(x<=n)
        {
         result*=x;
          x++;
    }
    System.out.println("The Factorial of number "+n +" is: "+result);
  }
  }
