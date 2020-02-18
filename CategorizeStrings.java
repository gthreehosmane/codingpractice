package com.solutions;

public class CategorizeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "", exap="goutam";
		result = classifyStrings(exap);
		System.out.println(result);
	}
	static String classifyStrings(String s) {
       String result = "good";
       int vowelcount = 0, conscount = 0;
       int i=0,j=0;
       if(s.length()<=4){
	       while(i<s.length()-2){
	    	   if(checkVowel(s.charAt(i))&&checkVowel(s.charAt(i+1))&&checkVowel(s.charAt(i+2)))
				   result = "bad";
	    	   if(s.contains("?"))
	    		   result = "mixed";
	    	   i++;
	       }
       }
       if(s.length()>=5){
	       while(j<s.length()-4){
	    	   if(checkConsonants(s.charAt(j))&&checkConsonants(s.charAt(j+1))&&checkConsonants(s.charAt(j+2))&&checkConsonants(s.charAt(j+3))&&checkConsonants(s.charAt(j+4)))
				   result = "bad";
	    	   if(s.contains("?"))
	    		   result = "mixed";
	    	   j++;
	       }
       }
       //System.out.println("vowels = "+vowelcount+" conscount = "+conscount);
       return result;
	}
	static boolean checkVowel(char c)
	{
		boolean result = false;
		if(c == 'a' ||
		   c == 'e' ||
		   c == 'e' ||
		   c == 'o' ||
		   c == 'u' )
		result = true;
		return result;
	}
	static boolean checkConsonants(char c)
	{
		boolean result = true;
		if(c == 'a' ||
		   c == 'e' ||
		   c == 'e' ||
		   c == 'o' ||
		   c == 'u' )
		result = false;
		return result;
	}
}
