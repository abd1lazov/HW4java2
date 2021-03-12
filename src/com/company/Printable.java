package com.company;

public interface Printable<W extends Car> {
    void print(W w);
    W print();
}
