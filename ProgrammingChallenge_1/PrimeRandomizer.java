package com.challenge;

public class Prime {

	public boolean isPrimeNumber(int number){
		for(int i=2; i<=number/2;i++){
			if(number %i ==0){
				return false;
			}
			}
		return true;
	}
	public static void main(String args[]){
		Randomizer r=new Randomizer();
		int n = r.getRandom(0, 100);
		Prime p = new Prime();
		boolean b = p.isPrimeNumber(n);
		String s =new String();
		s= b ? "Prime" : "not Prime";
		r.printResult(n, s);
	}

}
