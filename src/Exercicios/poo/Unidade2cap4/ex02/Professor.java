package Exercicios.poo.Unidade2cap4.ex02;

public class Professor {
    String nome;
    Departamento departamento;

    public Professor(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void imprime(){
        System.out.println("Professor: "+ nome);
        System.out.println("Departamento: "+ departamento.nome);
    }

    public static void main(String[] args) {
        Departamento d1 = new Departamento("RH");
        Professor p1 = new Professor("Gabriel", d1);

        p1.imprime();
    }

}
