
/**
 * CLASE EMPLEADO - Especificaciones del Proyecto
 *
 * Crear una clase llamada Empleado que incluya tres variables de instancia:
 *   - primerNombre (String): Nombre del empleado
 *   - apellidoPaterno (String): Apellido paterno del empleado
 *   - salarioMensual (double): Salario mensual del empleado
 *
 * REQUISITOS DE LA CLASE:
 *   - Constructor que inicialice las tres variables de instancia
 *   - Métodos getter y setter para cada variable de instancia
 *   - Validación: Si el salario mensual no es positivo, no establecer su valor
 *
 * APLICACIÓN DE PRUEBA (PruebaEmpleado):
 *   1. Crear dos objetos Empleado
 *   2. Mostrar el salario anual de cada empleado
 *   3. Proporcionar un aumento del 10% a cada empleado
 *   4. Mostrar nuevamente el salario anual de cada empleado después del aumento
 */

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Scanner sc = new Scanner(System.in);

        /**Entrada de datos*/
        System.out.println("===============================");
        System.out.println("Bienvenido al sistema de empleados");
        System.out.println("===============================");
        System.out.println("Ingrese el nombre del primer empleado: ");
        empleado1.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido paterno del primer empleado: ");
        empleado1.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario mensual del primer empleado: ");
        empleado1.setSalarioMensual(sc.nextDouble());
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese el nombre del segundo empleado: ");
        empleado2.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido paterno del segundo empleado: ");
        empleado2.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario mensual del segundo empleado: ");
        empleado2.setSalarioMensual(sc.nextDouble());

        /**Cálculo, salida de datos y declaración de variables de ayuda*/
        double salarioMesEmp1 = empleado1.getSalarioMensual();
        double salarioMesEmp2 = empleado2.getSalarioMensual();
        System.out.println("===============================");
        if (salarioMesEmp1 == 0){
            JOptionPane.showMessageDialog(null, "No ha ingresado un salario adecuado para el Empleado 1");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado 1: \n" +
                    "Nombre: " + empleado1.getPrimerNombre() + "\n" +
                    "Apellido Paterno: " + empleado1.getApellidoPaterno() + "\n" +
                    "Salario Mensual: $" + empleado1.getSalarioMensual() + "\n" +
                    "Salario Anual: $" + empleado1.salarioAnual());
        }

        System.out.println("===============================");
        if (salarioMesEmp2 == 0){
            JOptionPane.showMessageDialog(null, "No ha ingresado un salario adecuado para el Empleado 2");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado 2: \n" +
                    "Nombre: " + empleado2.getPrimerNombre() + "\n" +
                    "Apellido Paterno: " + empleado2.getApellidoPaterno() + "\n" +
                    "Salario Mensual: $" + empleado2.getSalarioMensual() + "\n" +
                    "Salario Anual: $" + empleado2.salarioAnual());
        }

        double porcentajeAumento = 10.0;
        System.out.println("===============================");

        empleado1.aumentarSalarioMensual(porcentajeAumento);
        empleado2.aumentarSalarioMensual(porcentajeAumento);
        JOptionPane.showMessageDialog(null, "Empleado 1: \n" +
                "Nombre: " + empleado1.getPrimerNombre() + "\n" +
                "Apellido Paterno: " + empleado1.getApellidoPaterno() + "\n" +
                "Salario Anual con aumento del 10%: $" + empleado1.salarioAnual());

        JOptionPane.showMessageDialog(null, "Empleado 2: \n" +
                "Nombre: " + empleado2.getPrimerNombre() + "\n" +
                "Apellido Paterno: " + empleado2.getApellidoPaterno() + "\n" +
                "Salario Anual con aumento del 10%: $" + empleado2.salarioAnual());

    }
}