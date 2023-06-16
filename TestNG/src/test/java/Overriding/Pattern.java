package Overriding;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

@Test
public class Pattern {
	@Test
	public void number() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void star() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void rightTriangle() {
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void triangle() {
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void fibonicSeries() {
		int a = 0;
		int b = 1;
		int c, count = 10;

		for (int i = 2; i < count; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	@Test
	public void reverseString() {
		String str = "Selenium";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	@Test
	public void stringBuffer() {
		String str = "Software Testing Material";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	@Test
	public void maxArrayElement() {
		int arr[] = { 10, 12, 24, 45, 56, 76 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("The Max value of the element is " + max);
	}

	@Test
	public void primeNumber() {
		int a = 7;
		int count = 0;
		for (int i = 1; i <= a; i++) {

			if (a % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("The number is prime number");
		else
			System.out.println("The number is not prime number");
	}

	@Test
	public void primeNumberList() {
		String primeNumber = "";
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				primeNumber = primeNumber + i + " ";

		}
		System.out.println("The prime number is: ");
		System.out.println(primeNumber);
	}

	@Test
	public void primeNumberseries() {
		String primeNumber = "";
		int count1 = 0;
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
					// count1++;
				}
			}
			if (count == 2) {
				primeNumber = primeNumber + i + " ";
				count1++;
			}
		}
		System.out.println("The list of prime number is:");
		System.out.println(primeNumber);
		System.out.println("The total prime number is:" + count1);
	}

	@Test
	public void primeNummberSeriesFromUser() {
		Scanner sc = new Scanner(System.in);
		String primeNumber = "";
		System.out.println("Enter the number of n:");
		int n = sc.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				primeNumber = primeNumber + i + " ";
				total++;
			}

		}
		System.out.println("The prime number series is:");
		System.out.println(primeNumber);
		System.out.println("The Total count of the prime number is: " + total);
	}

	@Test
	public void sortNumericArray() {
		int a[] = { 12, 21, 32, 34, 94, 12, 34, 95, 56 };
		int temp = 0;
		System.out.println("The Original Array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorting array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Removing duplicate element from the list of array:");
		HashSet set = new LinkedHashSet();

		for (Integer arr : a) {
			set.add(arr);
		}
		System.out.println(set);
	}

	@Test
	public void sortingArray() {
		int a[] = { 10, 23, 4, 5, 54, 3, 2, 23, 12, 89 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorting array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	@Test
	public void sumValueOfArray() {
		int a[] = { 12, 23, 34, 45, 5, 56, 43 };

		int sumOfArray = 0;

		for (int i = 0; i < a.length; i++) {
			sumOfArray = sumOfArray + a[i];
		}

		System.out.println("The addition of array is: " + sumOfArray);
	}

	@Test
	public void squareGrid() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	@Test
	public void averageValueOfArray() {
		int a[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Addition is: " + sum);
		System.out.println("The average of array is:" + sum / a.length);
	}

	@Test

	public void duplicateValuePrint() {
		int arr[] = { 1, 2, 3, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	@Test
	public void duplicateStringPrint() {
		String str[] = { "abc", "pqr", "xyz", "pqr", "abc" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && i != j) {
					System.out.println(str[i]);
				}
			}
		}
	}

	@Test
	public void commanElementTwoArrays() {
		int a[] = { 10, 20, 30 };
		int b[] = { 10, 50, 30 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	@Test
	public void secondLargestElementArray() {
		int a[] = { 12, 23, 45, 5634, 23, 43 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The Sorted array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("The Second largest element is: " + a[a.length - 2]);
	}

	@Test
	public void arrayListConvertToArray() {
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("pqr");
		al.add("xyz");
		al.add("efg");
		System.out.println("The Original Arraylist is: ");
		System.out.println(al);

		String str[] = new String[al.size()];

		al.toArray(str);
		System.out.println("The modified array is: ");
		for (String arr : str) {
			System.out.print(arr);
		}
	}

	@Test
	public void arrayConvertToArrayList() {
		int a[] = { 10, 20, 30, 40, 50 };

		ArrayList al = new ArrayList();

		for (Integer i : a) {
			al.add(i);
		}
		System.out.println(al);
	}

	@Test
	public void arrayConvertToArrayList1() {
		String string[] = { "abc", "pqr", "xyz", "pqr", "abc" };

		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(string));

		System.out.println(al1);

	}

	@Test
	public void occuranceNumber() {
		int a[] = { 10, 20, 30, 20, 10, 40, 30 };

		for (int b : a) {
			int count = 0;
			for (int c : a) {
				if (b == c) {
					count++;
				}
			}
			System.out.println(b + " Occures in " + count + " times");
		}

	}

	@Test
	public void occuranceWithSet() {

		int a[] = { 10, 20, 30, 20, 10, 40 };

		Set<Integer> set = new LinkedHashSet();

		for (int b : a) {
			set.add(b);

		}
		for (Integer i : set) {
			int count = 0;
			for (int c : a) {
				if (i == c) {
					count++;
				}
			}
			System.out.println(i + " occure in " + count + " times");
		}
	}

	@Test
	public void revreseIntegerArray() {
		int a[] = { 10, 20, 30, 40, 50 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}
		System.out.println();
	}

	@Test
	public void reverseString1() {
		String str = "Software Testing Material";
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		System.out.println("Reverse String is: ");
		System.out.println(str1);
	}

	@Test
	public void mergeTwoArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int n = sc.nextInt();
		System.out.println("Enter the size of second array: ");
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		int c[] = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter element of 1st array: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter element of 2 nd array: ");
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;

		}
		for (int i = 0; i < b.length; i++) {
			c[k] = b[i];
			k++;
		}
		System.out.println("The merged array is: ");
		for (int i = 0; i < k; i++) {
			System.out.print(c[i] + " ");
		}
	}

	@Test
	public void deleteDuplicateElement() {

		int a[] = { 10, 20, 30, 40, 30, 20 };
		int b[] = new int[10];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp = a[i];
					a[i] = a[j];
				}
			}

		}
		System.out.println("Removing duplicate element array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	@Test
	public void removeDuplicateUsingSet() {
		int a[] = { 10, 20, 30, 40, 50 };

		Set<Integer> set = new LinkedHashSet();
		for (int i : a) {
			set.add(i);
		}
		System.out.println("Removing duplicate array is: ");
		System.out.println(set);

	}

	@Test
	public void currentTime() {
		LocalTime y = LocalTime.now();
		System.out.println("The current time is: " + y);
	}

	@Test
	public void addCurrentTime() {
		System.out.println();
		LocalTime lt = LocalTime.now();
		LocalTime yt = lt.plusHours(2);
		System.out.println("The current date is: " + lt);
		System.out.println();
		System.out.println("After adding 2 hours to the current date: " + yt);
		System.out.println();
	}

	@Test
	public void sortStringArray() {
		String str[] = { "pqr", "abc", "xyz", "lmn" };
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}
		System.out.println("The sorted array is: ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}

	public int sumOfElement(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	public int sumOfArrayElement(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}

	@Test
	public void findMissingElement() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int n = 9;
		int sumOfNumbers = sumOfElement(n);
		int sumOfElements = sumOfArrayElement(arr);

		int findMissingElement = (sumOfNumbers - sumOfElements);
		System.out.println("The Missing value is: " + findMissingElement);

	}
	@Test
	public void findMissingNumber() {
			
		int a[] = {1,3,5,4,6};
		
		int n = 6;
		
		int sum = (n*(n+1))/2;  //21
		int sum1 =0;           //19 	
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1 + a[i];
		}
		 int missingValue = sum-sum1;
		 
		 System.out.println("The missing value is: "+missingValue);		
		}
	//reverse array without using addition new array
	@Test
	public void reverseArray()
	{
		int arr[] = {10,20,30,40,50,60,70};
		int k=0;
		for(int i=arr.length/2;i>=0;i--)
		{
			k=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i] = k;
		}
		System.out.println("The reverse array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	@Test
	public void reverseArray1()
	{
		reverseIntegerArray(new int[] {10,20,30,40});
		System.out.println("===================================");
		reverseIntegerArray(new int[] {10,20,30,40,50,60,70,80,90,100});
		
	}
	public void reverseIntegerArray(int arr[])
	{
	   System.out.println("Before the reverse array:"+ Arrays.toString(arr));
	   int temp;
	   for(int i=arr.length/2;i>=0;i--)
	   {
		   temp=arr[i];
		   arr[i]=arr[arr.length-1-i];
		   arr[arr.length-1-i]=temp;
	   }
	   System.out.println("After the reverse array: "+Arrays.toString(arr));
	}
	
	@Test
	public void evenOdd()
	{
		
		
	for(int i=1;i<=100;i++)
	{
		int addEven=0;
		int addodd=0;
		if(i%2==0)
		{
			addodd = addodd + i;
		}
	
		else if(i%2!=0)
		{
			addEven = addEven + i;
		}
	 
	System.out.println("The even numbers are: "+addEven+", ");
	System.out.println(" The Odd numbers are: "+addodd);
	
	}
  }	
	/**
	 * 
	 */
	@Test
	public void testMap()
	{
		Map map =new HashMap();
		
		map.put(01, "Jack");
		map.put(05, "Shonn");
		map.put(04, "smith");
		map.put(02, "robert");
		
		Set set = map.entrySet();    //Converting the entry set so that we can traverse. 
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			//Converting to Map.Entry to get keys and values sepretaly.
			Map.Entry entry = (Map.Entry) itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	@Test
	public void MapTestWithoutGeneric()
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(100, "Smith");
		map.put(103, "Mark");
		map.put(102, "Jamesh");
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	@Test
	public void ArrayListDemo()
	{
		
		ArrayList arr = new ArrayList();
		
		arr.add("Jack");
		arr.add("Smith");
		arr.add(101);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
	@Test
	public void mapDemo()
	{
		Map<Integer,String> map = new HashMap();
		map.put(100,"James");
		map.put(101, "map1");
		map.put(102, "map2");
		map.put(103, "map3");
		map.put(104, "map4");
		
		System.out.println("The HashMap Key value pair is as follows: ");
		for(Map.Entry  entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
 	 	
	}
	@Test
	public void mapDemoSorting()
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Sunday");
		map.put(101, "Monday");
		map.put(1001, "Tuesday");
		map.put(10001, "Wednsday");
		map.put(100001, "Thursday");
		map.put(1000001, "Friday");
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
}

























































