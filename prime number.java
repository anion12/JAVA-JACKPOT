import java.util.*;


public class prime 
{
  public static void main(String[] s)
  {

      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      int c = 2;
      boolean res = true;
    
    while(c<num)
      {
          if(num%c==0)
          {
              res = false;
              break;
          }
          else
          {
                c = c+1;
          }

      }

    if(res)
    {
      System.out.println("it is a prime");
   }
    else
    {
        System.out.println("its not a prime");
    }
  
  }
}
