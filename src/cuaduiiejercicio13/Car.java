/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuaduiiejercicio13;

/**
 *
 * @author Samuel A
 */
public class Car 
{
    private String modelo;
    private int anio;
    private int velocidad;
    private boolean encendido;

    // ---------------- Constructor ----------------
    public Car(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
        this.encendido = false;
    }

    // ---------------- Métodos ----------------
    // 1. Encender el automóvil
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El automovil se ha encendido.");
        } else {
            System.out.println("El automovil ya esta encendido.");
        }
    }

    // 2. Apagar el automóvil
    public void apagar() {
        if (!encendido) {
            System.out.println("El automovil ya esta apagado.");
        } else if (velocidad == 0) {
            encendido = false;
            System.out.println("El automovil se ha apagado correctamente.");
        } else {
            System.out.println("No se puede apagar mientras el automovil esta en movimiento.");
        }
    }

    // 3. Acelerar
    public void acelerar(int incremento) {
        if (encendido) {
            if (incremento > 0) {
                velocidad += incremento;
                System.out.println("El automovil ha acelerado. Velocidad actual: " + velocidad + " km/h");
            } else {
                System.out.println("El incremento debe ser positivo.");
            }
        } else {
            System.out.println("No se puede acelerar. El automovil esta apagado.");
        }
    }

    // 4. Frenar
    public void frenar(int decremento) {
        if (encendido) {
            if (decremento > 0) {
                velocidad -= decremento;
                if (velocidad < 0) {
                    velocidad = 0;
                }
                System.out.println("El automovil ha frenado. Velocidad actual: " + velocidad + " km/h");
            } else {
                System.out.println("El decremento debe ser positivo.");
            }
        } else {
            System.out.println("No se puede frenar. El automovil esta apagado.");
        }
    }

    // 5. Mostrar estado (toString)
    @Override
    public String toString() {
        return "Modelo: " + modelo
                + "\nAllo: " + anio
                + "\nVelocidad: " + velocidad + " km/h"
                + "\nEstado: " + (encendido ? "Encendido" : "Apagado");
    }

    // Método adicional para imprimir estado
    public void imprimirEstado() {
        System.out.println("------------------------------");
        System.out.println(this.toString());
        System.out.println("------------------------------");
    }
    
    
}
