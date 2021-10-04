package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int [] numbersBubble = new int [8];

        numbersBubble[0] = 7;
        numbersBubble[1] = 188;
        numbersBubble[2] = 19;
        numbersBubble[3] = 12;
        numbersBubble[4] = -32;
        numbersBubble[5] = -12;
        numbersBubble[6] = 98;
        numbersBubble[7] = 87;

        int [] numbersSelection = new int [8];

        numbersSelection[0] = 14;
        numbersSelection[1] = 500;
        numbersSelection[2] = 434;
        numbersSelection[3] = -38;
        numbersSelection[4] = -17;
        numbersSelection[5] = 12;
        numbersSelection[6] = 18;
        numbersSelection[7] = 201;

        System.out.println("Bubble Sort:");
        bubbleSort(numbersBubble);
        printArray(numbersBubble);

        System.out.println("\n\nSelection Sort:");
        selectionSort(numbersSelection);
        printArray(numbersSelection);

    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private  static void selectionSort(int arr[])
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int lowestIndex = 0;

            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[lowestIndex])
                {
                    lowestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[lowestIndex];
            arr[lowestIndex] = temp;
        }

    }

    private static void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
