package com.projectkorea.java.step04;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {
    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(amount, o.amount);
    }
}

