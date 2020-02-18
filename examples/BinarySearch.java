package com.ss.examples;

public class BinarySearch{
	public static void main(String args[])
	{
		int num=10;
		int[] list = new int[]{7,12,15,20,24};
		int result = search(list,0,4,25);
		if(result>=0)
			System.out.println("element found at position "+result);
		else
			System.out.println("element not found");
		
	}
	private static int search(int[] list, int low, int high, int num)
	{
		if(high>=low)
		{
			int mid=(low+high)/2;
			if(num==list[mid])
				return mid;
			if(num>list[mid])
				return search(list,mid+1,high,num);
			if(num<list[mid])
				return search(list,low,mid-1,num);
		}
		return -1;
	}
}