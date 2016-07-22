
import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class Error {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int test_case = sc.nextInt();
        String ans = "";
        for(int i = 0; i < test_case ; i++){
        String input = sc.next();
        char[] temp = input.toCharArray();
        for( int j = 0; j<temp.length - 2 ; j++)
        {
            
            if( temp[j] == '0' && temp [j+1] == '1' && temp[j+2] == '0')    //check for pattern 010
                ans = "Good";
            else if ( temp[j] == '1' &&  temp[j+1] == '0' && temp[j+2] == '1')   //check for pattern 101
                ans = "Good";
            else
                ans = "Bad";
        }
        System.out.println(ans);
                }
    }
}
