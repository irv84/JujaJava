package ua.com.juja.core.Chapter2.Lab22;

//Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null; (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины, есть строки с null вместо одномерных массивов) 2) "проворачивает" массив по часовой стрелке на 90 градусов, т.е [1] -> [1] [[1, 2], [3, 4]] -> [[3, 1], [4, 2]] [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...


public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0) {
            return null;
        } else {

            for (int i = 0; i < arg.length; i++) {
                if (arg[i] == null || arg[i].length == 0 || arg[i].length != arg.length) {
                    return null;
                }
            }

            int[][] newarr = new int[arg[0].length][arg.length];

            for (int i = 0; i < arg.length; i++) {
                for (int j = 0; j < arg[i].length; j++) {
                    newarr[j][arg.length - 1 -i] = arg[i][j];
                }
            }
            return newarr;
        }
    }
}




