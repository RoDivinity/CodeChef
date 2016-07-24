import java.util.*;

class main {
public static void main (String[] args)
{
	Scanner sc = new Scanner (System.in);
	int test_case = sc.nextInt();
	for (int i = 0 ; i <test_case ; i ++)
	{
		int input = sc.nextInt();
		if (input % 4 == 1)                 //two player always can subtract a number that make sum of 2 turn divisible by 4
			System.out.println ("Alice");     //hence if u want to win just try to subtract the prime numbers that added together
		else                                //with previous turn to be divisible by 4
		System.out.println("Bob");          //Bob always win unless N % 4 == 1
		}
	}
	
	}
