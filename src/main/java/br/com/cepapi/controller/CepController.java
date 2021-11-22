package br.com.cepapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cepapi.model.Endereco;
import br.com.cepapi.service.CepService;

@RestController
@RequestMapping("/")
public class CepController {
    
    @Autowired
    private CepService service;

    @GetMapping(value = "{cep}")
    private ResponseEntity<Endereco> getCep(@PathVariable("cep") String cep) {
        Endereco endereco = service.findCep(cep);
        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
}
