import java.util.*;

public class Main
  {
    public static void main(String s[])
    {
      System.out.print("Enter the number of terms: ");
      System.out.flush();
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int sum = 0;
      System.out.print("Enter the numbers: ");
      System.out.flush();
    
      for(int i = 0;i<n;i++)
        {
            double f = sc.nextDouble();
          sum+=f;
        }

      double avg_sum = sum/n;
      System.out.println("The Average of "+n+" numbers is : "+avg_sum);
    }
  }
