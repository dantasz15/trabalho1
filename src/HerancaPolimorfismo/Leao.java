public class Leao extends Animal {
    private double tamanhoJuba;

    public double getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(double tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public String alimentar() {
        return "carne";
    }
}

