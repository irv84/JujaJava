package ua.com.juja.core.Chapter2.LAB14;

//Перед тобой рабочий алгоритм "сортировки пузырьком"
//
//public class BubbleSorter {
//    public static void sort(int[] arr) {
//        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
//            for (int index = 0; index < barrier; index++) {
//                if (arr[index] > arr[index + 1]) {
//                    int tmp = arr[index];
//                    arr[index] = arr[index + 1];
//                    arr[index + 1] = tmp;
//                }
//            }
//        }
//    }
//}
//    Этот алгоритм допускает вариации и оптимизации. В данном случае приведен алгоритм, при котором на каждом проходе "всплывает" самый большой элемент.
//
//        Перепиши алгоритм на такой, при котором самый маленький элемент "тонет".
//
//        Порядок сортировки должен сохраниться - по возрастанию.
//
//        Элементы должны перебираться справа - налево. Всплывал - вправо, тонет - влево.
//
//        Цикл не доходил до правого конца, теперь - не доходит до левого.
//
//        В массиве из 6 элементов должны сравниваться (и в случае инверсии переставляться) пары 4-5 3-4 2-3 1-2 0-1 4-5 3-4 2-3 1-2 4-5 3-4 2-3 4-5 3-4 4-5



import java.lang.reflect.Array;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6,8,12};
        sort2(arr);
for (int x:arr){
    System.out.println(x);
}
    }

    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
    public static void sort2 (int[] arr) {
        for (int barrier = 0; barrier <arr.length-1; barrier++) {
            for (int index = arr.length-1; index > barrier; index--) {
                if (arr[index] < arr[index- 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
}