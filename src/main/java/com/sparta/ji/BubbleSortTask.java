package com.sparta.ji;

public class BubbleSortTask {

    public static void main(String[] args) {
        int[] number = {5, 4, 34, 74, 87, 12};

        System.out.println("Before bubble sort");
        for (int beforeSort : number) {
            System.out.print(beforeSort + " ");
        }

        bubbleSortAnArray(number);
        System.out.println();

        System.out.println("After bubble sort");
        for (int afterSort : number) {
            System.out.print(afterSort + " ");
        }
    }

    public static void bubbleSortAnArray(int[] number) {
        int size = number.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (number[j - 1] > number[j]) {
                    temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                }
            }
        }
    }
}
