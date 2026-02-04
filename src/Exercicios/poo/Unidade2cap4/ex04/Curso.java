package Exercicios.poo.Unidade2cap4.ex04;
import java.util.ArrayList;
public class Curso {
    String nome;
    ArrayList<Aluno> alunos;

    public Curso(String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAlunos(Aluno aluno){
            alunos.remove(aluno);
    }
}
