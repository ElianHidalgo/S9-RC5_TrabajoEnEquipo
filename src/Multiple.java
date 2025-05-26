public class Multiple extends Habitacion {
    //Atributo
    private boolean litera;


    //Constructores
    public Multiple(int numeroDeCamas, boolean banio, boolean television, boolean aireAcondicionado, boolean aguaCaliente, boolean refrigerador, boolean wifi, boolean disponible, double costo, boolean litera) {
        super(numeroDeCamas, banio, television, aireAcondicionado, aguaCaliente, refrigerador, wifi, disponible, costo);
        this.litera = litera;
    }


    //Getters y Setters
    public boolean isLitera() {
        return litera;
    }

    public void setLitera(boolean litera) {
        this.litera = litera;
    }


    //toString
    @Override
    public String toString() {
        String s = super.toString();
        return s + "Multiple{" +
                "litera=" + litera +
                '}';
    }
}
