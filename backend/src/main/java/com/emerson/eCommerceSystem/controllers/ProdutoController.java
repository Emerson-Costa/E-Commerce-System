package com.emerson.eCommerceSystem.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emerson.eCommerceSystem.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> buscarTodasCategorias() {
        List<Produto> produtos = List.of(
                new Produto(1, "Computador", 2000.00),
                new Produto(2, "Impressora", 800.00),
                new Produto(2, "Mouse", 80.00));
        return produtos;
    }
}
