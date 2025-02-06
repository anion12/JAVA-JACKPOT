
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        System.out.flush();
        
        Scanner sc = new Scanner(System.in);
          String s = sc.next();
             int n = s.length();
         boolean  is_palin = true;
   
    
    for(int i = 0;i<n/2;i++)
    {
        if(s.charAt(i)!=s.charAt(n-i-1))
        is_palin = false;
        break;
        
    }
    
    if(is_palin)
    {
        System.out.println("It is a palindrome string");
    }
    
    else{
        System.out.println("It is not a palindrome!");
    }
    
    }
}
