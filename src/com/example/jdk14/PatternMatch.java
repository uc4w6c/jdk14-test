package com.example.jdk14;

class PatternMatch {
    public static void main(String[] args) {
		Object o = "Pattern Match of instanceof";
		// 今まで
		if (o instanceof String s) {
			// 直接oをString型として利用出来ない
			// System.out.println(o.length());

			// 一度String型にキャストしてから利用する必要がある
			String s = (String)o;
			System.out.println(s.length());     // 27
		}

		// これから
		Object o = "Pattern Match of instanceof";
		// instanceofと同時に変数に格納できる
		if (o instanceof String s) {
			System.out.println(s.length());    // 27
		}

		// switchも利用可能になるらしい。(OpenJDK 14 Early-Access Build 25ではまだ)
		// https://cr.openjdk.java.net/~briangoetz/amber/pattern-match.html
		/*
		switch (o) {
			case Integer i -> System.out.println(i);
			case String s -> System.out.println(s.length());
		}
		 */
		switch (o) {
			case Integer i: System.out.println(i); break;
			case String s: System.out.println(s.length()); break;
		}
    }
}

