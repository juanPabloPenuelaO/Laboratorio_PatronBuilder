public class ConcreteVehiculoBuilder implements VehiculoBuilder {
    private String tipo;
    private int ruedas;
    private String color;
    private String modelo;

    @Override
    public VehiculoBuilder setTipo(String tipo) {
        this.tipo = tipo; // asigna el tipo de vehiculo
        return this;
    }

    @Override
    public VehiculoBuilder setRuedas(int ruedas) {
        this.ruedas = ruedas; // asigna el número de ruedas
        return this;
    }

    @Override
    public VehiculoBuilder setColor(String color) {
        this.color = color; // asigna el color del vehiculo
        return this;
    }

    @Override
    public VehiculoBuilder setModelo(String modelo) {
        this.modelo = modelo; // asigna el modelo del vehiculo
        return this;
    }

    @Override
    public Vehiculo build() {
        // crea y retorna nueva instancia del vehiculo
        return new Vehiculo(tipo, ruedas, color, modelo);
    }
}