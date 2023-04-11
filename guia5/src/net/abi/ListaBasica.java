package net.abi;

import net.abi.interfaz.IReproduccion;

import java.util.Scanner;
import java.util.Stack;

public class ListaBasica implements IReproduccion {
    private String nombre;
    private Stack miLista;
    private Stack aux;

    public ListaBasica(String nombre, Stack miLista) {
        this.nombre = nombre;
        this.miLista = miLista;
    }

    @Override
    public void reproducir() {
        while (!miLista.empty()) {
            miLista.peek().toString();
            aux.addElement(miLista.pop());
        }
        while(!aux.empty()){
            miLista.addElement(aux.pop());
        }
    }

    @Override
    public void aniadirCancion(Cancion song) {
        miLista.addElement(song);
    }

    @Override
    public void eliminarCancion() {
       /* int i=0;
        while(!miLista.empty()){
            System.out.println("[i] "+miLista.peek());
        }
        System.out.println("Ingrese el indice de la cancion a eliminar");
        Scanner scan=new Scanner(System.in);
        int resp=scan.nextInt();
        for(int j=0;j<resp;j++){
            aux.addElement(miLista.pop());
        }
        aux.pop();
        while(!aux.empty()){
            miLista.addElement(aux.pop());
        }*/
        System.out.println("PARA ACCEDER A ESTAS OPCIONES COMPRE PACK PREMIUM");
    }

    @Override
    public void verMiLista() {

    }

}
