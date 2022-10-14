package Q1;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        //Criando um objeto a partir de uma classe:

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome:");
        String nome = input.nextLine();//Atenção: nextLine e nextInt

        System.out.print("Digite sua idade:");
        int idade = input.nextInt();// Lê o input da linha

        System.out.print("Informe a quantidade de aniversarios que deseja imprimir a partir da idade:");
        int qtdAniversario = input.nextInt();


        //Criando o objeto a partir da classe:
        Pessoa pessoa = new Pessoa(nome,idade);

        for (int i = 0; i <= qtdAniversario; i++){
            pessoa.fazAniversario(1);
            System.out.println("Parabéns, " + pessoa.getNome() + "!!! O " + (i+1) + "° aniversário é: " + pessoa.getIdade());
        };

    };
}






