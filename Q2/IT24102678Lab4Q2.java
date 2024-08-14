import java.util.Scanner; 
public class IT24102678Lab4Q2{
	
	public static void main (String[]args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("please enter the exam marks out of 100");
	int examMarks=scanner.nextInt();

	if(examMarks<0 || examMarks>100){
		System.out.println("Invalid input for exam marks .Terminate the program");
		return;
	}
	
	System.out.println("please enter the lab submission mark out of 100");
	int labMark=scanner.nextInt();

	if(labMark<0 || labMark>100){
	System.out.println("Invalid labMarks.Terminating program");
	return;
	}

	System.out.println("please enter the percentage given for exams");
	int percentageMark=scanner.nextInt();
	
	if(percentageMark<0 || percentageMark>100){
	System.out.println("Invalid percentage mark.Terminating program");
	return;
	}

	
	System.out.println("please enter the percentage given for lab submission"); 
	int percentageLabmark=scanner.nextInt();

	if(percentageLabmark<0 || percentageLabmark>100){
	System.out.println("Invalid percentage Lab mark.Terminating the program");
	return;
	}

	if(percentageLabmark+percentageMark!=100){
	System.out.println("Invalid percentage mark.Terminating the program");

	return;
	}

	double finalMark=(examMarks*percentageMark/100)+(labMark*percentageLabmark/100);
	System.out.println("Final mark is:"+finalMark);

}
}


	