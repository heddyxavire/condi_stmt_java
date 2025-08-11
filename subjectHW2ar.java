package EBYAUG06HW;

import java.util.Scanner;

public class subjectHW2ar
{
public static void main(String[]args)
{
	Scanner marks=new Scanner(System.in);
	String[] x= {"eng","tam","soc","sci","math"};		
	int total=0;
	for (int a=0;a<=x.length;a++)		
	{
		
		System.out.println("mark:"+ a);
		int score=marks.nextInt();
		total+=score;
	    System.out.println("total"+total);
	}
	if(total>=400)
	{
		System.out.println("grade A");
	}
	else if (total>300)
	{
		System.out.println("grade B");
	}
	else 
	{
		System.out.println("grade c");
	}
    marks.close();
}
}