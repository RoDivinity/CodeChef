package MAXDIFF;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class MaxDiff {
    public static int[] sort (int[] data)
    {
        int i, j, first, temp;  
     for ( i = data.length - 1; i > 0; i -- )  
     {
          first = 0;   //initialize to subscript of first element so we have some temporary max!
          for(j = 1; j <= i; j ++)   //locate the largest element between positions 1 and i.
          {
               if( data[ j ] > data[ first ] )         
                 first = j;
          }
          temp = data[ first ];   //swap the largest found with element in position i.
          data[ first ] = data[ i ];
          data[ i ] = temp; 
      }        
        return data;
    }
    public static int sum (int[] data)
    {
        int ans = 0;
        for (int i = 0 ; i<data.length ; i++)
            ans += data[i];
        return ans;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int test_case = sc.nextInt();
        for (int i = 0 ; i < test_case ; i++)
        {
            int length = sc.nextInt();
            int sub_length = sc.nextInt();
            int[] data = new int[length];
            int[] sub_data = new int[sub_length];
            for (int j = 0; j<length ; j++)
            {
                data[j] = sc.nextInt();
            }
            sort(data);
            for( int k = 0; k<sub_length; k++)
            {
             sub_data[k] = data[k];
             data[k] = 0;
            }
            int sum1 = sum(data);
            int sum2 = sum(sub_data);
            System.out.println(sum1 - sum2);
        }
    }
}
