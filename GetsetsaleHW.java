package EBYAUG06HW;

import java.util.Scanner;

class sale
{
	private String name;
	private int price;
	public sale(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class GetsetsaleHW {
	public static void main(String[] args)
	{
		Scanner val= new Scanner(System.in);
		System.out.println("enter a name:");
		String title=val.nextLine();
		System.out.println("enter a price:");
		int MRP=val.nextInt();
		sale book=new sale(title,MRP);
		book.setPrice(1000);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	
	}

}
