package EBYAUG06HW;

class Animal
{
void eat()
{
	System.out.println("animal is eating");
}
}
class Dog extends Animal
{
void bark()
{
	System.out.println("dog is barking");
}
}
class Puppy extends Dog
{
void weep()
	{
		System.out.println("is weeping");
	}

}

public class Inheritance2 {
	public static void main(String[]args) {
		Puppy g =new Puppy ();
		g.eat();
		g.bark();
		g.weep();				
	}
}
