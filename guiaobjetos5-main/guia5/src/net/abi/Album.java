package net.abi;

import java.util.Date;

public class Album {
    private Date publicacion;
    private String title;
    private Artista artista;

    public Album(Date publicacion, String title, Artista artista) {
        this.publicacion = publicacion;
        this.title = title;
        this.artista = artista;
    }
}
