package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraYConsecutive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =0;
		int[] numbers = {5,4,6};
		result = makeArrayConsecutive2(numbers);
		System.out.println(result);
	}
	static int makeArrayConsecutive2(int[] statues) {
		/*int count = statues.length, largest = 0;
        Arrays.sort(statues);
        ArrayList<Integer> al = new ArrayList<Integer>();
        largest = statues[statues.length-1];
        for(int i : statues)
      	  al.add(i);
        if(statues.length == 1)
      	  count = 0;
        
        else{
	          for(Integer i : al)
	          {
	        	  if(i == largest && al.contains(i-1))
	        	  {
	        		  count--;
	        	  }
	        	  else if(al.contains(i+1))
	        		  count--;
	          }
        }*/
		int low=statues[0], high = statues[0], count = 0;
				for(int i=0; i<statues.length; i++)
				{
					if(statues[i] < low)
						low = statues[i];
					if(statues[i] > high )
						high = statues[i];
				}
				System.out.println(high);
				System.out.println(low);
		count =  ((high-low)+1)-statues.length;
        return count;
	}
}
