package org.example.Question4;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> myHashMap = new HashMap<>();

        myHashMap.put("a", 1);
        myHashMap.put("b", 2);
        myHashMap.put("c", 3);

        boolean containsKey = myHashMap.containsKey("a");
        System.out.println("Contains key 'a': " + containsKey);

        boolean isEmpty = myHashMap.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        int value = myHashMap.get("b");
        System.out.println("Value for key 'b': " + value);

        myHashMap.replace("c", 4);

        System.out.print("Values: ");
        for (Integer val : myHashMap.values()) {
            System.out.print(val + " ");


        }
    }
}

