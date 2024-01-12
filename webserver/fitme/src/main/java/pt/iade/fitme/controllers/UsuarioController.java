package pt.iade.fitme.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.fitme.models.Usuario;
import pt.iade.fitme.models.repositories.UsuarioRepository;


@RestController
@RequestMapping(path = "/api/usuario")
// UserController.java
public class UsuarioController {
private Logger logger =  LoggerFactory.getLogger(UsuarioController.class);
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Usuario> getAll() {
        logger.info("Sending all users");
        return usuarioRepository.findAll();
    }


}