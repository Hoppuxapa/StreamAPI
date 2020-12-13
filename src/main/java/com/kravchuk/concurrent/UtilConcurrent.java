package com.kravchuk.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class UtilConcurrent {
    AtomicInteger atomicInteger = new AtomicInteger();

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }



}
