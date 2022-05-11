package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class DemoApplicationTests {

	@Test
	void checkFilePath() {
        final File file = new File("src/main/resources/file.txt");
        System.out.println(file.getAbsolutePath());
        Assertions.assertTrue(file.getAbsolutePath().contains("demo"));
    }

}
