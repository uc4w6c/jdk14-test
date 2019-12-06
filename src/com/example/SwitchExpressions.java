package com.example;

class SwitchExpressions {
    public static void main(String[] args) {
	// String s = "OCEAN";
	String s = "ARIGATO";
	String releaseYear = switch(s) {
	    case "ultra soul" -> "2001";
	    case "BANZAI", "ARIGATO" -> "2004";
	    case "OCEAN" -> "2005";
            default -> "";
	};
	System.out.println(releaseYear);
    }
}
