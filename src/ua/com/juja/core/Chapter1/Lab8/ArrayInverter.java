package ua.com.juja.core.Chapter1.Lab8;

//В коде инвертирования массива
//
//public class ArrayInverter {
//    public static void invert(int[] arr) {
//        for (int k = 0; k < arr.length / 2; k++) {
//            int tmp = arr[k];
//            arr[k] = arr[arr.length - k - 1];
//            arr[arr.length - k - 1] = tmp;
//        }
//    }
//}
//    необходимо переписать цикл с инкремента счетчика от 0 до середины массива на цикл от середины массива до 0 (инкремент (k++) заменить на декремент (k--)).


public class ArrayInverter {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        for (int i:array){
            System.out.print(i);
        }
        System.out.println();
        invert2(array);
        for (int i:array){
            System.out.print(i);
        }
    }


    public static void invert2(int[] arr) {
        for (int k = (arr.length/2)-1; k >=0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k-1];
            arr[arr.length - k-1] = tmp;
        }
    }
}

