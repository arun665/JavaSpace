package Basics;
// Write a program to reverse a String.
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,l;
		System.out.println("Enter a Number or String to be reversed: ");
		String n = sc.nextLine();
		l = n.length();
		char a[] = new char [l];
		for(i=0;i<l;i++)
		{
			a[i] = n.charAt(i);
		}
		
		i=0;
		int j=a.length-1;
		while(i<j){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
		i++;
		j--;}
		// now the list is sctually reversed in small time complexity.
		
		
		for(i=0;i<l;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		sc.close();
	}
}
