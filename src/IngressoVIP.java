public class IngressoVIP extends Ingresso {
    private String areaVIP;

    public String getAreaVIP() {
        return areaVIP;
    }

    public void setAreaVIP(String areaVIP) {
        this.areaVIP = areaVIP;
    }

    @Override
    public double calcularValorFinal() {
        return getValor() + 100.00;
    }
}

