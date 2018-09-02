package ua.com.juja.core.Chapter1.Lab12;

//На вход подается одномерный массив. Необходимо найти диапазон максимальной ширины, элементы которого положительные (больше 0).
//        В качестве ответа должен быть массив из 2х элементов, где:
//        - элемент №0 - индекс элемента левой границы отрезка;
//        - элемент №1 - индекс элемента правой границы отрезка.
//        Если таких отрезков несколько - вернуть самый левый. Если в массиве отсутствует такой отрезок (все числа отрицательны) - вернуть пустой массив.
//        Например:
//        lookFor([1, 1, 1]) = [0, 2]
//        lookFor([0, 1, 1]) = [1, 2]
//        lookFor([1, 1, 0]) = [0, 1]
//        lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
//        lookFor([1, 1, 0, 1, 1]) = [0, 1] // возвращаем левый
//        lookFor([0, -1, 0, -1]) = [] // отсутствуют положительные числа


public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[]arr={};
        int[]tmp={};
        int count=-1;
        for (int i=0;i<array.length;i++) {
            if (array[i] > 0) {
                arr = new int[2];
                arr[0] = i;
                for (int n = i; n < array.length; n++) {
                    if (array[n] > 0) {
                        arr[1] = n;}
                    if (array[n] <= 0 || n == array.length - 1) {
                        if ((n - i) > count) {
                        count = n - 1;
                        tmp = arr;
                            i = n;
                            }break;
                        }
                    }
                }

        }
        return tmp;
    }
    public static void main(String[] args) {
        int[]arr2={0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        int[]result=lookFor(arr2);
        System.out.println(result[0]+""+result[1]);

       }
    }
