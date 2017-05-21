import java.util.Arrays;
import java.util.Scanner;


//Not yet try for maximize big-O
//Can implement quick sort
//Can implement the binary search to find the largest snake < required length
//To count for how many possible snake to eat, my algorithm order is n (should drop to linear?)


	public class Main 
	{
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
			int t = Integer.parseInt(sc.nextLine());
			while ( t > 0 )
                        {
			int num_snake = sc.nextInt();
			int q = sc.nextInt(); //number of querry
			int[] snake_length = new int[num_snake];
			
			for ( int i = 0 ; i < num_snake ; i ++ )
				{
					snake_length[i] = sc.nextInt();
				}
			for ( int j = 0 ; j < q ; j ++)
                            {
					int querry = sc.nextInt();
                                        System.out.println(count(snake_length , querry));
                            }
                            t -- ;
                        }
                }
                
    
    public static int count(int[] snake_length , int querry)
                {
                    int top = 0;
                    int bottom = 0;
                    Arrays.sort(snake_length);
                    while(snake_length[bottom] < querry && bottom < snake_length.length)
                    {
                        bottom ++;
                        if(bottom == snake_length.length)
                            break;
                    }
                    int count = snake_length.length - bottom;
                    bottom --;
                    while (top < bottom)
        {
            if (snake_length[bottom] + bottom  < querry) //largest snake of small ones eat the rest but still can't make it
                break;
            else    
            {    
            top += querry - snake_length[bottom];
            bottom --;
            count ++;
            System.out.println("Added new one!");
            }
        }
                            return count;
                }          
	}
