package Overriding;

public class OverloadingDemo {
		 public void add(int a, int b)
		 {
			 int c=a+b;
			 System.out.println("The addition is: "+c);
		 }
		 public void sub(int a, int b)
		 {
			 int c=a-b;
			 System.out.println("The substraction is: "+ c);
		 }
		 public void add(String str)
		 {
			 System.out.println("The String is: "+str);
		 }
		 public void add(int a,int b, int c, int d)
		 {
			 int e = a+b+c+d;
			 System.out.println("the addition is: "+e);
		 }
		 
		 public static void main(String[] args)
		 {
			 OverloadingDemo obj = new OverloadingDemo();
			 obj.add(12,20);
			 obj.sub(50, 10);
			 obj.add("Scott");
			 obj.add(12, 23, 23, 23);
		 }
}

