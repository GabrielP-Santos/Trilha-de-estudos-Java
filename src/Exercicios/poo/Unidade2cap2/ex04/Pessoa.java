package Exercicios.poo.Unidade2cap2.ex04;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void falarNome(){
        System.out.println("Meu nome é: "+ nome);
    }
}
