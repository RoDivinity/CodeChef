/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COINFLIP;

/**
 *
 * @author Vodka
 */
public class CoinFlip {
    public static void coinFlip(int numCoin, int init)
    {
        //init  = 1: head
        //      = 0: tail
        if (numCoin % 2 == 0)
            System.out.println ("Number of head = number of tail = "+numCoin/2);
        else
        {
            if (init == 0)
            {
                System.out.println("Number of head = " + (numCoin+1)/2  );
                System.out.println("Number of tail = " +  numCoin/2     );
            }
            else
            {
                System.out.println("Number of head = " +    numCoin/2  );
                System.out.println("Number of tail = " +  (numCoin+1)/2  );
            }
        }
        
    }
    
    public static void main (String[] args)
    {
        coinFlip( 5, 1);
    }
}
