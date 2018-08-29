package ua.com.juja.core.Chapter1.Lab4;

//Реализовать функцию, которая по порядковому номеру дня в неделе возвращает его название на английском языке
//getDayOfTheWeek(1) = "Monday"
//getDayOfTheWeek(2) = "Tuesday"
//....
//getMonthOfWeek(7) = "Sunday"
//Если приходит значение вне диапазона 1-7, то возвращать пустую строку.
//Для того, чтобы метод вернул значение - воспользуйтесь ключевым словом return . Например, return "wednesday";
//Регистр не имеет значения


public class DayWeek {
public static void main(String[] args) {


        System.out.println(getDayOfTheWeek(1));
        System.out.println(getDayOfTheWeek(2));
        System.out.println(getDayOfTheWeek(3));
        System.out.println(getDayOfTheWeek(4));
        System.out.println(getDayOfTheWeek(5));
        System.out.println(getDayOfTheWeek(6));
        System.out.println(getDayOfTheWeek(7));
        System.out.println(getDayOfTheWeek(8));




    }
    public static String getDayOfTheWeek(int dayNum){
        if (dayNum == 1) {
            return "Monday";
        }
        if (dayNum == 2) {
            return "Tuesday";
        }
        if (dayNum == 3) {
            return "Wednesday";
        }
        if (dayNum == 4) {
            return "Thursday";
        }
        if (dayNum == 5) {
            return "Friday";
        }
        if (dayNum == 6) {
            return "Saturday";
        }
        if (dayNum == 7) {
            return "Sunday";
        }
        else return "";

    }}
