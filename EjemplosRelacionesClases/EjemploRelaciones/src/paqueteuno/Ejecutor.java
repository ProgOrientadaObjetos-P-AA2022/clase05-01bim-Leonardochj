/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo = 440.2;
        UnidadDVD unidad = new UnidadDVD(marca, costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        //String variable_marca = computadora.obtenerTipoProcesador();
        //UnidadDVD variable_unidad = computadora.obtenerUnidadDvd();

        //System.out.printf("Computadora:\nProcesador: %s\n"
        //        + "Unidad de DVD: %s\n",
        //        variable_marca,
        //        variable_unidad.obtenerMarca());
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());

    }

}
