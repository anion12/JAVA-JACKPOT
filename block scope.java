public class Main
  {
public static void main(String s[])
    {
        int a = 10;
      
      {
          int a = 50;//this is not possible as 'a' is already intialised in the main method
          a=50;//this is possible as we are using same reference variable to reassign the value of a.
        int c = 50;//The scope of this variable is only limited to this bloack but not outside the block
        
      }
      int c = 500;//this is allowed as the scope of previous c is only inside the block.
      System.out.println(a);
      System.out.println(c);
    }
    
  }
