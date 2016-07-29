package COINS;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class Coins {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int test_case = sc.nextInt();
        for (int t = 0; t<test_case ; t++)
        {
            int coin_val = sc.nextInt();
            int coin1 = (int) coin_val / 2;
            int coin2 = (int) coin_val / 3;
            int coin3 = (int) coin_val / 4;
            int sum = coin1 + coin2 + coin3;
            if (sum < coin_val)
                System.out.println(coin_val);
            else
                System.out.println(sum);
        }
    }
}
