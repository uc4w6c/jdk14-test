package com.example;

class SwitchExpressions {
    public static void main(String[] args) {
	String s = "OCEAN";
	String releaseYear = switch(s) {
	    case "ultra soul" -> "2001";
	    case "OCEAN" -> "2005";
            default -> "";
	};
	System.out.println(releaseYear);
    }
}
