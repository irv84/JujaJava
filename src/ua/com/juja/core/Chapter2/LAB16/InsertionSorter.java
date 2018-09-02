package ua.com.juja.core.Chapter2.LAB16;

//Переписать алгоритм сортировки выборками:
//
//public class SelectionSorter {
//    public static void sort(int[] arr) {
//        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
//            for (int index = barrier + 1; index < arr.length; index++) {
//                if (arr[barrier] > arr[index]) {
//                    int tmp = arr[index];
//                    arr[index] = arr[barrier];
//                    arr[barrier] = tmp;
//                }
//            }
//        }
//    }
//}
//
//1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. Найти наименьший элемент во всем массиве - и обменять с ним.
//        2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier]. Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
//        В моих экспериментах:
//
//        пункт #1 ускорил сортировку в 2 раза.
//
//        пункт #2 ускорил сортировку еще на 10%-20%.

import java.util.Arrays;
import java.util.Random;

//Переписать алгоритм сортировки выборками:
//
//public class SelectionSorter {
//    public static void sort(int[] arr) {
//        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
//            for (int index = barrier + 1; index < arr.length; index++) {
//                if (arr[barrier] > arr[index]) {
//                    int tmp = arr[index];
//                    arr[index] = arr[barrier];
//                    arr[barrier] = tmp;
//                }
//            }
//        }
//    }
//}
//
//1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. Найти наименьший элемент во всем массиве - и обменять с ним.
//        2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier]. Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
//        В моих экспериментах:
//
//        пункт #1 ускорил сортировку в 2 раза.
//
//        пункт #2 ускорил сортировку еще на 10%-20%.

import java.util.Arrays;
import java.util.Random;

public class InsertionSorter {
    public static void main(String[] args) {
        Random rnd = new Random(0);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        {
            for (int i = 1; i < arr.length; i++)
            {
                int x = arr[i];

                // Find location to insert using binary search
                int j = Math.abs(java.util.Arrays.binarySearch(arr, 0, i, x) + 1);

                //Shifting array to one location right
                System.arraycopy(arr, j, arr, j+1, i-j);

                //Placing element at its correct location
                arr[j] = x;
            }
        }}}