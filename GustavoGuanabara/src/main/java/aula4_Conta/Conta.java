package aula4_Conta;

import java.lang.reflect.Constructor;

public class Conta {
    public int numConta;
    protected String tipo;
    private boolean status;
    private String dono;
    private float saldo;

    public Conta() { //Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

//Métodos especiais ----------------------------
    public void estadoAtual() {
        System.out.println("---------------------------------------------");
        System.out.println("numero da conta: " + this.getNumConta());
        System.out.print("Tipo de conta:" + this.tipo);
        System.out.println("Status: " + this.getStatus());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo == "CP"){
            this.setSaldo(150);
            System.out.println("Sua conta POUPANÇA foi aberta com " + this.saldo + "reais");
        } else if (tipo == "CC"){
               this.setSaldo(50);
            System.out.println("Sua conta CORRENTE foi aberta com " + this.saldo + "reais");
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Sua conta ainda tem dinheiro!");
        }else if(this.getSaldo() < 0){
            System.out.println("Você está em débito!");
        }else{
            setStatus(false);//Conta fechada!
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar (float valor){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso em: " + getDono());
        }else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(int valor){

        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Saque OK. Sau saldo é: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Você não possui conta aberta!");
        }
    }

    public void pagarMensalidade(String tipo){
        int v =0 ;
            if (this.getTipo() == "CC") {
                v =  12;
                    } else if (this.getTipo() == "CP") {
                    v =  20;
                        } else {
                        System.out.println("Digite um tipo de conta válido!");
                        }
            if (this. getStatus() == true){
                if (this.getSaldo() > v){
                    this.setSaldo(getSaldo() - v);
                    System.out.println("Mensalidade paga por:" + getDono());

                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else {
                System.out.println("Impossível pagar uma conta fechada!");
            }
    }


}

