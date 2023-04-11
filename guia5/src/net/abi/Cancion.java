package net.abi;

public class Cancion {
    private String nombre;
    private int duracion;
    private String genre;
    private String artistaInvitado;

    public Cancion(String nombre, int duracion, String genre) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genre=" + genre +
                '}';
    }
}
