package Q3;

public class Casa {
    private String cor;
    private boolean primeiraPorta;
    private boolean segundaPorta;
    private boolean terceiraPorta;

    public Casa() {
        super();
    }

    public Casa(String cor, boolean primeiraPorta, boolean segundaPorta, boolean terceiraPorta) {
        super();
        this.cor = cor;
        this.primeiraPorta = primeiraPorta;
        this.segundaPorta = segundaPorta;
        this.terceiraPorta = terceiraPorta;
    }

    public void pintar(String s){
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas(){
        int total = 0;
        if(this.primeiraPorta == true){
            total += 1;
        }if(this.segundaPorta == true){
            total += 1;
        }if(this.segundaPorta == true){
            total += 1;
        }
        return total;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPrimeiraPorta() {
        return primeiraPorta;
    }

    public void setPrimeiraPorta(boolean primeiraPorta) {
        this.primeiraPorta = primeiraPorta;
    }

    public boolean isSegundaPorta() {
        return segundaPorta;
    }

    public void setSegundaPorta(boolean segundaPorta) {
        this.segundaPorta = segundaPorta;
    }

    public boolean isTerceiraPorta() {
        return terceiraPorta;
    }

    public void setTerceiraPorta(boolean terceiraPorta) {
        this.terceiraPorta = terceiraPorta;
    }

}