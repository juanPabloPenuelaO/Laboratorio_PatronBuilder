public interface VehiculoBuilder {
    VehiculoBuilder setTipo(String tipo);
    VehiculoBuilder setRuedas(int ruedas);
    VehiculoBuilder setColor(String color);
    VehiculoBuilder setModelo(String modelo);
    Vehiculo build(); //metodo para construir el vehiculo
}