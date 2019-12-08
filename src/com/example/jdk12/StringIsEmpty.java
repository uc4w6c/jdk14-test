package com.example.jdk12;

import java.util.Optional;

class StringIsEmpty {
    public static void main(String[] args) { 
	String s = "";
	String n = null;
	Optional<String> o = null;
	if (s.isEmpty()) {
	    System.out.println("s is Empty");
	}
	// if (n.isEmpty()) {
	//    System.out.println("n is Empty");
	// }
	if (o.isEmpty()) {
	    System.out.println("n is Empty");
	}
    }
}
