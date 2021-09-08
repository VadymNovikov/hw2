package homework2;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        //Start Program
        Scanner input = new Scanner(System.in);
        System.out.println("Введите общее колличество чисел, среди которых будем искать среднее арифметическое ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Теперь введите числа:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //Finding Average of Numbers
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            average = sum / array.length;
        }
        System.out.println("Среднее арифметическое введённых чисел = " + average);
    }
}