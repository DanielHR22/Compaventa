/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa3;

public class Lista {
    Nodo head;
    Nodo pointer;
    private int tamano;

    public void agregar(Vehiculo vehiculo) {
        Nodo nuevoNodo = new Nodo(vehiculo);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo ultimoNodo = obtenerUltimoNodo();
            ultimoNodo.next = nuevoNodo;
        }
        tamano++;
    }

    private Nodo obtenerUltimoNodo() {
        Nodo nodoActual = head;
        while (nodoActual.next != null) {
            nodoActual = nodoActual.next;
        }
        return nodoActual;
    }

    public Vehiculo obtener(int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("El numero dado está fuera de los límites de la lista");
        }

        Nodo nodoActual = head;
        for (int i = 0; i < indice; i++) {
            nodoActual = nodoActual.next;
        }

        return nodoActual.vehiculo;
    }

    public void imprimir() {
        Nodo nodoActual = this.head;
        while (nodoActual != null) {
            System.out.println(nodoActual.vehiculo.marca + " " + nodoActual.vehiculo.modelo + " " + nodoActual.vehiculo.anio + " " + nodoActual.vehiculo.precio);
            nodoActual = nodoActual.next;
        }
    }
}

