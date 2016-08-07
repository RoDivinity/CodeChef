package KINGSHIP;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class KingShip {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for ( int i = 0 ; i < t ; i++ ) {
            int num = sc.nextInt();
            int sum = 0;        
            int min = sc.nextInt();             //initialize min number
            sum += min;
            for ( int j = 1 ; j < num ; j++ ) {
                int temp = sc.nextInt();        //compare next number with current temp
                if (temp < min)
                    min = temp;                 //if smaller, replace min
                sum += temp;                    
            }
            System.out.println( (sum - min)*min);
        }
    }
}
