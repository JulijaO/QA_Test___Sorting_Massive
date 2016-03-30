package com.company;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //запрашиваем у пользователя размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int size = scanner.nextInt();

        //создаем массив
        int [] massive = new int[size];
        Array arr= new Array();
        //инициализируем массив рандомными числами, в пределе значений массива
        arr.initRandom(massive);
        arr.printMass(massive);
        //  сортируем массив при с помощью метода "Пузырек =)"
        arr.sortBubble(massive);
        System.out.println("Выводим сортированный массив методом пузырька =)");
        arr.printMass(massive);

        arr.initRandom(massive);
        arr.printMass(massive);


          //сортируем массив при с помощью метода "Пузырек =)" и компоратора

        arr.sortBubble(massive, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a%2==0 && b%2==0){
                    return b-a;
                }
                if(a%2!=0 && b%2!=0){

                    return a-b;
                }

                if(a%2==0){
                    return 1;
                }

                return -1;

            }
        });
        arr.printMass(massive);
// выводим сортированный массив при помощи пузырька и компоратора, в виде четные идут в прядке убывания, а нечетные в порядке возрастання
        System.out.println("Выводим сортированный массив методом пузырька =)");
        arr.printMass(massive);



        arr.initRandom(massive);
        arr.printMass(massive);
        System.out.println("Выводим сортированный массив методом вставки =)");
        //  сортируем массив при с помощью метода "вставки"
        arr.sortInserts(massive);
        arr.printMass(massive);

    }
}
