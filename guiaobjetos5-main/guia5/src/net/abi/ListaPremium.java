package net.abi;

import net.abi.interfaz.IReproduccion;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium implements IReproduccion {
    private String nombre;
    private LinkedList miLista;

    @Override
    public void reproducir() {
        int i=0;
        while(miLista.size()>0){
            System.out.println("[i] "+miLista.get(i));
            i++;
        }
        System.out.println("Ingrese el indice de la cancion a reproducir");
        Scanner scan=new Scanner(System.in);
        int resp=scan.nextInt();
        miLista.get(resp-1);
    }

    @Override
    public void aniadirCancion(Cancion song) {
        miLista.addLast(song);
    }

    @Override
    public void eliminarCancion() {
        int i=0;
        while(miLista.size()>0){
            System.out.println("[i] "+miLista.get(i));
            i++;
        }
        System.out.println("Ingrese el indice de la cancion a reproducir");
        Scanner scan=new Scanner(System.in);
        int resp=scan.nextInt();
        miLista.remove(miLista.get(resp-1));
    }

    @Override
    public void verMiLista() {
        int i=0;
        while(miLista.size()>0){
            System.out.println("[i] "+miLista.get(i));
        }
    }


}
