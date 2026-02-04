package Exercicios.poo.Unidade2cap3.ex08;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        this.salario = salario - (salario *0.1);
        return this.salario;
    }
}
