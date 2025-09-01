import java.util.ArrayList;
import java.util.List;

public class Exercicio4Main {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();

        IngressoVIP ingressoVIP = new IngressoVIP();
        ingressoVIP.setValor(200.00);
        ingressoVIP.setLocal("Setor A");
        ingressoVIP.setData("10/12/2025");
        ingressoVIP.setLote(1);
        ingressoVIP.setAreaVIP("Camarote");
        ingressos.add(ingressoVIP);

        IngressoEstudante ingressoEstudante = new IngressoEstudante();
        ingressoEstudante.setValor(100.00);
        ingressoEstudante.setLocal("Setor B");
        ingressoEstudante.setData("10/12/2025");
        ingressoEstudante.setLote(1);
        ingressoEstudante.setInstituicaoEnsino("Universidade XYZ");
        ingressos.add(ingressoEstudante);

        IngressoCortesia ingressoCortesia = new IngressoCortesia();
        ingressoCortesia.setValor(150.00); // Valor base irrelevante para cortesia
        ingressoCortesia.setLocal("Setor C");
        ingressoCortesia.setData("10/12/2025");
        ingressoCortesia.setLote(1);
        ingressoCortesia.setPatrocinador("Empresa Alpha");
        ingressos.add(ingressoCortesia);

        System.out.println("\n*** Exercício 4: Sistema de Ingressos para um Evento ***");
        for (Ingresso i : ingressos) {
            System.out.println("Tipo: " + i.getClass().getSimpleName() +
                               ", Local: " + i.getLocal() +
                               ", Data: " + i.getData() +
                               ", Valor Final: R$ " + String.format("%.2f", i.calcularValorFinal()));
        }
    }
}

