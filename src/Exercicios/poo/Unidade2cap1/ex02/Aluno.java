package Exercicios.poo.Unidade2cap1.ex02;

public class Aluno {
    private String nome;
    private int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota < 0 || nota > 10){
            System.out.println("Não há como adicionar essa nota");
        }else {
            this.nota = nota;
        }

    }
}
