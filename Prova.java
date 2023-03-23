package Prova;

import java.util.Scanner;
public class Prova {
    Scanner sc = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Informe o primeiro numero?");
        double num1 =sc.nextDouble();
        System.out.println("Informe o segundo numero?");
        double num2 =sc.nextDouble();
        System.out.println("Escolha a operaçao aritmetica (1) Soma, (2) Subtraçao,(3) divisao e (4) multiplicaçao?");
        double opA = sc.nextDouble();
        double ac1 = num1 + num2;
        double ac2 = num1 - num2;
        double ac3 = num1 / num2;
        double ac4 = num1 * num2;
        if (opA == 1)  System.out.println("Resultado é: "+ ac1);
        else if (opA == 2)  System.out.println("Resultado é: "+ ac2);
        else if (opA == 3)  System.out.println("Resultado é: "+ ac3);
        else System.out.println("Resultado é: "+ ac4);}
        public void exercicio2() {
            System.out.println("Informe o numero da matricula do aluno 1 a 400?");
            int matricula = sc.nextInt();
            int Chris = 1;
            int Greg = 2;
            int Caruso = 3;
            int Jerome = 4; 
            System.out.println("Os times são os numeros  Chris(1),Greg(2),Caruso(3) e Jerome(4)!!");
            if (matricula <= 99)  System.out.println("É do time Chris!! : "+ Chris);
            else if (matricula <= 199)  System.out.println("É do time Greg!! : "+ Greg);
            else if (matricula <= 299)  System.out.println("É do time Caruso!! : "+ Caruso);
            else System.out.println("É do time Jerome!!: "+ Jerome);}
            public void exercicio3() {System.out.println("Quantos quilos de morango?");
            double pesoMorangos =sc.nextDouble();
            System.out.println("Quantos quilos de maças?");
            double pesoMacas =sc.nextDouble();
            System.out.println("Quantos quilos de bananas?");
            double pesoBananas =sc.nextDouble();
            double precoMorango = 2.50;
            double precoMacas = 1.80;
            double precoBananas = 1.30;
            double pesoTotal = pesoMorangos+pesoMacas+pesoBananas;
            double precoTotal = (pesoMorangos*precoMorango) + (pesoMacas*precoMacas) +(pesoBananas*precoBananas);
           double desconto = precoTotal*0.1;
           double preçoDesconto = precoTotal - desconto;
            if (pesoMorangos+pesoMacas+pesoBananas >=8 ) System.out.println("O preço total é R$"+preçoDesconto);
          else if (pesoTotal <8 ) System.out.println("O preço total é R$ "+precoTotal);
          else if (precoMorango+precoMacas+precoBananas >=25 ) System.out.println("O preço total é "+preçoDesconto);
          else  System.out.println("O preço total é R$ "+precoTotal);
           
            

            

            

            

    

        }}

