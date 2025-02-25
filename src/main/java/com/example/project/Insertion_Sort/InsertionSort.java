package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int j = i;
            while (j > 0 && elements[j] < elements[j - 1]) {
                int temp = elements[j];
                elements[j] = elements[j - 1];
                elements[j - 1] = temp;
                j--;
            }
        }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
    
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

    public static void selectionSortWordList(ArrayList<String> words) {
    
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


}