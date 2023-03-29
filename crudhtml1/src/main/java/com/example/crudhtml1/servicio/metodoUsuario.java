package com.example.crudhtml1.servicio;

import com.example.crudhtml1.modelo.usuario;

import java.util.ArrayList;
import java.util.Arrays;

public class metodoUsuario {
    private ArrayList<usuario> lista = new ArrayList<>();

    public ArrayList<usuario> getLista() {
        return lista;
    }
    public String añadir(usuario usuario){
        lista.add(usuario);
        return "Usuario añadido";
    }
    public String eliminar(int doc){
        if(Arrays.asList(lista).contains(doc)){
            lista.remove(lista.indexOf(doc));
        }
        return "Eliminado";
    }
}
