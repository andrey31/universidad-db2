package com.database2.universidad.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.database2.universidad.models.UsuarioCrud;
import com.database2.universidad.models.entities.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsuarioController
 */
@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioCrud usuarioCrud;

    @GetMapping("/admin/{admin}")
    public Iterable<Usuario> findByAdmin(@PathVariable("admin") boolean admin){
        return usuarioCrud.findByAdmin(admin);
    }
    
    @PostMapping("/login")
    public void login(HttpServletResponse response, @RequestBody Usuario usuario)
            throws JsonProcessingException, IOException {

        Usuario u = usuarioCrud.findByUsuario(usuario.getUsuario());

        Map<String, Object> body = new HashMap<String, Object>();
        if (u != null){
            
            if (usuario.getContrasena().equals(u.getContrasena())){
                body.put("user", u);
                response.getWriter().write(new ObjectMapper().writeValueAsString(body));
                response.setStatus(200);
                response.setContentType("application/json");
    
            }else {
                body.put("info", "Contraseña incorrecta");
                response.getWriter().write(new ObjectMapper().writeValueAsString(body));
                response.setStatus(409);
                response.setContentType("application/json");
            }
        }else{
            body.put("info", "Usuario no existe");
            response.getWriter().write(new ObjectMapper().writeValueAsString(body));
            response.setStatus(404);
            response.setContentType("application/json");

        }
    }
    
    @GetMapping
    public Iterable<Usuario> findAllUser(){
        return usuarioCrud.findAll();
    }
    
}