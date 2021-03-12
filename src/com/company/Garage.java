package com.company;

public class Garage <W extends Car> implements Printable <W> {
    private W w;

    public Garage(W w) {
        this.w = w;
    }

    public Garage() {

    }

    public W getW() {
        return w;
    }

    public void setW(W w) {
        this.w = w;
    }

    @Override
    public void print(W w) {
        System.out.println("В гараже стоит машина по имени: " + w.getClass().getSimpleName());
    }

    @Override
    public W print() {
        System.out.println("Jaguar:" + 2018 + "года" + w.getClass().getSimpleName());
        return null;
    }
}
