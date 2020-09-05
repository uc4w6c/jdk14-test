package com.example.jdk14;

class SealedTypesTest {
    public static void main(String[] args) {
		HondaCar hondaCar = new Shuttle();
		String carName = switch(hondaCar) {
			case Shuttle s -> s.className();
			case Vezel v -> v.className();
		};
		System.out.println(carName);
    }
}

sealed interface HondaCar permits Shuttle, Vezel {}
record Shuttle() implements HondaCar {}
record Vezel() implements HondaCar {}
