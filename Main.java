package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String start(String[] words) {
        System.out.println("Игра Угадай Слово");
        System.out.println("Загадано одно слово из следующих :");
        System.out.println(Arrays.toString(words));
        return words[(int) (Math.random() * words.length)];
    }

    private static String game(String game_word) {
        System.out.println();
        System.out.println("Введите свой вариант");
        Scanner sc = new Scanner(System.in);
        String gamer_word = sc.nextLine();
        return (gamer_word.equals(game_word)) ? "Поздравляю Вы Угадали" : hintmaker(game_word, gamer_word);
    }

    private static String hintmaker(String game_word, String gamer_word) {
        char[] hint = new char[15];
        for (int i = 0; i < 15; i++) {

            try {
                hint[i] = (gamer_word.charAt(i) == game_word.charAt(i)) ? game_word.charAt(i) : '#';
            } catch (StringIndexOutOfBoundsException e) {
                hint[i] = '#';
            }
        }
            for (int j = 0; j < 15; j++) {
                System.out.print(hint[j]);
            }

       return game(game_word);

    }
        public static void main (String[]args){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                    "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                    "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                    "pepper", "pineapple", "pumpkin", "potato"};


            System.out.println(game(start(words)));


        }


    }