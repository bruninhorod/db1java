package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Integer numero1 = 54, numero2= 45;
        String palavra1 = "db1", palavra2 = "START";



        Integer resultadosoma = numero1 + numero2;
        Integer resultadosubtracao = numero1 - numero2;

        palavra1 = palavra1.toUpperCase();
        palavra2 = palavra2.toLowerCase();




        // Resposta questão 1 :

        System.out.println("Questão 1 ----------------------");
        System.out.println("O resultado da soma é: " + resultadosoma);
        System.out.println("O resultado da subtração é: " + resultadosubtracao);

        // Resposta questão 2 :

        System.out.println("Questão 2 ----------------------");
        System.out.println(palavra1);
        System.out.println(palavra2);

        // Resposta questão 3
        System.out.println("Questão 3.1 ----------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        Double variavel1 = scan.nextDouble();

        System.out.println("Digite o segundo : ");
        Double variavel2 = scan.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        Double variavel3 = scan.nextDouble();



        if (variavel1 < variavel2){
            System.out.println("O menor valor é: " + variavel1);
        }else {
            System.out.println("O menor valor é: " + variavel2);
        }


        if (variavel1 < variavel2 && variavel1 < variavel3){
            System.out.println("O menor valor é o: " + variavel1);
        }else if (variavel2 < variavel3 && variavel2 < variavel1) {
            System.out.println("O menor valor é o: " + variavel2);
        }else {
            System.out.println("O menor valor é o" + variavel3);
        }


    }
}
