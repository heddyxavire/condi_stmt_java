package EBYAUG06HW;

import java.util.Arrays;

public class Schooldata {
public static void main(String[]args)
{
    String name =" ravanan";
	final int id= 641020;
	
	
	int[] mark;
	mark=new int[5];
	mark[0]=42;
	mark[1]=35;
	mark[2]=62;
	mark[3]=75;
	mark[4]=82;
	
	int total=mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
	float avg=total/mark.length;
	
	
	
	System.out.println("name:"+ name);
	System.out.println("id number:"+id);
	System.out.println(("eng:" +mark[0]));
	System.out.println(("lang:" +mark[1]));
	System.out.println(("soc:" +mark[2]));
	System.out.println(("sci:" +mark[3]));
	System.out.println(("math:" +mark[4]));
	System.out.println("total:"+total);
	System.out.println("avg:"+avg);

}
}
