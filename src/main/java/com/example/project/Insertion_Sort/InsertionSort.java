package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            int j = i;
            while (j > 0 && elements[j] < elements[j - 1]) {
                count++;
                int temp = elements[j];
                elements[j] = elements[j - 1];
                elements[j - 1] = temp;
                j--;
            }
        }
        System.out.println(count);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                count++;
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            int j = i;
            while (j > 0 && words.get(j).compareTo(words.get(j - 1)) < 0) {
                String temp = words.set(j, words.get(j - 1));
                words.set(j - 1, temp);
                j--;
            }
        }
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            int minIndex = i;
            for (int j = i; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            String word = words.set(i, words.get(minIndex));
            words.set(minIndex, word);
        }
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

    public static void main(String[] args) {
        int[] arrA = {3};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {3};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}