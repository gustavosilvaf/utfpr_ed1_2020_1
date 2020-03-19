package com.gustavo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();

        System.out.println(frase.trim().replaceAll("\\s+", " "));

    }
}
