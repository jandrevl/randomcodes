package com.ironhack.challenges1;
import java.util.Arrays;
public class SalvatoreChall20210615 {

    public static void main(String[] args) {
        int[] test1 = {0}; //should return [0]
        int[] test2 = {1, 2, 0, 3, 0, 4, 0}; // should return [1, 2, 3, 4, 0, 0, 0]
        int[] test3 = {1, 2, 3, 4, 5, 6}; //no change here

        System.out.println(Arrays.toString(zeroesEnd(test1)));
        System.out.println(Arrays.toString(zeroesEnd(test2)));
        System.out.println(Arrays.toString(zeroesEnd(test3)));
    }

    public static int[] zeroesEnd (int[] input) {
        for (int i = 0; i < input.length; i++) {
            if ( input[i] == 0) {
                for (int j = i; j < input.length -1; j++) {
                    input[j] = input[j+1];
                }
                input[input.length - 1] = 0;
            }
        }
        return input;
    }
}
