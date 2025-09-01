public class ContaSalario extends Conta {
    private String empresaConveniada;

    public String getEmpresaConveniada() {
        return empresaConveniada;
    }

    public void setEmpresaConveniada(String empresaConveniada) {
        this.empresaConveniada = empresaConveniada;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 1000.00) {
            super.sacar(valor);
        } else {
            System.out.println("Saque não permitido. Valor excede o limite de R$ 1000,00 para Conta Salário.");
        }
    }

    @Override
    public double calcularSaldoFinal() {
        return getSaldo();
    }
}

