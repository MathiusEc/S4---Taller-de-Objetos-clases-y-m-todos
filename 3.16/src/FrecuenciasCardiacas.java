public class FrecuenciasCardiacas {
    /**Declaración de atributos*/
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    /**Declaración de constructores & destructores*/
    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    /**Métodos propios de Java (getters & setters)*/
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    /**Métodos propios de programador*/
    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }

    public int calcularFrecCardiacaMax(int anioActual) {
        return 220 - calcularEdad(anioActual);
    }

    public double calcularFrecCardiacaEsperada(int calcularFrecCardiacaMax){
        return (((calcularFrecCardiacaMax * 0.50) + (calcularFrecCardiacaMax * 0.85)) / 2);
    }
}