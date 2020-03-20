package com.gustavo;
public class Main {

    public static void main(String[] args) {
        System.out.println("Digite uma frase");
        String frase = "  o Menino  ";

        System.out.println("A frase é: " + frase);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Usando o método replace: " + frase.replace("o", "a"));
        System.out.println("Serve para substituir um conjunto de caracteres antigo por um novo");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Usando o método toUpperCase: " + frase.toUpperCase());
        System.out.println("Serve para alterarmos todas as letras para maiúsculo");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Usando o método toLowerCase: " + frase.toLowerCase());
        System.out.println("Serve para alterar todas as letras para minúsculo");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Usando o método Trim: " + frase.trim());
        System.out.println("Serve para remover os espaços antes e depois da frase/palavra");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Usando o toCharArray: ");
        for (char l : frase.toCharArray())
            System.out.println("[" + l + "]");
        System.out.println("Serve para transformar uma palavra/frase em um array de 'char'");

    }
}
