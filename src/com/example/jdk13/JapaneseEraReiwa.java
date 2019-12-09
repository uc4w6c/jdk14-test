package com.example.jdk13;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

class JapaneseEraReiwa {
    public static void main(String[] args) {
	System.out.println(JapaneseEra.of(3));
	System.out.println(JapaneseEra.valueOf("Reiwa"));

	System.out.println(JapaneseDate.of(JapaneseEra.of(3), 1, 12, 12));
	System.out.println(JapaneseDate.of(JapaneseEra.valueOf("Reiwa"), 1, 12, 12));
    }
}
