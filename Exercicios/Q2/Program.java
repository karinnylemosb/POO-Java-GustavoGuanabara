package Q2;

public class Program {

    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.abrir();
        porta.estaAberta();
        porta.fecha();
        porta.estaAberta();
        porta.pintar("Amarelo!");
        porta.pintar("Branco!");
        porta.pintar("Azul!");
        porta.setAltura(1.92);
        porta.setLargura(0.65);
        porta.setEspessura(4.4);
        System.out.println(porta);
        porta.setAltura(1.85);
        porta.setLargura(0.72);
        porta.setEspessura(4.8);
        System.out.println(porta);


    }
}