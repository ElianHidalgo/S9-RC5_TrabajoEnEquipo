public class Doble extends Habitacion{
    //Atributo
    private String tipoDeCama;


    //Constructor
    public Doble(int numeroDeCamas, boolean banio, boolean television, boolean aireAcondicionado, boolean aguaCaliente, boolean refrigerador, boolean wifi, boolean disponible, double costo, String tipoDeCama) {
        super(numeroDeCamas, banio, television, aireAcondicionado, aguaCaliente, refrigerador, wifi, disponible, costo);
        this.tipoDeCama = tipoDeCama;
    }


    //Getters y Setters
    public String getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(String tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }


    //toString
    @Override
    public String toString() {
        String s = super.toString();
        return s + "Doble{" +
                "tipoDeCama='" + tipoDeCama + '\'' +
                '}';
    }
}
