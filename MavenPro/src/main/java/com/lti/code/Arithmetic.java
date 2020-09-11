package com.lti.code;

public class Arithmetic {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else if(a == b){
			return 0;
		}
		else {
			return b;
		}
	}
}
