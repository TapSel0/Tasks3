package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую задачу хотите посмотреть?");
        switch(in.nextInt()) {
            case 1:
                System.out.println("Задача №1(число решений уравнения):");
                System.out.println("Введите a, b, c:");
                System.out.println(Task1.task1(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case 2:
                System.out.println("Задача №2(нахождение второго zip в строке):");
                System.out.println("Введите строку:");
                System.out.println(Task2.task2(in.next()));
                break;
            case 3:
                System.out.println("Задача №3(идеальные числа):");
                System.out.println("Введите число:");
                System.out.println(Task3.task3(in.nextInt()));
                break;
            case 4:
                System.out.println("Задача №4(Первый и последний символ в строке):");
                System.out.println("Введите строку:");
                System.out.println(Task4.task4(in.next()));
                break;
            case 5:
                System.out.println("Задача №5(16 код):");
                System.out.println("Введите строку:");
                System.out.println(Task5.task5(in.next()));
                break;
            case 6:
                System.out.println("Задача №6(индивидуальные эллементы):");
                System.out.println("Введите длину первого массива:");
                int n = in.nextInt();
                int[] arr1 = new int[n];
                System.out.println("Введите первый массив целых чисел:");
                for(int i = 0; i < arr1.length; i++)
                {
                    arr1[i] = in.nextInt();
                }
                System.out.println("Введите длину второго массива:");
                n = in.nextInt();
                int[] arr2 = new int[n];
                System.out.println("Введите второй массив целых чисел:");
                for(int i = 0; i < arr2.length; i++)
                {
                    arr2[i] = in.nextInt();
                }
                System.out.println(Task6.task6(arr1, arr2));
                break;
            case 7:
                System.out.println("Задача №7(Число Капрекара):");
                System.out.println("Введите число:");
                System.out.println(Task7.task7(in.nextInt()));
                break;
            case 8:
                System.out.println("Задача №8(нули в двоичной строке):");
                System.out.println("Введите строку:");
                System.out.println(Task8.task8(in.next()));
                break;
            case 9:
                System.out.println("Задача №9(простое число):");
                System.out.println("Введите число:");
                System.out.println(Task9.task9(in.nextInt()));
                break;
            case 10:
                System.out.println("Задача №10(прямоугольный треугольник):");
                System.out.println("Введите x, y, z:");
                System.out.println(Task10.task10(in.nextInt(),in.nextInt(),in.nextInt()));
                break;
            default:
                System.out.println("Такой задачи нет.");
        }

    }
}

