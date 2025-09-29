/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_2_1;

/**
 *
 * @author ixchel
 */
public class Practica_2_1 {

    public static void main(String[] args) {
           Asalariado emple = new Asalariado();
           emple.genAsalariado(1);
           
           emple.sueldoBruto();
           emple.horasExtra();
           emple.sueldoNeto();
           
        
//        Asalariado empleado = new Asalariado("12345678A", "Nombre", 1200.00, 17.5, 0.12);
//        // String dni, String nombre, double sueldoBase, double horasExtra, double irpf
//        empleado.horasExtra();
//        empleado.sueldoBruto();
//        empleado.calcIrpf();
//        empleado.sueldoNeto();
//        
//        printEmpleado(empleado);
    }

    private static void printEmpleado(Asalariado a) {
        System.out.println(a.toString());
        System.out.printf("  Sueldo bruto: %.2f\n", a.sueldoBruto());
        System.out.printf("  Retencion IRPF: %.2f\n", a.calcIrpf());
        System.out.printf("  Sueldo neto: %.2f\n", a.sueldoNeto());
    }
}