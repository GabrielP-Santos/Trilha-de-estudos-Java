package Exercicios.poo.Unidade2cap3.ex08;

public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        this.salario = salario - (salario *0.2);
        return this.salario;
    }
}
