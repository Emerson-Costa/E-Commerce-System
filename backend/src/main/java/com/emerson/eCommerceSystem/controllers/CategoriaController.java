package com.emerson.eCommerceSystem.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emerson.eCommerceSystem.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping
    public List<Categoria> buscarTodasCategorias() {
        List<Categoria> categorias = List.of(
                new Categoria(1, "Informática"),
                new Categoria(2, "Escritório"));
        return categorias;
    }
}
