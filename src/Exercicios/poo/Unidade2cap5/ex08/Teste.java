package Exercicios.poo.Unidade2cap5.ex08;

import java.util.Scanner;

public class Teste {
    public static int validarIdade(int idade) throws IdadeInvalidaException{
        if(idade < 18){
            throw new IdadeInvalidaException(" idade não permitida");
        }
        return idade;
    }

    public static void main(String[] args) {
        try{
            validarIdade(15);
        } catch (IdadeInvalidaException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
