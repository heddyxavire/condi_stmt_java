package EBYAUG06HW;


	class pc
	{
	    String brand;
	    int ram;

	    public pc()
	    {
	        brand = "hp";
	        ram = 64;
	    }
	    public pc(String brand, int ram)
	    {
	        this.brand = brand;
	        this.ram = ram;
	    }
	    public void display()
	    {
	        System.out.println("Brand: " + brand);
	        System.out.println("RAM: " + ram + "bit");
	        System.out.println("------------------");
	    }
}

public class ConstructorHW {
	public static void main(String[] args) 
	{
        pc a = new pc();
        a.display();
        pc b = new pc("Dell", 16);
        b.display();
    }
}
	
