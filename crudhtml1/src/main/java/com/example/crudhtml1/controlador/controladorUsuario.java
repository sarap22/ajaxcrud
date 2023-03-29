package com.example.crudhtml1.controlador;
import com.example.crudhtml1.modelo.usuario;
import com.example.crudhtml1.servicio.metodoUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class controladorUsuario {
    metodoUsuario mU= new metodoUsuario();
    @GetMapping("/verlista")
        public ArrayList<usuario> lista(){
            return mU.getLista();
    }
    @PostMapping("/anadir")
    public String agregar(@RequestBody usuario u){
        return mU.añadir(u);
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam int doc){
        return mU.eliminar(doc);
    }
}
