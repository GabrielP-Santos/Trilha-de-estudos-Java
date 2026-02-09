package Exercicios.poo.Unidade2cap5.ex010;


import java.io.FileReader;
import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        abrirArquivo("sei nem oq escrever");
    }

    public static void abrirArquivo(String caminho){
        try{
            FileReader fr = new FileReader(caminho);
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}

