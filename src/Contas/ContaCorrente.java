public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo() - 15.00;
    }
}

