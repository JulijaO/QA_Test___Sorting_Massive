package com.company;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ulia2612 on 30.03.16.
 */
public class Array {

// инициализация массива рандомными числами
    public void initRandom(int[] mas ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите предел значений массива");
        int max = scanner.nextInt();

        Random rnd=new Random();

        for( int i=0; i<mas.length; ++i){
            mas[i]=rnd.nextInt(max);
        }
    }
// выводим массив в консоль, (в виде: [индекс] = значение)
    public void printMass(int[] mas){
        for(int i=0; i<mas.length; ++i){
            System.out.printf("[%d]=%d; ", i, mas[i]);
        }
        System.out.println();
    }

// находим индекс элемента, которое содержит максимальное значение
    public int getMaxIndex(int[] arr, int lim){

        int maxI=0;

        for(int i=0; i<lim; ++i){
            if(arr[maxI]<arr[i]){
                maxI=i;
            }
        }
        return maxI;
    }
// переставляет значения местами
    public   void swap(int[] arr, int ai, int bi){

        int tmp=arr[ai];
        arr[ai]=arr[bi];
        arr[bi]=tmp;
    }



// метод сортировки вставки
    public void sortInserts(int[] arr){

        for(int i=arr.length; i>0; --i){

            int maxIndex=getMaxIndex(arr, i);

            if(i-1!=maxIndex){
                swap(arr, i-1, maxIndex);
            }
        }
    }
// метод пузырька
    public void sortBubble(int[] arr) {
        int size=arr.length;

        while(--size > 0){

            boolean flag=true;

            for(int i=0; i<size; ++i){
                if(arr[i]>arr[i+1]){
                    int tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    flag=false;
                }
            }

            if(flag){
                break;
            }
        }
    }


// моя любимая сортировка, вместе с корпоратором    ;)
    public void sortBubble(int[] arr, Comparator<Integer> comparator) {
        int size=arr.length;

        while(--size > 0){

            boolean flag=true;

            for(int i=0; i<size; ++i){
                if(comparator.compare(arr[i],arr[i+1])>0){
                    int tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    flag=false;
                }
            }

            if(flag){
                break;
            }
        }
    }
}
