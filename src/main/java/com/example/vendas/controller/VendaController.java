package com.example.vendas.controller;

import com.example.vendas.service.SnsService;
import com.example.vendas.web.request.VendaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private SnsService snsService;

    @PostMapping
    public String novaVenda(@RequestBody VendaRequest vendaRequest) {

        System.out.println(vendaRequest);

        snsService.publishProductEvent(vendaRequest);

        return "Venda feita com sucesso!";
    }

}
