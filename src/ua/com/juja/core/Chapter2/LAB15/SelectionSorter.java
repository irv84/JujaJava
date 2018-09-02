package ua.com.juja.core.Chapter2.LAB15;

//Такая версия алгоритм сортировки вставками
//
//public class InsertionSorter {
//    public static void sort(int[] arr) {
//        for (int k = 1; k < arr.length; k++) {
//            int newElement = arr[k];
//            int location = k - 1;
//            while (location >= 0 && arr[location] > newElement) {
//                arr[location + 1] = arr[location];
//                location--;
//            }
//            arr[location + 1] = newElement;
//        }
//    }
//}
//реализована не оптимально, так как внутренний цикл while
//- ищет позицию для вставки, перебирая последовательно элементы, при этом он
//- поэлементно "смещает" массив.
//
//В целях оптимизации перепишите алгоритм:
//1. Ищите позицию для вставки элемента бинарным поиском (Arrays.binarySearch(...)).
//2. Найдя позицию - смещайте всю часть массива за один вызов (System.arraycopy(...)).
//В моих экспериментах эти две оптимизации ускорили сортировку в 2.2-2.6 раза. Скорость сортировки измерял данным кодом
//
//import java.util.Random;
//
//public class App {
//    public static void main(String[] args) {
//        int[] array = new int[256 * 1024];
//        Random rnd = new Random(0);
//        for (int k = 0; k < array.length; k++) {
//            array[k] = rnd.nextInt();
//        }
//        long t1 = System.nanoTime();
//        InsertionSorter.sort(array);
//        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
//    }
//}

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