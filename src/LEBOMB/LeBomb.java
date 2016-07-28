package LEBOMB;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class LeBomb {
    public static void main (String args[] )
    {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for ( int i = 0 ; i<test_case ; i++ )
        {
            int length = sc.nextInt();
            System.out.println(length);
            String input = sc.next();
            char[] data = input.toCharArray();
            int count = 0;
            if(length == 0)
                count = 0;
            else if (length == 1)
            { if (data[0] == '0')
                    count = 1; }
            else
            {
            if (data[0] == '0' && data[1] == '0') //test 2 special case at the front and end
            { 
                count ++;
            }
            if (data[length-2] == '0' && data[length - 1] == '0')
            {
                count ++;
            }
            for (int j = 1 ; j<length-1 ; j++)  //if one cell has bomb, 3 building down 
                                                //hence 3 consecutive building must be free of bomb to count
            {
                if (data[j] == '0'  && data[j+1] == '0' && data[j-1] == '0')
                    count ++;
            }
            System.out.println(count);
            }
        }
    }
}
