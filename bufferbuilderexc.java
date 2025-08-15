package EBYAUG06HW;

public class bufferbuilderexc {
 public static void main(String[]args)
 
 {
	 StringBuffer a= new StringBuffer("hello");
	 a.append(" world");
	 
	 a.replace(0,0, "hai");
	 
	 System.out.println(a);
 }
}
