package net.abi;

public class Album {
    private int publicacion;
    private String title;
    private Artista artista;

    public Album(int publicacion, String title, Artista artista) {
        this.publicacion = publicacion;
        this.title = title;
        this.artista = artista;
    }
}
