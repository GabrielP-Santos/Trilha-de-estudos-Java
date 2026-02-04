package Exercicios.poo.Unidade2cap2.ex04;

public class Engenheiro extends Funcionario {
    String especialidade;

    public Engenheiro(String nome, String cargo, String especialiade) {
        super(nome, cargo);
        this.especialidade = especialidade;
    }

    public void falarSalario(){
        System.out.println("Minha especialidade é: "+ especialidade);
    }


}
