public class Carro extends Veiculo {
    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + 50.00;
    }
}

