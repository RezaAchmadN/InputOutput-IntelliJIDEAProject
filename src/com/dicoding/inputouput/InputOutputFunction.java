package com.dicoding.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        bufferedreader();
    }
    public static void scanner(){
        //inisialisasi awal
        Scanner scanner = new Scanner(System.in);

        //proses
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukkan angka pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int value2 = scanner.nextInt();
        System.out.println("Hasilnya adalah : "+ (value1+value2));
    }

    public static void bufferedreader(){
        //inisialisasi awal
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        int value1 = 0;
        int value2 = 0;

        //proses
        System.out.println("Program penjumlahan sangat sederhana");
        try{
            System.out.print("Masukkan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }

        //penanganan jika error
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Hasilnya adalah : " +(value1+value2));
    }

}
