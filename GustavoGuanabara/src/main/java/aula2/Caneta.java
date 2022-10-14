package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Métodos

    void status() {
        System.out.println("\n Modelo: " + this.modelo);
        System.out.print("\n Uma caneta de cor:  " + this.cor);
        System.out.println("\n Ponta: " + this.ponta);
        System.out.println("\n Carga: " + this.carga);
        System.out.println("\n Está tampada? " + this.tampada);
    }

    void rabiscar (){
    if(this.tampada == true){
        System.out.println("Erro!Não posso rabiscar!");
    }else{
        System.out.println("Estou rabiscando!");
    }
    }

    void tampar (){
    this.tampada=true;
    }

    void destampar(){
    this.tampada=false;
    }
}

