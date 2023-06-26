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

    }
}

