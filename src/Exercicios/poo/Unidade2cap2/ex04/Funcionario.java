package Exercicios.poo.Unidade2cap2.ex04;

public class Funcionario extends Pessoa{
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public void falarCargo(){
        System.out.println("Meu cargo é: "+ cargo);
    }
}
