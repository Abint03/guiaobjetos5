import net.abi.Cancion;
import net.abi.Genero;
import net.abi.ListaBasica;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Cancion song=new Cancion("Ejemplo",4,Genero.ROCK);
        Cancion song2=new Cancion("Ejemplo2",3,Genero.CLASICA);
        Cancion song3=new Cancion("Ejemplo3",2,Genero.JAZZ);
        ArrayList<Cancion> listaCanciones=new ArrayList<>();
        listaCanciones.add(song);
        listaCanciones.add(song2);
        listaCanciones.add(song3);
        for(Cancion a: listaCanciones){
            System.out.println(a.toString());
        }
        Stack lb=new Stack<>();
        lb.addElement(song);
        lb.addElement(song2);
        lb.addElement(song3);
        ListaBasica listaB=new ListaBasica("Lista Basica",lb);
        listaB.reproducir();
    }
}