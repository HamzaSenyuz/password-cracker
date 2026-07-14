package com.hamza.passwordcracker;

import java.util.List;

public class DictionaryCracker {

    public static CrackResult crack(String targetHash, List<String> dictionary) {

        long attempts = 0;
        long startTime = System.nanoTime();

        for (String word : dictionary) {
            attempts++;

            if (HashUtil.sha256(word).equals(targetHash)) {
                long elapsed = System.nanoTime() - startTime;
                return new CrackResult(word, attempts, elapsed, "Dictionary Attack");
            }
        }

        long elapsed = System.nanoTime() - startTime;
        return new CrackResult(null, attempts, elapsed, "Dictionary Attack");
    }
}