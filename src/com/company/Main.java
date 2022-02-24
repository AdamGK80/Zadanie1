package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int los;
        Random rand = new Random();
        do {
            los = rand.nextInt(1000); // granica w losowaniu 0-1000
            System.out.print(los+", ");
        }
        while (los != 50);
        System.out.println();

    }
}

/*
 * Cwiczenia:
 * 1. Zmien gorna granice przedzialu losowania
 */
