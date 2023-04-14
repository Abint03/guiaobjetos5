package net.abi.interfaz;

import net.abi.Cancion;

public interface IReproduccion {
    public void reproducir();
    public void aniadirCancion(Cancion song);
    public void eliminarCancion();
    public void verMiLista();
}
