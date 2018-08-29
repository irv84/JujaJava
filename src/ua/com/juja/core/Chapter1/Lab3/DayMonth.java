package ua.com.juja.core.Chapter1.Lab3;

//Реализовать функцию, которая по порядковому номеру вернет текстовый вариант месяца на английском языке
//getMonthOfYear(1) = "january"
//getMonthOfYear(2) = "february"
//....
//getMonthOfYear(12) = "december"
//
//Если на вход подается число вне диапазона 1-12 - вернуть пустую строку.
//Для того, чтобы метод вернул значение, воспользуйтесь ключевым словом return . Например, return "september";

public class DayMonth {
    public static void main(String[] args) {


        System.out.println(getMonthOfYear(1));
        System.out.println(getMonthOfYear(2));
        System.out.println(getMonthOfYear(3));
        System.out.println(getMonthOfYear(4));
        System.out.println(getMonthOfYear(5));
        System.out.println(getMonthOfYear(6));
        System.out.println(getMonthOfYear(7));
        System.out.println(getMonthOfYear(8));
        System.out.println(getMonthOfYear(9));
        System.out.println(getMonthOfYear(10));
        System.out.println(getMonthOfYear(11));
        System.out.println(getMonthOfYear(12));
        System.out.println(getMonthOfYear(13));


        getMonthOfYear(1);
        getMonthOfYear(2);
        getMonthOfYear(3);
        getMonthOfYear(4);
        getMonthOfYear(5);
        getMonthOfYear(6);
        getMonthOfYear(7);
        getMonthOfYear(8);
        getMonthOfYear(9);
        getMonthOfYear(10);
        getMonthOfYear(11);
        getMonthOfYear(12);
        getMonthOfYear(13);
    }
        public static String getMonthOfYear(int number) {
            if (number == 1) {
                return "January";
            } if (number == 2) {
                return "February";
            } if (number == 3) {
                return "March";
            } if (number == 4) {
                return "April";
            } if (number == 5) {
                return "May";
            } if (number == 6) {
                return "June";
            } if (number == 7) {
                return "July";
            } if (number == 8) {
                return "August";
            } if (number == 9) {
                return "September";
            } if (number == 10) {
                return "October";
            } if (number == 11) {
                return "November";
            } if (number == 12) {
                return "December";
            } else return "";


        }
}
