package com.company;


public class Search {

    public static int linearSearch(int[] arr, int num){
        for(int i=0; i< arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }
        //return -1 if the int is not found in arr
        return -1;
    }

    public static int binarySearch(int[] arr, int num){

        // YOUR CODE HERE
        return -1; // COMMENT THIS OUT, WHEN YOU'RE READY TO RETURN
    }

}
