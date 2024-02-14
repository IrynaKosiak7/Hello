package org.example.example_13_02_new;

import java.util.Arrays;
import java.util.Random;

public class Lotery {
    public int[] getWinNumber() {
        int[] winNumbers = new int[5];
        for (int i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = getRandomNumber();
            for (int j = 0; j < i; j++) {
                if (winNumbers[i] == winNumbers[j]) {
                    i--;
                }
            }
        }
        return winNumbers;
    }

    private int getRandomNumber() {
        Random random = new Random();
        int num = random.nextInt(5) + 1;
        return num;
    }

    public boolean isWinner(int[] arr, int[] arr2) {
//        Arrays.sort(arr);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr,arr2);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    break;
                }
                if (j == arr2.length - 1) {
                    return false;
                }
            }

        }
        return true;
    }
}