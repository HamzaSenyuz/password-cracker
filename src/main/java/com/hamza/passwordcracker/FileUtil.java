package com.hamza.passwordcracker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {

    public static List<String> readLines(String fileName) {

        try {

            return Files.readAllLines(Path.of(fileName));

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}