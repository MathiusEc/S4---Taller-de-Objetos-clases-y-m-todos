import javax.swing.*;
import java.util.Scanner;

/**
 * Calculadora de la Frecuencia Cardíaca Esperada
 *
 * Descripción:
 * Mientras se ejercita, puede usar un monitor de frecuencia cardíaca para ver que su corazón
 * permanezca dentro de un rango seguro sugerido por sus entrenadores y doctores.
 *
 * Fórmulas (AHA - American Heart Association):
 * - Frecuencia cardíaca máxima: 220 - edad (en años)
 * - Frecuencia cardíaca esperada: entre 50% y 85% de la frecuencia cardíaca máxima
 *
 * Referencia: www.americanheart.org/presenter.jhtml?identifier=4736
 *
 * NOTA IMPORTANTE:
 * Estas fórmulas son estimaciones proporcionadas por la AHA. Las frecuencias cardíacas
 * máxima y esperada pueden variar con base en la salud, condición física y sexo del individuo.
 * Siempre debe consultar un médico o a un profesional de la salud antes de empezar o
 * modificar un programa de ejercicios.
 *
 * Requisitos de la Clase FrecuenciasCardiacas:
 * - Atributos: primer nombre, apellido, fecha de nacimiento (mes, día, año)
 * - Constructor con parámetros para todos los atributos
 * - Métodos getter y setter para cada atributo
 * - Método para calcular la edad (en años)
 * - Método para calcular la frecuencia cardíaca máxima
 * - Método para calcular el rango de frecuencia cardíaca esperada
 *
 * La aplicación debe:
 * - Solicitar información de la persona
 * - Crear una instancia de FrecuenciasCardiacas
 * - Imprimir información personal y resultados de los cálculos
 *
 * Autores: Isaac Benítez - Mathías Castillo
 */
public class Main {
    public static void main(String[] args) {

        /**Declaración de objetos*/
        FrecuenciasCardiacas persona1 = new FrecuenciasCardiacas();
        Scanner sc = new Scanner(System.in);

        /**Lectura de datos*/
        System.out.println("Bienvenido a la calculadora de frecuencia cardiaca esperada");
        System.out.println("Por favor, ingrese los siguientes datos:");
        System.out.print("Primer nombre: ");
        persona1.setPrimerNombre(sc.nextLine());
        System.out.print("Apellido: ");
        persona1.setApellido(sc.nextLine());
        System.out.print("Mes de nacimiento (número): ");
        persona1.setMesNacimiento(sc.nextInt());
        System.out.print("Día de nacimiento (número): ");
        persona1.setDiaNacimiento(sc.nextInt());
        System.out.print("Año de nacimiento (número): ");
        persona1.setAnioNacimiento(sc.nextInt());
        System.out.println("================================");
        System.out.println("Calculando resultados...");
        System.out.println("================================");

        /**Cálculo de resultados*/
        //Se inicializan variables
        int anioActual = 2025;
        int frecCardiacaMax;

        int edad = persona1.calcularEdad(anioActual);
        frecCardiacaMax = persona1.calcularFrecCardiacaMax(anioActual);
        double frecCardiacaEsperada = persona1.calcularFrecCardiacaEsperada(frecCardiacaMax);

        /**Impresión de resultados*/
        JOptionPane.showMessageDialog(null, "Datos del Paciente: \n" +
                "Nombre: " + persona1.getPrimerNombre() + "\n" +
                "Apellido: " + persona1.getApellido() + "\n" +
                "Fecha de Nacimiento: " + persona1.getDiaNacimiento() + "/" + persona1.getMesNacimiento() +
                "/" + persona1.getAnioNacimiento() + "\n");
        JOptionPane.showMessageDialog(null, "Resultados: \n" +
                "Edad: " + edad + " años\n" +
                "Frecuencia Cardíaca Máxima: " + frecCardiacaMax + " ppm\n" +
                "Frecuencia Cardíaca Esperada: " + frecCardiacaEsperada + " ppm\n");
    }
}