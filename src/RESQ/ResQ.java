package RESQ;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class ResQ {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int test_case = sc.nextInt();
        for ( int i = 0; i < test_case ; i++)
        {
            int area = sc.nextInt();
            int nearest_square = (int) Math.sqrt(area);
            int difference = 1000000000;
            int temp_difference = 0;
            for ( int j = 1 ; j<=nearest_square ; j++)
            {
                if (area%j == 0)
                {
                    int length = area/j;
                    temp_difference = length - j;
                }
                if(temp_difference == 0 || temp_difference<difference )
                    difference = temp_difference;
            }
           
            System.out.println(difference);
        }
    }
}
