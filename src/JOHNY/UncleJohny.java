/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOHNY;

/**
 *
 * @author Vodka
 */
public class UncleJohny {
    public static int UncleJohny(int num_song, int[] playlist, int index)
    {
        /* remeber array start with index 0 */
        //save Uncle Johny Song
        int m_UncleJohny = playlist[index - 1];
        //sort the playlist
        shell_sort(playlist);
        //loop through the list to find the new index
        for (int i = 0 ; i<num_song ; i++)
        {
            if ( playlist[i] == m_UncleJohny)
               index = i+1;
        }
        return index;
    }    
        


    public static void shell_sort(int[] array){
    int inner, outer;               //inner represent sub array, outer represent main array
    int temp;                       
    int h = 1;
    while (h <= array.length / 3)   //why we need this? to count how many times we need to repeat
                                    //insertion sort
    {
      h = h * 3 + 1;
      
    }
    
    while (h > 0) {
      
        for (outer = h; outer < array.length; outer++) 
      {
        temp = array[outer];                    //start of the element in gap position
        inner = outer;
      
        while (inner > h - 1 && array[inner - h] >= temp)   //check if 2 elements of the corresponding 
                                                            //index gap is in correct order
                                                            // need inner > h-1 so that index is not out of bound, otherwise inner -h <0 
        {                                                   // need while loop because we need to insertion sort all sub array
          
          //System.out.println("we swapped "+array[inner-h]+ " with " + temp);
          array[inner] = array[inner - h];  //swap if finding elements are out of order
          inner -= h;
          
         
        }
        array[inner] = temp;
        
      }
        
      h = (h - 1) / 3; //reduce the gap between indices comparing
      System.out.println(java.util.Arrays.toString(array));
    }
          
    }
    /*
    public static void main (String[] args)
    {
        int[] testA = { 1 , 3 , 4 , 2 };
        int[] testB = { 1 , 2 , 3 , 9 , 4};
         
        System.out.println(UncleJohny (4, testA, 2));
        System.out.println(UncleJohny (5, testB, 5));
        System.out.println(UncleJohny (5, testB, 1));
    }
*/
}

