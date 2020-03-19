package com.gustavo;
import java.util.Scanner;

public class Exercicios {
    private Scanner entrada = new Scanner(System.in);
    private String palavra;

    public Exercicios(){
        palavra = entrada.nextLine().toLowerCase();
        exercicioA();
        exercicioB();
        exercicioC();
        exercicioD();
        exercicioE();
        exercicioF();
        exercicioG();
    }

    public void exercicioA(){
        System.out.println("Numero de caracteres: " + palavra.length());
    }

    public void exercicioB(){
        System.out.println("Todas as letras em maíusculo: " + palavra.toUpperCase());
    }

    public void exercicioC(){
        int vogais = 0;
        for (int i = 0; i < palavra.length(); i++){
            char l = palavra.charAt(i);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                vogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + vogais);
    }

    public void exercicioD(){
        if (palavra.startsWith("utf")){
            System.out.println("Palavra começa com 'UTF'");
        }
        System.out.println(palavra);
    }

    public void exercicioE(){
        if (palavra.endsWith("pr")){
            System.out.println("Palavra termina com PR");
        }
    }

    public void exercicioF(){
        System.out.println("Todas as letras em minúsculo: " + palavra);
    }

    public void exercicioG(){
        String palavraInvertida = "";
        for (int i = palavra.length(); i > 0; i--){
            String letra = String.valueOf(palavra.charAt(i-1));
            palavraInvertida = palavraInvertida.concat(letra);
        }
        if (palavraInvertida.equals(palavra))
            System.out.println("A palavra é um paralíndromo");
    }
}
