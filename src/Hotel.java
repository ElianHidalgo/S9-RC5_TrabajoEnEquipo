import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Individual ind1 = new Individual(1, true, false, true, true, false, false, true, 12.50);
        Individual ind2 = new Individual(1, true, true, true, true, false, true, true, 15.00);
        Doble doble1 = new Doble(2, true, false, true, true, true, true, true, 17.50, "Dos camas separadas");
        Doble doble2 = new Doble(1, true, true, true, true, true, true, true, 20.00, "Una cama matrimonial");
        Multiple multiple1 = new Multiple(3, true, false, true, true, true, true, true, 17.50, false);
        Multiple multiple2 = new Multiple(3, true, true, true, true, true, true, true, 20.00, true);
        Suite suite1 = new Suite(1, true, true, true, true, true, true, true, 25.00, false, true);
        Suite suite2 = new Suite(2, true, true, true, true, true, true, true, 30.00, true, true);

        Reserva reserva = new Reserva();
        System.out.println("Ingrese el número de la reserva: ");
        reserva.setNumeroDeReserva(sc.nextLine());

        List<Habitacion> hotel = new ArrayList<Habitacion>();
        hotel.add(ind1);
        hotel.add(ind2);
        hotel.add(doble1);
        hotel.add(doble2);
        hotel.add(multiple1);
        hotel.add(multiple2);
        hotel.add(suite1);
        hotel.add(suite2);

        int funcionamiento;
        int option;
        int option2;

        do {
            System.out.println("-----BIENVENIDOS AL HOTEL DULCES SUEÑOS-----");

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Crear reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Consultar disponibilidad");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Seleccione la habitación que desea reservar.");
                    System.out.println("1. Individual 1");
                    System.out.println("2. Individual 2");
                    System.out.println("3. Doble 1");
                    System.out.println("4. Doble 2");
                    System.out.println("5. Multiple 1");
                    System.out.println("6. Multiple 2");
                    System.out.println("7. Suite 1");
                    System.out.println("8. Suite 2");
                    option2 = sc.nextInt();
                    switch (option2){
                        case 1:
                            if (!ind1.isDisponible()){
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(ind1);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 2:
                            if (!ind2.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(ind2);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 3:
                            if (!doble1.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(doble1);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 4:
                            if (!doble2.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(doble2);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 5:
                            if (!multiple1.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(multiple1);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 6:
                            if (!multiple2.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(multiple2);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 7:
                            if (!suite1.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(suite1);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        case 8:
                            if (!suite2.isDisponible()) {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                            else {
                                reserva.crearReserva(suite2);
                                System.out.println("Habitación reservada");
                                break;
                            }
                        }
                    break;
                case 2:
                    System.out.println("Seleccione la habitación que desea cancelar la reserva.");
                    System.out.println("1. Individual 1");
                    System.out.println("2. Individual 2");
                    System.out.println("3. Doble 1");
                    System.out.println("4. Doble 2");
                    System.out.println("5. Multiple 1");
                    System.out.println("6. Multiple 2");
                    System.out.println("7. Suite 1");
                    System.out.println("8. Suite 2");
                    option2 = sc.nextInt();
                    switch (option2){
                        case 1:
                            if (ind1.isDisponible()){
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(ind1);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 2:
                            if (ind2.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(ind2);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 3:
                            if (doble1.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(doble1);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 4:
                            if (doble2.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(doble2);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 5:
                            if (multiple1.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(multiple1);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 6:
                            if (multiple2.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(multiple2);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 7:
                            if (suite1.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(suite1);
                                System.out.println("Reserva cancelada.");
                                break;
                            }
                        case 8:
                            if (suite2.isDisponible()) {
                                System.out.println("No hay reservas existentes para esta habitación.");
                                break;
                            }
                            else {
                                reserva.cancelarReserva(suite2);
                                System.out.println("Reserva cancelada.");
                                break;
                            }

                    }
                    break;
                case 3:
                    System.out.println("¿De qué habitación desea consultar la disponibilidad?");
                    System.out.println("1. Individual 1");
                    System.out.println("2. Individual 2");
                    System.out.println("3. Doble 1");
                    System.out.println("4. Doble 2");
                    System.out.println("5. Multiple 1");
                    System.out.println("6. Multiple 2");
                    System.out.println("7. Suite 1");
                    System.out.println("8. Suite 2");
                    option2 = sc.nextInt();
                    switch (option2){
                        case 1:
                            if (ind1.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 2:
                            if (ind2.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 3:
                            if (doble1.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 4:
                            if (doble2.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 5:
                            if (multiple1.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 6:
                            if (multiple2.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 7:
                            if (suite1.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                        case 8:
                            if (suite2.isDisponible()){
                                System.out.println("Habitación disponible");
                                break;
                            } else {
                                System.out.println("Habitación no disponible");
                                break;
                            }
                    }
                break;
            }
            System.out.println("¿Iniciar nuevamente?");
            System.out.println("1. Sí || 0. No.");
            funcionamiento = sc.nextInt();
        } while (funcionamiento != 0);
    }
}