package org.example.Question2;

import java.util.*;

public class TreeSett{
    public static void main(String[] args) {
        Random random = new Random();

        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            char c1 = (char) (random.nextInt(26) + 'a');
            char c2 = (char) (random.nextInt(26) + 'a');
            set1.add(c1);
            set2.add(c2);
        }

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
    }
    }