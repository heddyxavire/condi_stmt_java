package EBYAUG06HW;

import java.util.Arrays;

public class Arraycallex {
public static void main(String[] args)
{
	int[] clubs= {5,7,6,9};
	System.out.println( clubs.length);
	System.out.println(Arrays.toString(clubs));
     
	Arrays.sort(clubs);
	System.out.println(Arrays.toString(clubs));
	
	int[] hyna=Arrays.copyOf(clubs,2);
	System.out.println(Arrays.toString(hyna));
}
}
