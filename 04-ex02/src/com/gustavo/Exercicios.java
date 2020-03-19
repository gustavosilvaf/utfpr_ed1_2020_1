package com.gustavo;

import java.util.Scanner;


public class Exercicios {

    private Scanner entrada = new Scanner(System.in);
    private String numero;
    private String[] numeros = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};


    public Exercicios() {
        numero = entrada.nextLine();
        executa();
    }

    private void executa() {
        for (int i = 0; i < numero.length(); i++) {
            System.out.printf(converteEmPalavra(numero.charAt(i)) + ", ");

        }
    }

    public String converteEmPalavra(char num) {
        int index = 0;

        switch (num) {
            case '0':
                index = 0;
                break;
            case '1':
                index = 1;
                break;
            case '2':
                index = 2;
                break;
            case '3':
                index = 3;
                break;
            case '4':
                index = 4;
                break;
            case '5':
                index = 5;
                break;
            case '6':
                index = 6;
                break;
            case '7':
                index = 7;
                break;
            case '8':
                index = 8;
                break;
            case '9':
                index = 9;
        }
        return numeros[index];
    }
}
