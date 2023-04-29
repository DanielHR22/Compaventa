/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa3;


public class Factura {
    public Vehiculo vehiculo;

    public Factura(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String imprimir() {
        
        return "Vehiculo: " + "\n Marca: " + vehiculo.getMarca() + "\n Modelo: " + vehiculo.getModelo() + "\n Año: " + vehiculo.getAnio() + "\n Precio: $" + vehiculo.getPrecio();
    }
}
