import net.abi.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Artista art1=new Artista("Abi",19,"argentina");
        Artista art2=new Artista("Lauti",22,"argentina");
        Artista art3=new Artista("Seba",18, "boliviano");
        Album a1= new Album(new Date(2003,10,23),"AlbumUno",art1);
        Album a2= new Album(new Date(2000,12,13),"AlbumDos",art2);
        Album a3= new Album(new Date(2004,6,14),"AlbumTres",art3);

        Cancion song=new Cancion("Ejemplo",4,Genero.ROCK,a1);
        Cancion song2=new Cancion("Ejemplo2",3,Genero.CLASICA,a2);
        Cancion song3=new Cancion("Ejemplo3",2,Genero.JAZZ,a3);
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