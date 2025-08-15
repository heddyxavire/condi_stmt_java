package EBYAUG06HW;

import java.util.Arrays;
public class Marksheetloopeg {

public static void main(String[]args) {
	int en= 52;
	int lang=42;
	int math=62;
	int sci=87;
	int soc=51;
	int fail=40;
	if(en<fail || lang<fail || math<fail || sci<fail ||soc<fail) {
		System.out.println("better luck next time");
	}
	else {
		System.out.println("passed");
	}
for (int i=1;i<=5;++i) {
	System.out.println(i);
}
}
}