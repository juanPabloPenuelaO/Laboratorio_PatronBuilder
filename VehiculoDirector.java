public class VehiculoDirector {
    private VehiculoBuilder constructor; // Builder que utilizaremos

    /**
 * Constructor del director.
 * 
 * @param constructor Builder que se usará para construir vehiculo.
 */

public VehiculoDirector(VehiculoBuilder constructor) {
    this.constructor = constructor;
}
     
     /**
     * Construye un carro con configuración predeterminada.
     *
     * @return Objeto Vehiculo configurado como Carro.
     */
    public Vehiculo construirCarro() {
        return constructor.setTipo("Carro")
                          .setRuedas(4)
                          .setColor("Rojo")
                          .setModelo("ferrari")
                          .build(); // Construimos y retornamos el carro
    }

    /**
     * Construye una moto con configuración predeterminada.
     *
     * @return Objeto Vehiculo configurado como Moto.
     */
    public Vehiculo construirMoto() {
        return constructor.setTipo("Moto")
                          .setRuedas(2)
                          .setColor("Negro")
                          .setModelo("ninja")
                          .build(); // Construimos y retornamos la moto
    }

    /**
     * Construye una bicicleta con configuración predeterminada.
     *
     * @return Objeto Vehiculo configurado como Bicicleta.
     */
    public Vehiculo construirBicicleta() {
        return constructor.setTipo("Bicicleta")
                          .setRuedas(2)
                          .setColor("Azul")
                          .setModelo("Todoterreno")
                          .build(); // Construimos y retornamos la bicicleta
    }

    /**
     * Construye un camión con configuración predeterminada.
     *
     * @return Objeto Vehiculo configurado como Camión.
     */
    public Vehiculo construirCamion() {
        return constructor.setTipo("Camión")
                          .setRuedas(6)
                          .setColor("Blanco")
                          .setModelo("carga")
                          .build(); // Construimos y retornamos el camión
    }
}