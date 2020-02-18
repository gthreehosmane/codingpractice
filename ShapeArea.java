package com.solutions;

public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=6,result=0;
        result = shapeArea(n);
        System.out.println(result);
	}
	static int shapeArea(int n) {
        int result = 0;
        result = 1 + (n*2*(n-1));
		return result;
	}
}
