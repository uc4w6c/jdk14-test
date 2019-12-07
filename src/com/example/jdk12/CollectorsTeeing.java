package com.example.jdk12;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

class CollectorsTeeing {
    public static void main(String[] args) {
	Map.Entry<String, Long> map = Stream.of("aaa", "", "bbb", "ccc").
		    filter(Predicate.not(String::isEmpty)).
		    collect(Collectors.teeing(
			Collectors.joining(","),
			Collectors.counting(),
			Map::entry));
	System.out.println(map);
    }
}
