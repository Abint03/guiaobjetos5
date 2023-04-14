package net.abi;

public class Cancion {
    private String nombre;
    private int duracion;
    private String genero;
    private Artista featuring;
    private Album album;


    public Cancion(String nombre, int duracion, String genre,Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genre;
        this.album=album;
    }
    public Cancion(String nombre, int duracion, String genre,Album album, Artista featuring) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genre;
        this.album=album;
        this.featuring=featuring;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genre=" + genero +
                '}';
    }
}
