package Exercicios.poo.Unidade2cap2.ex06;


import Exercicios.poo.Unidade2cap2.ex06.Funcionario;
public class Gerente extends Funcionario {
    String departamento;

    public Gerente(double salario, String nome, String departamento) {
        super(salario, nome);
        this.departamento = departamento;
    }
}
