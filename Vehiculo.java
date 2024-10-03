public class Vehiculo {
    private final String tipo; //tipo de vehículo
    private final int ruedas; //numero de ruedas
    private final String color; // color del vehículo
    private final String modelo; // modelo del vehículo

        /**
     * Constructor de la clase Vehiculo.
     * @param tipo   tipo de vehículo.
     * @param ruedas número de ruedas.
     * @param color  color del vehículo.
     * @param modelo modelo del vehículo.
     */
    
    public Vehiculo(String tipo, int ruedas, String color, String modelo) {
        this.tipo = tipo;
        this.ruedas = ruedas;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}