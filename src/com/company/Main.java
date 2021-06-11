package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> arrayA = new ArrayList<>();
        ArrayList<String> arrayB = new ArrayList<>();
        ArrayList<String> arrayC = new ArrayList<>();

        System.out.println("введите 5 слов");
        addList(arrayA);

        Iterator<String> iteratorA = arrayA.iterator();
        System.out.println("_______________________");

        System.out.println("Iterator A");
        print(iteratorA);

        System.out.println("введите 5 слов");
        addList(arrayB);

        Iterator<String> iteratorB = arrayB.iterator();
        System.out.println("________________________");

        System.out.println("Iterator B");
        print(iteratorB);

       int number = 0;
       int number1 = 4;
        System.out.println("__________________");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                arrayC.add(i, arrayA.get(number));
                number++;
            }else {
                arrayC.add(i, arrayB.get(number1));
                number1--;
            }
        }

        Iterator<String> iteratorC = arrayC.iterator();
        System.out.println("Iterator C");
        print(iteratorC);

    }

    public static void addList(ArrayList<String> list){
        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
    }

    public static void print(Iterator<String> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
