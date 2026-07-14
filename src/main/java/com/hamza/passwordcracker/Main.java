package com.hamza.passwordcracker;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> dictionary = FileUtil.readLines("dictionary.txt");
        List<String> hashes = FileUtil.readLines("hashes.txt");

        char[] charset = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        for (String hash : hashes) {

            CrackResult result = DictionaryCracker.crack(hash, dictionary);

            if (!result.isFound()) {
                result = BruteForceCracker.crack(hash, 4, charset);
            }

            System.out.println("--------------------------------");
            System.out.println("Hash       : " + hash);
            System.out.println("Password   : " + result.getPassword());
            System.out.println("Method     : " + result.getMethod());
            System.out.println("Attempts   : " + result.getAttempts());
            System.out.printf ("Time       : %.6f s%n", result.getElapsedSeconds());
            System.out.printf ("Hashes/sec : %.2f%n", result.getHashesPerSecond());
            System.out.println("--------------------------------\n");
        }
    }
}