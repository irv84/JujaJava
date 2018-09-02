package ua.com.juja.core.Chapter1.Lab9;

//Отфильтровать массив так, чтобы оставить только четные элементы. Для проверки четности можно использовать операцию "остаток от деления" - %
//        3 % 2 == 1;
//        6 % 2 == 0;
//        Исходящий массив, для простоты, должен быть того же размера, что и входящий. Например, для {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}


public class ArrayFilter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        int[]arr=filterEven(array);
        for (int i:arr){
            System.out.print(i);
        }
    }

    public static int [] filterEven(int [] nums) {
        int[] arr = new int[nums.length];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[count] = nums[i];
                count++;
            }

        }
        return arr;
    }

        }








