public class ContaPoupanca extends Conta {
    private int aniversarioConta;

    public int getAniversarioConta() {
        return aniversarioConta;
    }

    public void setAniversarioConta(int aniversarioConta) {
        this.aniversarioConta = aniversarioConta;
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo() * 1.02;
    }
}

