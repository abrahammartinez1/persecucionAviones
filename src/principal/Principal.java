package principal;

import aviones.Avion;
import aviones.AvionPerseguidor;

public class Principal {

    public static void main(String[] args) {

        AvionPerseguidor perseguidor = new AvionPerseguidor(2000, 200, Avion.Direccion.IZQUIERDA);
        Avion avion = new Avion(1000, 100, Avion.Direccion.DERECHA);
        avion.addObserver(perseguidor);

        System.out.println("Avion Sube");
        avion.subir();
        System.out.println();

        System.out.println("Avion Baja");
        avion.bajar();
        System.out.println();

        System.out.println("Avion Sube");
        avion.subir();
        System.out.println();

        System.out.println("Avion Gira Izquierda");
        avion.girar(Avion.Direccion.IZQUIERDA);
        System.out.println();

        System.out.println("Avion Gira Derecha");
        avion.girar(Avion.Direccion.DERECHA);
        System.out.println();

        System.out.println("Avion Acelera");
        avion.acelerar();
        System.out.println();

        System.out.println();

        System.out.println("Altura perseguidor " + perseguidor.getAltura());
        System.out.println("Velocidad perseguidor " + perseguidor.getVelocidad());
        System.out.println("Dirección perseguidor " + perseguidor.getDireccion().toString());
    }
}
