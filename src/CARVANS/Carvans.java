/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CARVANS;

/**
 *
 * @author Vodka
 */
public class Carvans {
    public static int Carvans (int num_car, int[] car_list)
    {
        int i, max_speed, ans = 1;          //there's always 1 car max_speed, first car 
        max_speed = car_list[0];            //the speed of first car enter the straight track
        for (i = 0; i < num_car; i++)
        {
            if(car_list[i] < max_speed)     //loop thru the car list, if there's car < max_speed
            {                               //increases # of max_speed car , make new max_speed = its speed
                ans++;
                max_speed = car_list[i];
            }
        }
        return ans;
    }
    
    public static void main (String[] args)
    {
        int[] testA = { 8 , 3 , 6 };
        int[] testB = { 4 , 5 , 1 , 2 , 3};
        System.out.println(Carvans(3,testA));
        System.out.println(Carvans(5,testB));
    }
}
