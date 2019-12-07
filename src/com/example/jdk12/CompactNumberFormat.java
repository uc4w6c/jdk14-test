package com.example.jdk12;

import java.text.NumberFormat;

class CompactNumberFormat {
    public static void main(String[] args) {
	NumberFormat cnf = NumberFormat.getCompactNumberInstance();
	System.out.println(cnf.format(10000));
	System.out.println(cnf.format(10000_0000));
	System.out.println(cnf.format(10000_0000_0000L));
	System.out.println(cnf.format(10000_0000_0000_0000L));
    }
}
