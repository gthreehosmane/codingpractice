package com.solutions;

public class Newroad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean result = false;
		boolean[][] roadRegister = {{false, true,  false},
                {false, false, false},
                {true,  false, false}};
;
		result = newRoadSystem(roadRegister);
		System.out.println(result);
	}
	static boolean newRoadSystem(boolean[][] roadRegister) {
		boolean result = true;
		int[] incoming = new int[roadRegister.length];
		int[] outgoing = new int[roadRegister.length];
		for(int i=0;i<roadRegister.length;i++){
			for(int j=0;j<roadRegister[i].length;j++){
				if(roadRegister[i][j] == true)
				{
					incoming[j]++;
					outgoing[i]++;
				}
			}
		}
		for(int i=0;i<incoming.length;i++){
			if(incoming[i]!=outgoing[i])
				result = false;
		}
		return result;
	}
}
