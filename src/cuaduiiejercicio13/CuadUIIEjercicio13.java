/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuaduiiejercicio13;

/**
 *
 * @author Samuel A
 */
public class CuadUIIEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Car miAuto = new Car("Toyota ", 2022);

        // Estado inicial
        miAuto.imprimirEstado();

        // Intentar acelerar sin encender
        miAuto.acelerar(20);

        // Encender el auto
        miAuto.encender();
        miAuto.imprimirEstado();

        // Acelerar
        miAuto.acelerar(50);
        miAuto.imprimirEstado();

        // Frenar
        miAuto.frenar(30);
        miAuto.imprimirEstado();

        // Intentar apagar mientras está en movimiento
        miAuto.apagar();

        // Frenar completamente
        miAuto.frenar(20);
        miAuto.imprimirEstado();

        // Apagar correctamente
        miAuto.apagar();
        miAuto.imprimirEstado();
    
    }
    
}
