import javax.swing.*;
import java.util.Scanner;

/**
 * Programa: Computarización de Registros Médicos
 *
 * Descripción:
 * Este programa gestiona perfiles médicos de pacientes, facilitando el
 * compartir información de salud con profesionales médicos de manera segura.
 *
 * Funcionalidades:
 * - Registro de datos personales (nombre, apellido, sexo, fecha de nacimiento)
 * - Registro de medidas físicas (altura en cm, peso en kg)
 * - Cálculo automático de edad en años
 * - Cálculo del Índice de Masa Corporal (IMC/BMI)
 * - Cálculo de frecuencia cardíaca máxima
 * - Cálculo del rango de frecuencia cardíaca esperada
 *
 * Clasificación de IMC:
 * - Bajo peso:   < 18.5
 * - Normal:      18.5 - 24.9
 * - Sobrepeso:   25.0 - 29.9
 * - Obeso:       ≥ 30.0
 *
 * Componentes:
 * - Clase PerfilMedico: Almacena y procesa información médica del paciente
 * - Clase Main: Interfaz de usuario para captura y visualización de datos
 *
 * Beneficios:
 * - Mejora la calidad del servicio médico
 * - Previene conflictos de medicamentos
 * - Reduce prescripciones erróneas
 * - Disminuye costos de atención
 * - Puede salvar vidas en emergencias
 *
 */

public class Main {
    public static void main(String[] args) {

        /** Declaración de Objetos */
        PerfilMedico perfil1 = new PerfilMedico();

        /** Lectura de Datos */
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro médico."
        + "\nPor favor, ingrese sus datos personales.");

        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        perfil1.setNombre(Nombre);

        String Apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        perfil1.setApellido(Apellido);

        String Sexo = JOptionPane.showInputDialog("Ingrese su sexo (M/F):");
        perfil1.setSexo(Sexo);

        int MesNacimiento;
        do {
            String MesNacimientoStr = JOptionPane.showInputDialog("Ingrese su mes de nacimiento (1-12): ");
            MesNacimiento = Integer.parseInt(MesNacimientoStr);
            perfil1.setMesNacimiento(MesNacimiento);
            if (perfil1.getMesNacimiento() < 1 || perfil1.getMesNacimiento() > 12) {
                JOptionPane.showMessageDialog(null, "Mes inválido. Por favor, ingrese un valor entre 1 y 12.");
            }
        }while (perfil1.getMesNacimiento() < 1 || perfil1.getMesNacimiento() > 12);

        int DiaNacimiento;
        do {
            String DiaNacimientoStr = JOptionPane.showInputDialog("Ingrese su día de nacimiento (1-31): ");
            DiaNacimiento = Integer.parseInt(DiaNacimientoStr);
            perfil1.setDiaNacimiento(DiaNacimiento);
            if (perfil1.getDiaNacimiento() < 1 || perfil1.getDiaNacimiento() > 31) {
                JOptionPane.showMessageDialog(null, "Día inválido. Por favor, ingrese un valor entre 1 y 31.");
            }
        }while (perfil1.getDiaNacimiento() < 1 || perfil1.getDiaNacimiento() > 31);

        int AnioNacimiento;
        do {
            String AnioNacimientoStr = JOptionPane.showInputDialog("Ingrese su año de nacimiento (1900-2025): ");
            AnioNacimiento = Integer.parseInt(AnioNacimientoStr);
            perfil1.setAnioNacimiento(AnioNacimiento);
            if (perfil1.getAnioNacimiento() < 1900 || perfil1.getAnioNacimiento() > 2025) {
                JOptionPane.showMessageDialog(null, "Año inválido. Por favor, ingrese un valor entre 1900 y 2025.");
            }
        }while (perfil1.getAnioNacimiento() < 1900 || perfil1.getAnioNacimiento() > 2025);

        JOptionPane.showMessageDialog(null, "Ahora, por favor ingrese sus medidas físicas.");
        int AlturaCm;
        do {
            String AlturaCmStr = JOptionPane.showInputDialog("Ingrese su altura en centímetros (cm): ");
            AlturaCm = Integer.parseInt(AlturaCmStr);
            perfil1.setAlturaCm(AlturaCm);
            if (perfil1.getAlturaCm() < 50 || perfil1.getAlturaCm() > 300) {
                JOptionPane.showMessageDialog(null, "Altura inválida. Por favor, ingrese un valor entre 50 y 300 cm.");
            }
        }while (perfil1.getAlturaCm() < 50 || perfil1.getAlturaCm() > 300);

        int PesoKg;
        do {
            String PesoKgStr = JOptionPane.showInputDialog("Ingrese su peso en kilogramos (kg): ");
            PesoKg = Integer.parseInt(PesoKgStr);
            perfil1.setPesoKg(PesoKg);
            if (perfil1.getPesoKg() < 10 || perfil1.getPesoKg() > 500) {
                JOptionPane.showMessageDialog(null, "Peso inválido. Por favor, ingrese un valor entre 10 y 500 kg.");
            }
        }while (perfil1.getPesoKg() < 10 || perfil1.getPesoKg() > 500);

        JOptionPane.showMessageDialog(null,"Calculando su perfil médico...");

        /** Presentación de Resultados */
        int anioActual = 2025;
        JOptionPane.showMessageDialog(null,
                "Perfil Medico de: " + perfil1.getNombre() + " " + perfil1.getApellido() +
                "\n----------------------------------------" +
                "\nSexo: " + perfil1.getSexo() +
                "\nFecha de Nacimiento: " + perfil1.getDiaNacimiento() + "/" + perfil1.getMesNacimiento() + "/" + perfil1.getAnioNacimiento() +
                "\nEdad: " + perfil1.calcularEdad(anioActual) + " años" +
                "\n ----------------------------------------" +
                "\nAltura: " + perfil1.getAlturaCm() + " cm" +
                "\nMasa: " + perfil1.getPesoKg() + " kg" +
                "\n-----------------------------------------");

        JOptionPane.showMessageDialog(null,
        String.format("Índice de Masa Corporal (IMC): %.2f", perfil1.indiceMasaCorporal((double) perfil1.getAlturaCm())) +
                "\nClasificación de IMC: " + perfil1.clasificacionIMC(perfil1.indiceMasaCorporal((double) perfil1.getAlturaCm())) +
                "\n----------------------------------------" +
                String.format("\nFrecuencia Cardíaca Máxima: %d ppm", perfil1.frecuenciaCardiacaMax(anioActual)) +
                String.format("\nRango de Frecuencia Cardíaca Esperada: %.2f ppm", perfil1.frecuenciaCardiacaEsperada((int) perfil1.frecuenciaCardiacaMax(anioActual))) +
                "\n----------------------------------------");

    }
}