import java.util.Scanner;

public class IT24102678Lab4Q1
{
	public static void main(String[]args)
	{

	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a no");
	int no=scanner.nextInt();
	
	if(no>0){
	System.out.println("the no is positive.");
	
	}else if(no<0){
	System.out.println("the no is negative.");
	
	}else{
	System.out.println("the no is zero.");

	}

	
}
}
