/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUYING;

import java.util.Scanner;

/**
 *
 * @author Vodka
 */
public class Buying {
    public static int Buying (int num_notes , int price , int[] notes)
    {
        int min = notes[num_notes - 1]; //initialize the minimum value of the bank note
        int sum = 0;                    //find sum of all notes
        while (num_notes > 0)
        {
            if(notes[num_notes - 1] < min)  //if find a smaller note, change min
                min = notes[num_notes - 1];
            sum += notes[num_notes - 1];
            num_notes -- ;
        }
        int n_notes = (int) sum / price;
        int remainder = (int) sum % price;
        if (remainder > min)
            return -1;
        return n_notes;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
            int test_case = scan.nextInt();
            for (int t = 0 ; t < test_case; t++)
            {
                int num = scan.nextInt();
                int price = scan.nextInt();
                int[] notes = new int[num];
                for (int i = 0 ; i < num ; i++)
                {
                    notes[i] = scan.nextInt();
                }
                System.out.println(Buying(num , price , notes));
            }
    }
}
