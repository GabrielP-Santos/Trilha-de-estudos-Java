package Exercicios.poo.Unidade2cap4.ex01;

public class Carro {
    String nome;
    private Motor motor; //o carro tem um motor

    public Carro(String nome) {
        this.motor = new Motor(120);
        this.nome = nome;
    }

    public void ligarCarro(){
        System.out.println("Ligando a lataria do "+ nome);
        motor.ligar();
        System.out.println("Carro se arrastando");
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca vei");
        c1.ligarCarro();
    }

}
