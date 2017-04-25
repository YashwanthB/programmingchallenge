package com.challenge;
public class Randomizer {
	public  int getRandom(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
		}
	public void printResult(int number, String s ){
		System.out.println("The random Number "+number +"Is "+s);
		}
}
