/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa3;

public class Nodo {
    Vehiculo vehiculo;
    Nodo next;

    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.next = null;
    }
}

