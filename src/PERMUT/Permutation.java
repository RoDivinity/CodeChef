package PERMUT;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class Permutation {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int test_case = sc.nextInt();
        for (int i = 0 ; i < test_case ; i++)
        {
            int size = sc.nextInt();
            int[] data = new int[size];
            for( int j = 0; j<size ; j++)
            {
                data[j] = sc.nextInt();
            }
            int local_inv = 0 ;
            int inv = 0;
            for ( int k = 0 ; k<size ; k++)
            {
                if (size == 1)                          //local inversions = inversions
                
                    break;
                for (int l = k + 1 ; l<size ; l++ )         //loop thru elements to count inversions
                { 
                    if (data[k] > data[l])
                        inv ++;
                }                
            }
            for ( int z = 0; z<size - 1 ; z++)          //loop thru elements to count local inversions
            {
                if (data[z] > data[z+1])
                    local_inv ++;
            }
            if  (local_inv != inv)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
