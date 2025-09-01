import java.util.ArrayList;
import java.util.List;

public class Exercicio2Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(5);
        cachorro.setPeso(30.0);
        cachorro.setHabitat("Doméstico");
        cachorro.setRaca("Pastor Alemão");
        animais.add(cachorro);

        Gato gato = new Gato();
        gato.setNome("Miau");
        gato.setIdade(2);
        gato.setPeso(5.0);
        gato.setHabitat("Doméstico");
        gato.setCor("Preto");
        animais.add(gato);

        Leao leao = new Leao();
        leao.setNome("Simba");
        leao.setIdade(8);
        leao.setPeso(180.0);
        leao.setHabitat("Savana");
        leao.setTamanhoJuba(0.7);
        animais.add(leao);

        System.out.println("\n*** Exercício 2: Sistema de Animais de um Zoológico ***");
        for (Animal a : animais) {
            System.out.println("Nome: " + a.getNome() +
                               ", Som: " + a.emitirSom() +
                               ", Comida: " + a.alimentar());
        }
    }
}

