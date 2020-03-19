package com.gustavo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String iniciais = "";


        nome = nome.replaceAll("e |do |da |dos |das |de |di |du ", "");

        System.out.println(nome);

        iniciais = iniciais.concat(String.valueOf(nome.charAt(0)).toUpperCase());

        for (int i = 0; i < nome.length(); i++){
            if (nome.charAt(i) == ' '){
                iniciais = iniciais.concat(String.valueOf(nome.charAt(i+1)).toUpperCase());
            }
        }

        System.out.println("Inicias: " + iniciais);
    }
}
