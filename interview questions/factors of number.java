import java.util.*;

public class Main
  {
    public static void main(String s[])
    {
      ArrayList<Integer> arr = new ArrayList<>();//used to store elements just like array but dynamic array length in java.
      System.out.print("Enter the number: ");
      System.out.flush();
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = 1;
      while(x<=n)
        {
          if(n%x==0)
          {
              arr.add(x);
            
          }

          x++;
          
        }

      System.out.println("The factors of "+n +" are: "+arr);
      
    }
  }
