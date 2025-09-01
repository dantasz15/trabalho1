public class Moto extends Veiculo {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) * 0.95;
    }
}

