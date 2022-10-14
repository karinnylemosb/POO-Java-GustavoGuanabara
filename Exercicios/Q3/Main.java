
package Q3;
public class Main {

    public static void main(String[] args) {
        String corOriginal = "Branca";

        String novaCor = "Azul Pastel";

        Casa casa = new Casa();
        casa.setCor(corOriginal);

        System.out.println("Parabens, sua nova casa esta criada!");
        System.out.println("Ela possui as paredes na cor: " + casa.getCor());

        System.out.println("Realizando a pintura");

        casa.pintar(novaCor);
        System.out.println("Pintura Finalizada");
        System.out.println("Agora ela possui as paredes na cor: " + casa.getCor());

        System.out.println("Abrindo as portas");
        casa.setPrimeiraPorta(false);
        casa.setSegundaPorta(true);
        casa.setTerceiraPorta(true);

        System.out.println("Portas abertas: " + casa.quantasPortasEstaoAbertas());


    }

}