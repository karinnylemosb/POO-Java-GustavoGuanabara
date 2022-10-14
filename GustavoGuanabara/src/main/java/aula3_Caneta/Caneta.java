package aula3_Caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
   protected boolean tampada;

    //Métodos

    void status() {
        System.out.println("\n Modelo: " + this.modelo);
        System.out.print("\n Uma caneta de cor:  " + this.cor);
        System.out.println("\n Ponta: " + this.ponta);
        System.out.println("\n Carga: " + this.carga);
        System.out.println("\n Está tampada? " + this.tampada);
    }

   public void rabiscar (){
    if(this.tampada == true){
        System.out.println("Erro!Não posso rabiscar!");
    }else{
        System.out.println("Estou rabiscando!");
    }
    }

   protected void tampar (){
    this.tampada=true;
    }

    protected void destampar(){
    this.tampada=false;
    }
}

