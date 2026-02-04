package Exercicios.poo.Unidade2cap4.ex01;

public class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }
    public void ligar(){
        System.out.println("Motor ligado com potência" + potencia + "cavalos de potência");
    }
}
