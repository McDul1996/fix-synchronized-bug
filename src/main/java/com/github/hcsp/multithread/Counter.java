package com.github.hcsp.multithread;

public class Counter {
    private Integer value = 0;
    private static final Object LOCK = new Object();

    public int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public void addAndGet(int i) {
        synchronized (LOCK) {
            value += i;
        }
    }

    // 减去一个整数i，并返回减之后的结果
    public void minusAndGet(int i) {
        synchronized (LOCK) {
            value -= i;
        }
    }
}
