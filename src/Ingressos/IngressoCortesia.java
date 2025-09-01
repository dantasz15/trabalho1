public class IngressoCortesia extends Ingresso {
    private String patrocinador;

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public double calcularValorFinal() {
        return 0.00;
    }
}

