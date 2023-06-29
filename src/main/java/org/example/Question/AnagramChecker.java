package org.example.Question;

import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
        if (hasCommonAnagram(word1, word2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Fail");
        }
    }

    public static boolean hasCommonAnagram(String word1, String word2) {
        List<String> anagrams1 = getAllAnagrams(word1);
        List<String> anagrams2 = getAllAnagrams(word2);
        for (String anagram : anagrams1) {
            if (anagrams2.contains(anagram)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllAnagrams(String word) {
        List<String> anagrams = new ArrayList<String>();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        getAllAnagramsHelper(charCount, new char[word.length()], 0, word.length(), anagrams);
        return anagrams;
    }

    public static void getAllAnagramsHelper(HashMap<Character, Integer> charCount,
                                            char[] currentWord, int index, int length, List<String> anagrams) {
        if (index == length) {
            anagrams.add(new String(currentWord));
            return;
        }
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                currentWord[index] = c;
                getAllAnagramsHelper(charCount, currentWord, index + 1, length, anagrams);
                charCount.put(c, count);
            }
        }

    }
}