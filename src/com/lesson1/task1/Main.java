package com.lesson1.task1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MaxMinAver();
    }

    public static void MaxMinAver(){

        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Введите количество элементов массива");
            int n = in.nextInt();
            if (n<1){
                throw new Exception("Количество элементов должно быть больше 0");
            }
            try{
                System.out.println("Введите диапазон значений элементов (от.. до..)");
                int a = in.nextInt();
                int b = in.nextInt();
                if (a>b){
                    throw new Exception("Диапазон должен следовать правилу (от < до)");
                }
                int mas[] = new int[n];
                int min = b;
                int max = a;
                float aver = 0;
                System.out.println("Получен массив");
                for (int i=0;i< mas.length;i++){
                    mas[i] = a+(int)(Math.round(Math.random()*(b-a)));
                    System.out.print(mas[i]+" ");
                    if (mas[i]>max){
                        max = mas[i];
                    }
                    if (mas[i]<min){
                        min = mas[i];
                    }
                    aver += (float)mas[i]/n;
                }
                System.out.println();
                System.out.printf("Максимальное: %d, минимальное: %d, среднее: %.2f",max,min,aver);
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
