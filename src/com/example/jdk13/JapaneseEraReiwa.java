package com.example.jdk13;

import java.time.chrono.JapaneseEra;

class JapaneseEraReiwa {
    public static void main(String[] args) {
	System.out.println(JapaneseEra.of(3));
	System.out.println(JapaneseEra.valueOf("Reiwa"));
    }
}
