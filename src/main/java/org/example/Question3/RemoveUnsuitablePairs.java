package org.example.Question3;

import java.util.ArrayList;

public class RemoveUnsuitablePairs {
    public static void removeUnsuitablePairs(ArrayList<Integer> list) {
        int size = list.size();
        if (size % 2 != 0) {
            size--;
//            size--;
        }
        for (int i = 0; i < size; i += 2) {
            int left = list.get(i);
            int right = list.get(i + 1);
            if (left > right) {
                list.remove(i + 1);
                list.remove(i);
                size -= 2;
                i -= 2;
            }
        }
    }


    public static void removeUnsuitablePairss(ArrayList<Integer> list1) {
        int size = list1.size();
        if (size % 2 == 1) {
            list1.remove(size-1);
            size--;
        }

        for (int i = 0; i < size; i += 2) {
            if (list1.get(i) <= list1.get(i+1)) {
                list1.remove(i+1);
                list1.remove(i);
                size -= 2;
                i -= 2;
            }
        }
    }
}

