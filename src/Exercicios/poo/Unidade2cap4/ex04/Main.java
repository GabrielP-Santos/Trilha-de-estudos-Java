package Exercicios.poo.Unidade2cap4.ex04;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel");
        Aluno a2 = new Aluno("Leandro");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("Jesus");

        Curso c1 = new Curso("Ciência da Computação");

        c1.adicionarAlunos(a1);
        c1.adicionarAlunos(a2);
    }
}
