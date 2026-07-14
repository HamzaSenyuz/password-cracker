package com.hamza.passwordcracker;

public class CrackResult {

    private final String password;
    private final long attempts;
    private final long elapsedTimeNanos;
    private final String method;

    public CrackResult(String password,
                       long attempts,
                       long elapsedTimeNanos,
                       String method) {
        this.password = password;
        this.attempts = attempts;
        this.elapsedTimeNanos = elapsedTimeNanos;
        this.method = method;
    }

    public String getPassword() {
        return password;
    }

    public boolean isFound() {
        return password != null;
    }

    public long getAttempts() {
        return attempts;
    }

    public long getElapsedTimeNanos() {
        return elapsedTimeNanos;
    }

    public double getElapsedSeconds() {
        return elapsedTimeNanos / 1_000_000_000.0;
    }

    public double getHashesPerSecond() {
        double seconds = getElapsedSeconds();
        if (seconds == 0) {
            return 0;
        }
        return attempts / seconds;
    }

    public String getMethod() {
        return method;
    }
}