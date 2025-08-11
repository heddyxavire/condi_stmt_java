package EBYAUG06HW;

import java.util.Scanner;

public class studentHW {
	public static void main(String[] args)
	{   
	 Scanner marks= new Scanner(System.in);
	 System.out.println("enter eng:"); 
	 int eng=marks.nextInt();
	 System.out.println("ent lang");
	 int lang=marks.nextInt();
	 System.out.println("ent sci");
	 int sci=marks.nextInt();
	 System.out.println("ent soc");
	 int soc=marks.nextInt();
	 System.out.println("ent math");
	 int math=marks.nextInt();
	 
	 int total=eng+lang+sci+soc+math;
			 System.out.println("toatl"+total);
}
}