package com.example.jdk12;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class InputStreamSkipNBytes {
    public static void main(String[] args) throws IOException { 
	Consumer<ByteArrayInputStream> bytePrint = (bytes) -> {
	    String s = Stream.generate(bytes::read).limit(bytes.available())
			.filter(b->0x20 <= b && b <= 0x7f)
			.map(i->String.valueOf((char)i.intValue()))
			.collect(Collectors.joining());
	    System.out.println(s);
	};
	ByteArrayInputStream input = new ByteArrayInputStream("LOVEPHANTOM".getBytes());
	System.out.println(String.valueOf(input.skip(2)) + " skip");
	// System.out.println(bytePrint.accept(input));
	bytePrint.accept(input);
	input.reset();
	input.skipNBytes(3);
	// System.out.println(input);
	bytePrint.accept(input);
    }
}
