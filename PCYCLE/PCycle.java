package PCYCLE;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class PCycle {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];          //scan the permutation
        for (int i = 0; i < num; i++)
        {
            data[i] = sc.nextInt();
        }
        String ans = "";
        for ( int j = 0 ; j <num ; j++)
        {
            if (data[j] != 0)               //already cycle through this element
            {
            int next_index = data[j] - 1;   //find next index
            ans = ans + " " + (j+1);
            while (data[next_index]!=0)     //if not cycle thru alr
            {
                ans = ans + " " + (next_index + 1);
                int temp = data[next_index] - 1;
                data[next_index] = 0;
                next_index = temp;
            }
            System.out.println (ans);
            ans = "";
        }
        
    }
    }
}
