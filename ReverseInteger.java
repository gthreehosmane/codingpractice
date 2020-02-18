package com.solutions;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = -2345,result = 0;
      result = reverseInteger(n);
      System.out.println(result);
	}
	static int reverseInteger(int x) {
       int result = 0,digit=0;
	    while(x!=0){
	    	digit = x%10;
	    	result = result*10 + digit;
	    	x=x/10;
	    }
	    return result;
	}
}
