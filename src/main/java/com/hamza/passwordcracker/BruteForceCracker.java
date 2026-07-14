package com.hamza.passwordcracker;

public class BruteForceCracker {

    private static String targetHash;
    private static int maxLength;
    private static char[] charset;

    private static String foundPassword;
    private static long attempts;

    public static CrackResult crack(String hash, int maxLen, char[] chars) {

        targetHash = hash;
        maxLength = maxLen;
        charset = chars;

        foundPassword = null;
        attempts = 0;

        long startTime = System.nanoTime();

        generate("");

        long elapsed = System.nanoTime() - startTime;
        return new CrackResult(foundPassword, attempts, elapsed, "Brute Force");
    }

    private static void generate(String current) {

        if (foundPassword != null)
            return;

        if (current.length() > maxLength)
            return;

        if (!current.isEmpty()) {
            attempts++;

            if (HashUtil.sha256(current).equals(targetHash)) {
                foundPassword = current;
                return;
            }
        }

        for (char c : charset) {
            generate(current + c);
        }
    }
}