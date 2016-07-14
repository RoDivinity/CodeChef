/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIELAB;

/**
 *
 * @author Vodka
 */
public class CielAB {
    
    public static int CielAB (int x , int y)
    {
        int ans = x-y;
        if(ans%10 == 9) 
            return --ans;
        else
            return ++ans;
    }
    
    public static void main (String[] args)
    {
        System.out.println(CielAB(12215,3034));
    }
}
