public class Reserva {
    //Atributos
    private String numeroDeReserva;


    //Constructor
    public Reserva() {
    }

    public Reserva(String numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }


    //Getters y Setters
    public String getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(String numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }


    //Metodos
    public void crearReserva(Habitacion habitacion) {
        habitacion.setDisponible(false);
    }

    public void cancelarReserva(Habitacion habitacion) {
        habitacion.setDisponible(true);
    }


    //toString
    @Override
    public String toString() {
        return "Reserva{" +
                "numeroDeReserva='" + numeroDeReserva + '\'' +
                '}';
    }
}
