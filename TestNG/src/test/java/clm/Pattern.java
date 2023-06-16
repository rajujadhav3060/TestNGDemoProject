package clm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pattern {

	public static void main(String[] args) {
	
//		String[] a= {"XYZ","ABC","PQR"};
//		int len = a.length;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(a[i].compareTo(a[j])>0)
//				{
//					String temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
		
		
//		for(int i=0;i<=5;i++)
//		{
//			
//			for(int j=i;j<=5;j++)
//			{
//			System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<=5;i++)
//		{
//			for(int k=4;k>=i;k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<=5;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		
	}
}
//		int n=13;
//		int count=0;
//		for(int i=1; i<=n; i++)
//		{
//			if(n%i==0)
//				count++;
//		}
//		
//		if(count>3)
//		{
//		System.out.println("The number is not prime number ");
//		}
//		else
//		{
//			System.out.println("The number is prime number ");
//		}
//		}
//	}


//		int a[] = { 12, 13, 14, 15, 45, 12, 15, 78};
//        Set<Integer> set = new HashSet();
//		for(int x:a)
//			set.add(x);
//        //	System.out.println(set);
//        	
//        	for(Integer s:set)
//        	{
//        		int count=0;
//        		for(int c:a)
//        		{
//        			if(s==c)
//        			{
//        				count++;
//        			}
//        		}
//        		System.out.println(s +" Occure "+count+" times");
//        	}

//		for(int i=0;i<a.length;i++)
//		{
//			int count=0;
//			for(int j=1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//				}
//				
//			}
//			System.out.println(a[i]+" Occure "+count+" times");
//		}


