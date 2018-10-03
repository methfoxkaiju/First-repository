package method;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] mas = new int[10]; //создаем пустой массив из 10 элементов

        fillArray(mas);//заполнить массив
        printArray(mas);//вывести массив в консоль
        sortArray(mas);//отсортировать массив
        printArray(mas);//вывести массив в консоль
    }

    public static void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);//scanner для ввода с консоли
        for (int i = 0; i < array.length; i++) {
            System.out.print("введите " + i + "-й элемент массива : ");
            array[i] = scanner.nextInt();//считываем с консоли значения для массива
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);//выводим значение элемента
            if (i != array.length - 1) {//если индекс текущего элемента не равен индексу последнего
                System.out.print(" | ");//выводим " | " в консоль
            }
        }
        System.out.println();//так как при выводе мы не использовали println, то переходим на новую строку
    }

    public static void sortArray(int[] array) {
        //сортировка пузырьком, по возрастанию
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {//если элемент больше следующего, меняем их местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
