package com.db1.db1start;

public class Application {

    public Integer soma(Integer num1, Integer num2) {
        return num1 + num2;

    }

    public Integer subtracao(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiplicacao(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divisao(Integer num1, Integer num2) {
        return num1 / num2;
    }

    public String retornaParOuNao(Integer num1) {
        if (num1 % 2 == 0) {
            return "é par";
        } else {
            return "é impar";
        }
    }

    public Integer retornaMaior(Integer num1, Integer num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public Integer retornaQtdNumerosImpares(Integer qtdimpar) {
        Integer count=0;
        Integer x;
        for (x = 0; x < qtdimpar; x++) {
            if (x % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public String retornaMaiusculo(String palavra){
        return palavra.toUpperCase();

    }

    public String retornaMinusculo(String palavra){
        return palavra.toLowerCase();
    }

    public Integer retornaQtdLetras(String palavra){
        return palavra.length();
    }
}