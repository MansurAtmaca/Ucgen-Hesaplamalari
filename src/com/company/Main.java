package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Hipotenüs Bulma

        System.out.println("*****Hipotenüs Hesabı*****");
        Scanner input=new Scanner(System.in);
        System.out.print("1. dik kenar uzunluğu giriniz: ");
        int kenar1=input.nextInt();
        System.out.print("2. dik kenar uzunluğu giriniz: ");
        int kenar2=input.nextInt();
        double hipotenüs=Math.sqrt(((Math.pow(kenar1,2))+(Math.pow(kenar2,2))));
        System.out.println("Üçgenin hipotenüsü: "+hipotenüs);

        /*Üçgen Alan Hesabı
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢= (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        System.out.print("1.kenar uzunluğu giriniz: ");
        int a=input.nextInt();
        System.out.print("2.kenar uzunluğu giriniz: ");
        int b=input.nextInt();
        System.out.print("3.kenar uzunluğu giriniz: ");
        int c=input.nextInt();
        double u=(a+b+c)/2;
        double alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("Üçgenin Alanı: "+alan);
    }
}
