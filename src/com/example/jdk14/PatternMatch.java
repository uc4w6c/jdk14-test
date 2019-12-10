package com.example.jdk14;

class PatternMatch {
    public static void main(String[] args) {
	Object o = "Pattern Match of instanceof";
	if (o instanceof String) {
	    String s = o;
	    System.out.println(s);
	}
    }
}

