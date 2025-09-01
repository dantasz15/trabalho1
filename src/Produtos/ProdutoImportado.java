public class ProdutoImportado extends Produto {
    private String paisOrigem;

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.15; // 15% de taxa
    }
}

