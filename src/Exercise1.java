import java.util.Scanner;

public class Exercise1 {
	public static int cubic(int n)
	{
	int sum = 0;
	for(int x = 0; x < n; x++)
	{
		for (int y = 0; y < n; y++)
		{
			for (int z = 0; z < n; z++)
			{
				sum += x*y/(z+1);
			}
		}
	}
	return sum;
	}
	
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter an integer: ");
	int n = scan.nextInt();
	System.out.println("Answer is: " + cubic(n));
	scan.close();
	}
}
