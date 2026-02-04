package Exercicios.poo.Unidade2cap1;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;

    }
    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Não há saldo suficiente para saque");

        } this.saldo = this.saldo - valor;
    }
}
