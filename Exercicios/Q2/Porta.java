package Q2;

public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double largura;
    private double espessura;

    public Porta(){

    }

    public void pintar (String cor){rog
        this.cor = cor;
        System.out.println("Você pintou a porta de  " + cor);
    }

    public void abrir (){
        this.aberta = true;
    }

    public void fecha (){
        this.aberta = false;
    }

    public boolean estaAberta(){
        if (this.aberta == true ){
            System.out.println("A porta está aberta!");
            return true;
        }else {
            System.out.println("A porta está fechada!");
            return false;
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }


    public String toString (){
        return "A porta tem " + altura + " de altura, com " + largura + " de largura e " + espessura + " de espessura. ";
    }

}
