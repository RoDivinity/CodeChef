import java.util.Scanner;
/**
 *
 * @author Vodka
 */
public class Main {
    public static void main (String[] args)
    {
     Scanner sc = new Scanner (System.in);
     int t = sc.nextInt();
     while ( t > 0)
     {
         int length = sc.nextInt();
         int[] land = new int[length];
         for ( int i = 0; i < length ; i ++)
             land[i] = sc.nextInt();
         System.out.println(check(land));
          t -- ;
     }
     //System.out.println(t);
     
    }
    
    public static String check(int[] in)
    {
        String ans = "";
        boolean isGood = false;         //flag for validity
        int flag = in.length / 2;
        int start = 0;                  //count both ends
        int end   = in.length - 1;
        int pos   = 1;
        
        while (start < flag)
        {
            if(in[start] == in[end] && in[start] == pos)
                isGood = true;
          
            pos   ++ ;
            start ++ ;
            end   -- ;
            //System.out.println("One loop! and pos is " + pos);
        }
       // System.out.println("Current repeated sequence stop at "+ pos);
           if(in[flag++] != pos )
               isGood = false;
        
        if(isGood)
            ans = "yes";
        else
            ans = "no";
        return ans;
    }
}
