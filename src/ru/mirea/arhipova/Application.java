// Задания 1-2
package ru.mirea.arhipova;

import java.util.*;

public class Application {

    public static void BinarySearch(int[] numberArray, int numToFind){

        if ((numToFind > numberArray[numberArray.length-1]) || (numToFind < numberArray[0])) {
            System.out.println("Искомого значения в массиве нет");
            return;
        }

        int low = 0;
        int high = numberArray.length;
        int middle;
        int numIteration = 0;

        while(low <= high) {
            numIteration++;
            System.out.println("Номер итерации: "+numIteration);

            middle = (low + high) / 2;

            int num = numberArray[middle];

            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет");
        return;
    }

    public static void main(String[] args){
        int[] numberArray;
        int arrayLength;
        int numToFind;

        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        arrayLength = scan.nextInt();

        numberArray = new int[arrayLength];
        Random random = new Random();

        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);
        }

        System.out.println("Полученный массив: ");
        System.out.println(Arrays.toString(numberArray));

        Arrays.sort(numberArray);
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(numberArray));

        System.out.println("Введите число для поиска: ");
        numToFind = scan.nextInt();

        BinarySearch(numberArray, numToFind);
    }
}

// Задания 3-4
/*
package ru.mirea.arhipova;

import java.util.*;

public class Application {

    public static int BinarySearch(int[] numberArray, int numToFind){

        if ((numToFind > numberArray[numberArray.length-1]) || (numToFind < numberArray[0])) {
            return -1;
        }

        int low = 0;
        int high = numberArray.length;
        int middle;

        while(low <= high) {

            middle = (low + high) / 2;

            int num = numberArray[middle];

            if(num == numToFind){
                return middle;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] firstNumberArray;
        int[] secondNumberArray;
        int[] resultNumberArray;
        int ArrayLength;

        System.out.println("Введите размер массивов: ");
        Scanner scan = new Scanner(System.in);
        ArrayLength = scan.nextInt();

        firstNumberArray = new int[ArrayLength];
        secondNumberArray = new int[ArrayLength];
        resultNumberArray = new int[ArrayLength];

        Random random = new Random();

        for(int i = 0; i < ArrayLength; i++) {
            firstNumberArray[i] = random.nextInt(-100, 100);
            secondNumberArray[i] = random.nextInt(-100, 100);
        }

        System.out.println("Полученный первый массив: ");
        System.out.println(Arrays.toString(firstNumberArray));
        System.out.println("Полученный второй массив: ");
        System.out.println(Arrays.toString(secondNumberArray));

        Arrays.sort(secondNumberArray);
        int iter = 0;
        for(int i = 0; i < ArrayLength; i++) {
            int ans = BinarySearch(secondNumberArray, firstNumberArray[i]);
            if(ans != -1) {
                resultNumberArray[iter] = firstNumberArray[i];
                iter++;
            }
        }

        int[] newResult = Arrays.copyOfRange(resultNumberArray, 0, iter);
        newResult = Arrays.stream(newResult).distinct().toArray();

        if(newResult.length == 0) {
            System.out.println("В массивах нет совпадающих элементов.");
        }
        else {
            System.out.println("Совпадающие элементы массивов: ");
            for(int i = 0; i < newResult.length; i++) {
                System.out.print(newResult[i] + " ");
            }
        }
    }
}
*/

