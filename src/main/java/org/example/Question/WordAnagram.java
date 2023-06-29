package org.example.Question;

import java.util.*;

public class WordAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        printAnagrams(word);
    }

    public static void printAnagrams(String word) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        printAnagramsHelper(charCount, new char[word.length()], 0, word.length());
    }

    public static void printAnagramsHelper(HashMap<Character, Integer> charCount,
                                           char[] currentWord, int index, int length) {
        if (index == length) {
            System.out.println(new String(currentWord));
            return;
        }
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                currentWord[index] = c;
                printAnagramsHelper(charCount, currentWord, index + 1, length);
                charCount.put(c, count);
            }
        }

    }
}
