/*A year is a leap year wheen it is divided by 4 and if talked about the 
centuries which end with 00 they should be divisible by 400*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        boolean is_leap = false;

        if (x % 4 == 0) {
            if (x % 100 == 0) {
                if (x % 400 == 0) {
                    is_leap = true; // Century year must be divisible by 400
                }
            } else {
                is_leap = true; // Normal leap year
            }
        }

        if (is_leap) {
            System.out.println(x + " is a leap year.");
        } else {
            System.out.println(x + " is not a leap year.");
        }
    }
}
