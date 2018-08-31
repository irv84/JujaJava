package ua.com.juja.core.Chapter2.LAB15;

import java.util.Arrays;
import java.util.Random;

public class SelectionSorter {
    public static void main(String[] args) {
        Random rnd = new Random(0);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));
        sort2(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }
    public static void sort2(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int n = -1;
            int m=Integer.MAX_VALUE;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (m > arr[index]) {
                    n=index;
                    m=arr[index];
                }
            }
            if (n != -1&&m<arr[barrier]) {
                int tmp = arr[n];
                arr[n] = arr[barrier];
                arr[barrier] = tmp;
            }
        }
    }}
