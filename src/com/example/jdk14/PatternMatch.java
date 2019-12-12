package com.example.jdk14;

class PatternMatch {
    public static void main(String[] args) {
	Object o = "Pattern Match of instanceof";
	// if (o instanceof String s) {
	//     System.out.println(s.length());
	// }
	if (o instanceof String) {
	    String s = (String)o;
	    System.out.println(s.length());
	}
	switch (o) {
	    case Integer i -> System.out.println(i); break;
	    case String s -> System.out.println(s.length()); break;
	}
    }
}

