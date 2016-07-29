package DIVIDING;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class Dividing {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int length = sc.nextInt();
            int total = 0;
                for (int i = 0 ; i<length ; i++)
                    total += sc.nextInt();
               int sum = (length + 1)*length/2 ;
               if (total >= sum)
                   System.out.println("YES");
               else 
                   System.out.println("NO");
               t--;
        }
    }
}
