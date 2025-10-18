public class Empleado {
    /**Declaración de atributos*/
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    /**Declaración del constructor*/
    public Empleado() {
    }

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }

    /**Métodos propios de Java (get y set)*/
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0;
        }
    }

    /**Métodos propios de la clase*/
    public double salarioAnual() {
        return getSalarioMensual() * 12;
    }

    public void aumentarSalarioMensual(double porcentaje) {
        double nuevoSalario = getSalarioMensual() * (1 + porcentaje / 100);
        setSalarioMensual(nuevoSalario);
    }
}