package com.ss.examples;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[])
	{
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		n=sc.nextInt();
		int[] list=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
			list[i]=sc.nextInt();
		System.out.println("array elements");
		System.out.println(list);
		search(list,10);
	}
    private static void search(int[] list,int num)
    {
    	int index=0;
    	boolean found=false;
    	for(int i=0;i<list.length;i++)
    	{
    		if(list[i]==num)
    		{
    			found=true;
    			index=i;
    		}
    			
    	}
    	if(found)
    		System.out.println("element found at"+index);
    }
}
