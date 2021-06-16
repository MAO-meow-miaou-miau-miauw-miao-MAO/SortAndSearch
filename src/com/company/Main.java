package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) {

        //test inputs for sorting and searching...
        int[] large = largeBatch();
        int[] small = smallBatch();

        /*
         * Call your sorting and searching Algorithms below...
         *
         *  PASSING: Arrays.toString(<array-that-you-want-see>) TO
         * System.out.println()
         *  >> will print the contents of the int array to the console.
         *
         * */



    }

    public static int[] largeBatch() {
        int[] largeBatch = new int[2000];
        for (int i = 0; i < 2000; i++) {
            largeBatch[i] = (r.nextInt(10000));
        }
        return largeBatch;
    }

    public static int[] smallBatch() {
        int[] smallBatch = new int[20];
        for (int i = 0; i < 20; i++) {
            smallBatch[i] = (r.nextInt(100));
        }
        return smallBatch;
    }



}
