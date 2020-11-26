package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : latihan abstract dan interface
 *
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Ikhlas");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
