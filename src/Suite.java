public class Suite extends Habitacion {
    //Atributos
    private boolean jacuzzi;
    private boolean miniBar;


    //Constructores
    public Suite(int numeroDeCamas, boolean banio, boolean television, boolean aireAcondicionado, boolean aguaCaliente, boolean refrigerador, boolean wifi, boolean disponible, double costo, boolean jacuzzi, boolean miniBar) {
        super(numeroDeCamas, banio, television, aireAcondicionado, aguaCaliente, refrigerador, wifi, disponible, costo);
        this.jacuzzi = jacuzzi;
        this.miniBar = miniBar;
    }


    //Getters y Setters
    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }


    //toString
    @Override
    public String toString() {
        String s = super.toString();
        return s + "Suite{" +
                "jacuzzi=" + jacuzzi +
                ", miniBar=" + miniBar +
                '}';
    }
}
