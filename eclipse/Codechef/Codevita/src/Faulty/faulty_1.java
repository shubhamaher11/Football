package Faulty;
import java.util.Scanner;

public class faulty_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String faulty = scan.nextLine();
	
		int result = num_operations(input,faulty);
		System.out.println(result);
	}

	private static int num_operations(String input, String faulty) {
		// TODO Auto-generated method stub
		int n1 = input.length();
		int n2 = faulty.length();
		int[] A1 = new int[n2];
		int count=0;
		for(int a = 0;a<n2;a++)
		{
			A1[a] = 0;
		}
		for(int i = 0; i<n1;i++)
		{
			for(int j = 0; j<n2 ;j++)
			{
				if(faulty.charAt(j) == input.charAt(i))
				{
					A1[j]++;
				}
			}
		}
		
		if(n2 == 1)
		{
			count = A1[0];
			return count;
		}
		else if(n2==0)
		{
			return 0;
		}
		else
		{
			count = A1[0]*n2;
			
			for(int k = 1;k<n2;k++)
			{
				count = count+ A1[k]*(n2+2);
			}
			return count;
		}
	}

}
