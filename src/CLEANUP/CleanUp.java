/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLEANUP;

import java.util.Arrays;

/**
 *
 * @author Vodka
 */
public class CleanUp {
    public static void CleanUp(int job_size , int[] task)
    {
       //initialize all the jobs in size 
        int[] job_array = new int[1001];
        for (int a = 1 ; a <= job_size ; a++)
            job_array[a] = a;
        
        //running through the completed task, if a job is done, replace it with 0
        for (int k = 0 ; k < task.length   ; k++)
            {
               job_array[task[k]] = 0 ; 
            }
        
        //another array to store finished
        int [] job_incomplete = new int[1001];
        int length = 0;
        int count = 1;
        int index = 1;
        while (count<=job_size)
        {
            if (job_array[count] != 0) 
            {
                job_incomplete [index++] = job_array[count];        //if job unfinished, put it on new array
                length ++;
            }
                count ++;         
        }
        String chef = "";
        String assistant = "";
        for (int i = 1 ; i<= length ; i++)
        {
            //smallest , 3rd smallest, 5th smallest ....
            if (i%2 == 1) 
                chef = chef + " " + job_incomplete[i];
            else
                assistant = assistant + " " + job_incomplete[i];
        }
        System.out.println(chef);
        System.out.println(assistant);
    }
    
    public static void main (String[] args)
    {
        int a = 8;
        int[] b = { 3 , 8  };
        CleanUp(a,b);
        
    }
}
