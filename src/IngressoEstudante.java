public class IngressoEstudante extends Ingresso {
    private String instituicaoEnsino;

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularValorFinal() {
        return getValor() / 2;
    }
}

