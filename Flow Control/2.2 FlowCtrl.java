import java.util.Scanner;

public class Exercise2 {
	public static void main(String  args[])
	{
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		if(val%2==0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}