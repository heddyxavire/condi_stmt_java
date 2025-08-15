package EBYAUG06HW;

import java.util.Scanner;

public class palindroexc {
public static void main(String[] args)
{
	Scanner a=new Scanner(System.in);
	System.out.println("enter a palindrome :");
	String word=a.nextLine();
	System.out.println("your input:"+ word);
	StringBuilder rev= new StringBuilder(word);
	rev.reverse();
	System.out.println(rev);
	if(word.equals(rev.toString()))
{

	System.out.println("palindrome");
}
else
{
	System.out.println("not paalindrome");
}
}
}