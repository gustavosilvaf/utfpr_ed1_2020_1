package com.gustavo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        int quantidadeDePalavras;

        System.out.println("Numero de caracteres: " + frase.length());

        quantidadeDePalavras = frase.split(" ").length;
        System.out.println("Quantidade de palavras: " + quantidadeDePalavras);

    }
}
