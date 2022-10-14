package aula4_Conta;


public class aula4 {

    public static void main (String[] args){

        Conta conta1 = new Conta();
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu");
        conta1.setTipo("CC");
        conta1.abrirConta("CC");

        Conta conta2 = new Conta();
        conta2.setNumConta(2222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");

        conta1.depositar(100);
        conta2.depositar(500);

        conta2.sacar(1000);



        conta1.sacar(150);
        conta1.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();

    }

}
