package com.example.jdk12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FilesMismatch {
    public static void main(String[] args) throws IOException { 
	Path filePath1 = Path.of("./com/example/jdk12/FilesMismatchFile1.txt");
	Path filePath2 = Path.of("./com/example/jdk12/FilesMismatchFile2.txt");

	long mismatchRow = Files.mismatch(filePath1, filePath2);
	if (mismatchRow == -1) {
	    System.out.println("file is same");
	} else {
	    System.out.println("file is diffarent\nrow:" + String.valueOf(mismatchRow));
	}
    }
}
