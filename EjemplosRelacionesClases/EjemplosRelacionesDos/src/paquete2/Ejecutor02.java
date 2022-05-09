/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        // 1. Crear una persona de barrio Valle de la ciudad de Loja
        // 2. Crear una persona de barrio Central de la ciudad de Cuenca
        // 3. Crear una persona de barrio Centenario de la ciudad de Guayaquil
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");

        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);

        Persona persona1 = new Persona("Piero Hincapié", "1102988910", barrio1);
        Persona persona2 = new Persona("Byron Castillo", "1103759432", barrio2);
        Persona persona3 = new Persona("Gonzalo Plata", "1154739865", barrio3);
        
        persona1.establecerBarrio(barrio1);
        barrio1.establecerCiudad(ciudad1);

        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad de %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona2.establecerBarrio(barrio2);
        barrio2.establecerCiudad(ciudad2);

        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad de %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona3.establecerBarrio(barrio3);
        barrio3.establecerCiudad(ciudad3);

        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad de %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());

    }
}
