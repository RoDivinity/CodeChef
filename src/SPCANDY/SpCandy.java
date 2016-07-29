package SPCANDY;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class SpCandy {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int i = 0 ; i<test_case ; i++)
        {
            int candy = sc.nextInt();
            int stu = sc.nextInt();
            int quotient = (int) candy / stu ;
            int remainder = candy % stu ;
            System.out.println ( quotient + " " + remainder);
        }
    }
}
