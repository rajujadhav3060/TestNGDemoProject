package Overriding;

public class Test1 extends OverridingDemo
{
	 public void myMethod()
	 {
	 System.out.println("Method is in child class");
	 }
	 
	 public static void main(String[] args)
	 {
		 Test1  obj = new Test1();
		 obj.myMethod();
		 
	 }
}