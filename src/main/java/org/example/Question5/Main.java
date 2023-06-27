package org.example.Question5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(3);

        ArrayList<ArrayList<Integer>> pairs = getSuitablePairs(list);

        System.out.println("Input List: " + list);
        System.out.println("Suitable Pairs: " + pairs);
    }

    public static ArrayList<ArrayList<Integer>> getSuitablePairs(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        int i = 1;
        while (i < list.size()) {
            if (i % 2 == 0 && list.get(i-1) < list.get(i)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(list.get(i-1));
                pair.add(list.get(i));
                pairs.add(pair);
                i++;
            } else {
                i++;
            }
        }
        return pairs;
    }
}