package com.company.Lesson1;


import java.util.Scanner;

public class Sample1 {
    public static void cekAnswer(int pilihan){
        switch (pilihan){
            case 0:
                System.exit(0);
                break;
            case 1:
                SegitigaSikuSiku();
                break;
            case 2:
                SegitigaSikuSikuBalik();
                break;
            default:
                ulang();

        }

    }

    public static void question(){
        pl("--------- APLIKASI GENRATOR BY: @AKYONG --------" );
        pl("MENU: ");
        pl("0. Keluar Aplikasi");
        pl("1. Segitiga siku-siku");
        pl("2. Segitiga siku-siku terbalik");
        p("PILIH: ");

        int jawaban = new Scanner(System.in).nextInt();

        cekAnswer(jawaban);
    }

    public static void ulang(){
        pl("------------------------------------");
        pl("--- PILIHAN YANG DIMASUKAN SALAH ---");
        pl("------------------------------------");
        pl("");
        pl("");
        question();
    }

    public static void p(String teks){
        System.out.print(teks);
    }

    public static void pl(String teks){
        System.out.println(teks);
    }

    public static void SegitigaSikuSiku(){
        pl("------------------------------------");
        p("MASUKAN LEBAR SEGITIGA: ");
        int lebar = new Scanner(System.in).nextInt();

        for(int a = 1; a<= lebar; a++)//a = 3
        {
            for (int b = 1; b <= a; b++){//b = 1; b<= 3
                p("*");
            }
            pl("");
        }

        question();
    }

    public static void SegitigaSikuSikuBalik(){
        pl("------------------------------------");
        p("MASUKAN LEBAR SEGITIGA: ");
        int lebar = new Scanner(System.in).nextInt();


        for (int a = 0; a < lebar; a++){//2

            int x = 0;

            for(int b = x; b <= a; b++)//b= 0, a = 1
            {
                p(" ");
                x = b;//1
            }
            for(int c = lebar; c >= x+1 ; c--){
                p("*");
            }
            pl("");
        }

        question();
    }
}
