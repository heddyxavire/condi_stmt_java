package EBYAUG06HW;

public class Wh
{
 int products= 220;
 int eachprice =54;
 int totalvalue=products*eachprice;
 String warehouse= "abt service";
	 void show()
	 {
		 String name="BRUcafe";
		 System.out.println("name:" + name);
	 }
	 public static void main(String[] args)
{
	Wh obj= new Wh();
	obj.show();
	System.out.println("products:" + obj.products);
	System.out.println("name:" + obj.warehouse);
	System.out.println("price:" +obj.eachprice);
	System.out.println("totalvalue:" +obj.totalvalue);
}
}
