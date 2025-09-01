public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + 200.00;
    }
}

