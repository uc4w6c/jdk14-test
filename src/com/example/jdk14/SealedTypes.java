package com.example.jdk13;

class SealedTypes {
    public static void main(String[] args) {
	NissanCar nissanCar = new Leaf();
	String nissanName = switch(nissanCar) {
	    case Leaf -> "Leaf";
	    case Juke -> "Juke";
	};
	System.out.println(nissanName);
    }
}

interface NissanCar {}
class Leaf implements NissanCar {
    public String getName() {
	return "Leaf";
    }
}
class Juke implements NissanCar {
    public String getName() {
	return "Juke";
    }
}

