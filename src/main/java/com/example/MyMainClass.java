// TODO agorozhanko 12.06.2021: какая должна быть первоначальная структура проекта?

// TODO agorozhanko 12.06.2021: нужно логически вынести в классы и пакеты утилитные методы, бизнес логику, так чтобы
//  формировались слои проекта

// TODO agorozhanko 12.06.2021: все задачи нужно вынести в методы
// TODO agorozhanko 12.06.2021: методы должны быть универсальными

// TODO agorozhanko 12.06.2021: все задачи нужно выполнять в одном классе (одном мэйн методе)

// TODO agorozhanko 12.06.2021: программа должна быть отказоустойчивой, нужно предусматривать в коде критические
//  ситуации, которые могут привести к поломкам программы

// TODO: Viktar Gavrilenko 15.06.2021: Отредактировал проект согласно вышесказанному

package com.example;

import com.example.array.ArrayTask;
import com.example.string.StringTask;

import java.util.Arrays;

public class MyMainClass {
    public static void main(String[] args) {
        String stringIn = "Object-oriented programming is a programming language" +
                " model organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla.";

        String entryMax = "object-oriented programming";
        String entryMin = "OOP";
        // TODO agorozhanko 12.06.2021: вместо oneArray и twoArray правильнее будет firstArray и secondArray,
        //  но в любом случае такие названия не передают сути переменных
        // TODO: Viktar Gavrilenko 14.06.2021: переименовал переменные в firstArrayToCompare и secondArrayToCompare
        int[] firstArrayToCompare = new int[5];
        int[] secondArrayToCompare = new int[5];
        int[][] TwoDimensionalArray = {{5, 8, 88, 3, 42, 10, 10, 6},
                {1, 53, 2, 3, 77, 10, 2, 54},
                {4, 3, 91, 3, 12, 10, 4, 12},
                {6, 3, 11, 3, 22, 10, 5, 60},
                {2, 4, 32, 71, 4, 40, 48, 9}};

        StringTask myString = new StringTask();
        ArrayTask myArray = new ArrayTask();

        System.out.println(myString.putWordsReverseInString("one Two three")); // Строка с обратным порядком слов
        System.out.println(myString.replaceEverySecondEntryString(stringIn, entryMax, entryMin)); // Заменить каждое
        // второе вхождение строки
        System.out.println(myString.minNumberDistinctChar("  fffff ab f 1234 jkjk ")); // Слово с минимальным числом
        // символов
        firstArrayToCompare = myArray.addValueInArray(firstArrayToCompare);     // Заполняем массивы случайными
        secondArrayToCompare = myArray.addValueInArray(secondArrayToCompare);   // числами от 0 до 5
        System.out.println(Arrays.toString(firstArrayToCompare));   // Выводим первый массив
        System.out.println(Arrays.toString(secondArrayToCompare));  // Выводим второй массив
        myArray.compareAverageArrays(firstArrayToCompare, secondArrayToCompare);    // Сравниваем среднее арифметическое
        // двух массивов
        System.out.println(Arrays.toString(myArray.reverseArray(secondArrayToCompare))); // Меняем элементы массива в
        // обратном порядке
        myArray.printTwoDimensionalArray(TwoDimensionalArray); // Выводим двумерный массив
        myArray.printTwoDimensionalArray(myArray.searchMinMaxValueTwoArray(TwoDimensionalArray)); // Максимальное
        // и минимальное значение каждой строки двумерного массива
        System.out.println(myString.searchCountWordLatinChar("one Two three раз два три one1 two2 123 ")); // Кол-во
        // слов в предложении содержащих только латинские символы
        myString.searchNumericPalindromes("Если есть хвосты по дз, начните с 1 не сданного задания. 123 " +
                "324 111 4554"); // Ищем в строке числовые палиндромы
    }
}
