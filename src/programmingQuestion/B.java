package programmingQuestion;

import java.util.Scanner;

abstract class Cofee{
	Cofee()
	{
		System.out.println("A");
	}
	
}
class ColdCofee extends Cofee
{
	ColdCofee()
	{
		System.out.println("B");
	}
}
public class B {
	int birds = 10;
	B()
	{
		this(20);
	}
	B(int birds)
	{
		System.out.println("Birds+"+birds);
		
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
