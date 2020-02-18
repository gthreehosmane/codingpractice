package com.solutions;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = true;
		int[] sequence = {3, 6, 5, 8, 10, 20, 15};
		result = almostIncreasingSequence(sequence);
		System.out.println(result);
	}
	static boolean almostIncreasingSequence(int[] sequence) {
		  boolean result = true;
		  
		  for(int i=0; i< sequence.length-2; i++){
		    if(sequence[i]<sequence[i+1]){
		        if(sequence[i]<sequence[i+2])
		          continue;
		        else
		          result = false;
		    }  
		    else{
		      if(sequence[i+1]<sequence[i+2])
		        continue;
		      else
		        result = false;
		    }
		       
		  }
		  
		  return result;
		}

}
