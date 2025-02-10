import java.util.*;

public class Main
  {
    public static void main(String args[])
    {
        System.out.print("Enter the String to be reversed: ");
      System.out.flush();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length(); 
      String rev_s = "";
      for(int i = n-1;i>=0;i--)
        {
            rev_s+=s.charAt(i);
        }

      System.out.println(rev_s);
        
      

        

    }
  }
