public class Habitacion {
    //Atributos
    private int numeroDeCamas;
    private boolean banio;
    private boolean television;
    private boolean aireAcondicionado;
    private boolean aguaCaliente;
    private boolean refrigerador;
    private boolean wifi;
    private boolean disponible;
    private double costo;

    //Constructores
    public Habitacion(int numeroDeCamas, boolean banio, boolean television, boolean aireAcondicionado, boolean aguaCaliente, boolean refrigerador, boolean wifi, boolean disponible, double costo) {
        this.numeroDeCamas = numeroDeCamas;
        this.banio = banio;
        this.television = television;
        this.aireAcondicionado = aireAcondicionado;
        this.aguaCaliente = aguaCaliente;
        this.refrigerador = refrigerador;
        this.wifi = wifi;
        this.disponible = disponible;
        this.costo = costo;
    }


    //Getters y Setters
    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public boolean isBanio() {
        return banio;
    }

    public void setBanio(boolean banio) {
        this.banio = banio;
    }

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public boolean isRefrigerador() {
        return refrigerador;
    }

    public void setRefrigerador(boolean refrigerador) {
        this.refrigerador = refrigerador;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    //Métodos
    public boolean consultarDisponibilidad() {
        return disponible;
    }


    //toString
    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroDeCamas=" + numeroDeCamas +
                ", banio=" + banio +
                ", television=" + television +
                ", aireAcondicionado=" + aireAcondicionado +
                ", aguaCaliente=" + aguaCaliente +
                ", refrigerador=" + refrigerador +
                ", wifi=" + wifi +
                ", disponible=" + disponible +
                ", costo=" + costo +
                '}';
    }
}
