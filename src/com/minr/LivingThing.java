package com.minr;

public abstract class LivingThing {
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    };

    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    };

    public void eat(String nama) {
        System.out.println(nama + " Makan");
    };
}
