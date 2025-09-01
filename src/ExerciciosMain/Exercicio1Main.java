import java.util.ArrayList;
import java.util.List;

public class Exercicio1Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2023);
        carro.setValorDiaria(100.00);
        carro.setPlaca("ABC-1234");
        carro.setQuantidadePortas(4);
        veiculos.add(carro);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CBR 600RR");
        moto.setAno(2022);
        moto.setValorDiaria(70.00);
        moto.setPlaca("DEF-5678");
        moto.setCilindrada(600);
        veiculos.add(moto);

        Caminhao caminhao = new Caminhao();
        caminhao.setMarca("Volvo");
        caminhao.setModelo("FH 540");
        caminhao.setAno(2021);
        caminhao.setValorDiaria(300.00);
        caminhao.setPlaca("GHI-9012");
        caminhao.setCapacidadeCarga(20.0);
        veiculos.add(caminhao);

        System.out.println("*** Exercício 1: Sistema de Veículos em uma Locadora ***");
        for (Veiculo v : veiculos) {
            System.out.println("Modelo: " + v.getModelo() +
                               ", Placa: " + v.getPlaca() +
                               ", Valor do Aluguel (7 dias): R$ " + String.format("%.2f", v.calcularAluguel(7)));
        }
    }
}

