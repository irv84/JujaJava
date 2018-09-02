package ua.com.juja.core.Chapter1.Lab10;

//Необходимо корректно реализовать слияние отсортированных по возрастанию массивов
//
//public class Merger {
//    // wrong
//    public static int[] merge(int[] fst, int[] snd) {
//        int[] result = new int[fst.length + snd.length];
//        int fstIndex = 0;
//        int sndIndex = 0;
//        while (fstIndex + sndIndex != result.length) {
//            if (fst[fstIndex] < snd[sndIndex]) {
//                result[fstIndex + sndIndex] = fst[fstIndex++];
//            } else {
//                result[fstIndex + sndIndex] = snd[sndIndex++];
//            }
//        }
//        return result;
//    }
//}
//    В данной заготовке метод merge реализован с ошибкой - он корректно сливает, но некорректно обрабатывает ситуацию, когда один из массивов полностью выбран.
//
//        Задача: Исправить ошибку.
//
//        Дополнительные улучшения: Попробуй минимизировать количество операций (сравнение, сумма, присвоение, ...) на один "сливаемый" элемент. Помни, "сравнение" намного дороже арифметических операций.
//
//        Сейчас в коде 6 операций:
//
//        - fstIndex + sndIndex
//        - ... != result.length
//        - fst[fstIndex] < snd[sndIndex]
//        - fstIndex + sndIndex
//        - fstIndex++
//        - result[...] = fst[...]

public class Merger {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[]arrResult=merge(arr1,arr2);
        for (int i:arrResult){
            System.out.print(i);
        }


    }

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;

        while (leftIndex + rightIndex < result.length) {
            if(rightIndex==snd.length || leftIndex != fst.length
                    && fst[leftIndex] < snd[rightIndex]) {
                result[leftIndex + rightIndex] = fst[leftIndex++];
            } else {
                result[leftIndex + rightIndex] = snd[rightIndex++];
            }
        }

   return result;
        }}