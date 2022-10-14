package Caneta;

import java.sql.SQLOutput;

//Métodos Getters
public class Caneta {
    public String modelo;

    private String cor;
    private float ponta;

    private boolean tampada =true;

    //com o construtor já é criado uma caneta com os padrões que eu quero
    public  Caneta(String m, String c,float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;

    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada " + this.tampada);

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}

