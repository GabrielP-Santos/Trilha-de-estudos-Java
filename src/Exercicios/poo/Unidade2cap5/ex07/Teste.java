package Exercicios.poo.Unidade2cap5.ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static int lerNumeroInteiro(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número inteiro: ");

            try{
                int numero = scanner.nextInt();
                return numero;
            }catch (InputMismatchException e){

                System.out.println("ERRO: isso definitivamente não é um número inteiro");
                scanner.next();

            }
        }
    }
    public static void main(String[] args) {
        int valor = lerNumeroInteiro();
        System.out.println("Você digitou: " + valor);
    }
}
