package no.hvl.dat100.tabeller.Oppgave4;

import java.util.Scanner;

public class oppgave4a {

    public static void main(String[] args){
        System.out.println("Hei ");
        System.out.printf("hei %d går det bra%s ", 5, "sara");
        System.out.printf("%f5.:", Math.PI);

        int tall = 0;

        Scanner tastatur = new Scanner(System.in);

        do {
            tall = tastatur.nextInt();

        } while (tall != 0);

        tall = 5;

        while (tall != 0){
            System.out.print("tall ");
            tall = tastatur.nextInt();
        }

    }
}
