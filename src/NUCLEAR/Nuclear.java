/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NUCLEAR;

import java.util.Arrays;

/**
 *
 * @author Vodka
 */
public class Nuclear {
    public static void Nuclear(int particles, int chambers, int chamb_max)
    {
        int[] par_array = new int[chambers];
        //find the maximum particles bombarded to make the chambers reset to all 0
        int max = (int) java.lang.Math.pow((chamb_max + 1) , chambers);
        int arrangement = particles % max;
        int power = chambers - 1;
        while (power > -1)
        {
            par_array[power] = (int) ((int) arrangement / java.lang.Math.pow((chamb_max +1) , power ));
            arrangement = (int) (arrangement % java.lang.Math.pow((chamb_max +1) , power ));
            System.out.println(par_array[power]);
            power --;
        }
        
    }
    
    public static void main (String[] args)
    {
        Nuclear (5 , 2 , 3);
    }
}
