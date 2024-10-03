public class Main {
    public static void main(String[] args) {
        // instancia del builder concreto
        VehiculoBuilder constructor = new ConcreteVehiculoBuilder();
        // instancia del director pasándole el builder
        VehiculoDirector director = new VehiculoDirector(constructor);

        // construye un carro
        Vehiculo coche = director.construirCarro(); // Cambiado a construirCarro()
        System.out.println(coche); // mostramos los detalles del carro

        // Construimos una moto
        Vehiculo moto = director.construirMoto();
        System.out.println(moto); // Mostramos los detalles de la moto

        // Construimos una bicicleta
        Vehiculo bicicleta = director.construirBicicleta();
        System.out.println(bicicleta); // Mostramos los detalles de la bicicleta

        // Construimos un camión
        Vehiculo camion = director.construirCamion();
        System.out.println(camion); // Mostramos los detalles del camión
    }
}