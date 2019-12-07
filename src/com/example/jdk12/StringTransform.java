package com.example.jdk12;

import java.util.Map;

class StringTransform {
    public static void main(String[] args) {
	var addresses = Map.of("Mike", "Fukuoka", "John", "Tokyo");
	var population = Map.of("Tokyo", 30000000, "Fukuoka", 2000000);
	var name = "Mike";
	System.out.println(name.transform(addresses::get).transform(population::get));
    }
}
