/* FURTHER EXPLANATION : Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String s = sc.nextLine();

       
            if (s.equals("x")) {
                break;
            }

            try {
                // Parse the integer and add to the sum
                int a = Integer.parseInt(s);
                sum += a;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }

        System.out.println("Sum: " + sum);
    }
}
