package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.subtracao(20,10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornar20(){
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.multiplicacao(2,10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornar50(){
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.divisao(100,2);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarEhPar(){
        Application application = new Application();
        String expected = "é par";
        String response = application.retornaParOuNao(100);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornaroMaior(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.retornaMaior(10,5);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarNumerosImpares(){
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.retornaQtdNumerosImpares(100);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarLetrasMaiusculas(){
        Application application = new Application();
        String expected = "ADULTO";
        String response = application.retornaMaiusculo("adulto");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarMinusculas(){
        Application application = new Application();
        String expected = "adulto";
        String response = application.retornaMinusculo("ADULTO");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetornarQtdLetras(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.retornaQtdLetras("DB1START");
        Assert.assertEquals(expected,response);
    }
}

