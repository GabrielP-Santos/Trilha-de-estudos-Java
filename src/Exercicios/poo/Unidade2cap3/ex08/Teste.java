package Exercicios.poo.Unidade2cap3.ex08;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT("Leticia", 1600);
        Funcionario f2 = new FuncionarioPJ("Lorena", 3000);
        Funcionario f3 = new FuncionarioCLT("Gabriel", 9000);
        Funcionario f4 = new FuncionarioPJ("Daniel", 600);

        Funcionario[] listaFun = {f1,f2,f3,f4};

        for(Funcionario lista : listaFun){
            System.out.println("Meu nome é: "+ lista.nome);
            System.out.println("Meu salário é: "+ lista.calcularSalario());
        }
    }
}
