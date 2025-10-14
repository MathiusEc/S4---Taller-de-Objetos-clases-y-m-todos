public class Factura {
    /** Declaración de Atributos*/
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    /** Declaración de Constructores & Destrcutores*/
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    /** Métodos propios de Java (Getters & Setters)*/
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    /** Métodos propios del Programador*/
    // Obtener valores a las instancias
    public void obtenerValores() {
        System.out.println("Número de pieza: " + getNumeroPieza());
        System.out.println("Descripción de la pieza: " + getDescripcionPieza());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio por artículo: " + getPrecioPorArticulo());
    }

    // Establecer valores a la instancias
    public void establecerValores(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        setNumeroPieza(numeroPieza);
        setDescripcionPieza(descripcionPieza);
        setCantidad(cantidad);
        setPrecioPorArticulo(precioPorArticulo);
    }

}
