package EBYAUG06HW;

 class tata {   
	    String a ="punch";
	    int b=2022;	    
	    void display() {
	        System.out.println( a);
	        System.out.println(b);
	    }
	}
 class mahindra{
	 String e="SUV";
	 int f=2018;
	 void play()
	 {
		 System.out.println(e);
		 System.out.println(f);
	 }
 }
	public class carcallexc {
	    public static void main(String[] args) {
	        
	        mahindra c = new mahindra();
	        c.play();
	        tata g=new tata();
	        g.display();
	    }
	}
