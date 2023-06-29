package org.example.Question3;

import java.util.ArrayList;
import java.util.Arrays;

import static org.example.Question3.RemoveUnsuitablePairs.removeUnsuitablePairs;
import static org.example.Question3.RemoveUnsuitablePairs.removeUnsuitablePairss;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 4, 3, 6, 5, 8, 5, 5, 2, 9, 7, 3));
        removeUnsuitablePairs(list);
        System.out.println("Inappropriate:" + list);

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 4, 3, 6, 5, 8, 5, 5, 2, 9, 7, 3));
        removeUnsuitablePairss(list1);
        System.out.println("Appropriate:" + list1);
        System.out.println("Appropriate:" + list1);
    }

}

