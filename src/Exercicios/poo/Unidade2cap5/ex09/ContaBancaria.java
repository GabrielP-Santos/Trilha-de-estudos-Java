package Exercicios.poo.Unidade2cap5.ex09;

public class ContaBancaria {
    double saldo = 2000;
    public double sacar(double valor){
        if (saldo < valor){
            throw new ArithmeticException("Saldo insuficiente");
        }
        return saldo = saldo - valor;

    }

    public static void main(String[] args) {
        ContaBancaria Gabriel = new ContaBancaria();
        try{
            Gabriel.sacar(2100);
        } catch (Exception e){
            System.out.println("Error: " +  e.getMessage());
        }
        System.out.println("Saldo: "+ Gabriel.saldo);
    }
}
