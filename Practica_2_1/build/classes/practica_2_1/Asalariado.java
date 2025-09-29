/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_2_1;

import java.util.Scanner;

/**
 *
 * @author ixchel
 */
public class Asalariado {

    private String dni;
    private String nombre;
    private Double sueldo_base;
    private Double h_extra;
    private Double irpf;
    private static final Double HORAS_EXTRA = 20.00;//cambiar de final a static final

    public Asalariado(String dni, String nombre, Double sueldo_base, Double h_extra, Double irpf) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo_base = sueldo_base;
        this.h_extra = h_extra;
        this.irpf = irpf;
    }

    public Asalariado() {//sobrecarga constructor
        this.dni = "";
        this.nombre = "";
        this.sueldo_base = 0.0;
        this.h_extra = 0.0;
        this.irpf = 0.0;
    }

    public Asalariado[] genAsalariado(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de empleados: ");
        Asalariado[] e = new Asalariado[num];

        for (int i = 0; i < e.length; i++) {
            System.out.println("Introduzca los datos del empleado" + (i + 1) + "/" + num + ": ");
            System.out.println("DNI: ");
            String dni = sc.nextLine();

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Sueldo base: ");
            Double sueldo_base = sc.nextDouble();

            System.out.println("Horas extra realizadas: ");
            Double h_extra = sc.nextDouble();

            System.out.println("Retencion IRPF: ");
            Double irpf = sc.nextDouble();

            sc.nextLine();
            e[i] = new Asalariado(dni, nombre, sueldo_base, h_extra, irpf);
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
            System.out.printf("  Sueldo bruto: %.2f\n", e[i].sueldoBruto());
            System.out.printf("  Retencion IRPF: %.2f\n", e[i].calcIrpf());
            System.out.printf("  Sueldo neto: %.2f\n", e[i].sueldoNeto());
        }
        sc.close();
        ordenmMsalarioNeto(e);
        return e;
    }

    public static void ordenmMsalarioNeto(Asalariado[] e) {
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = 0; j < e.length - 1 - i; j++) {
                if (e[j].sueldoNeto() > e[j + 1].sueldoNeto()) {
                    Asalariado aux = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = aux;
                }
            }
        }
        System.out.println("Empleados ordenados por sueldo neto:");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
            System.out.printf("  Sueldo neto: %.2f\n", e[i].sueldoNeto());
        }
    }

    public double horasExtra() {
        if (h_extra < 0) {
            System.out.println("No se pueden hacer horas extra negativas");
            return 0.0;
        }
        return h_extra * HORAS_EXTRA;
    }

    public double sueldoBruto() {
        return sueldo_base + horasExtra();
    }

    public double calcIrpf() {
        return sueldoBruto() * irpf;
    }

    public double sueldoNeto() {
        return sueldoBruto() - calcIrpf();
    }

    public void setSueldo_base(Double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public void setH_extra(Double h_extra) {
        this.h_extra = h_extra;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIrpf(Double irpf) {
        this.irpf = irpf;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSueldo_base() {
        return sueldo_base;
    }

    public Double getH_extra() {
        return h_extra;
    }

    public Double getIrpf() {
        return irpf;
    }

    @Override
    public String toString() {
        return "Asalariado{" + "dni=" + dni + ", nombre=" + nombre + ", sueldo base=" + sueldo_base + ", horas extra=" + h_extra + ", IRPF=" + irpf + ", Precio horas extra=" + HORAS_EXTRA + '}';
    }
}
