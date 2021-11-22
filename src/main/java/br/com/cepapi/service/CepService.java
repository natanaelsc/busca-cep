package br.com.cepapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.cepapi.model.Endereco;
import reactor.core.publisher.Mono;

@Service
public class CepService {
    
    @Autowired
    private WebClient client;

    public Endereco findCep(String cep) {
        Mono<Endereco> monoEndereco = this.client
            .method(HttpMethod.GET) // ou get()
            .uri("/{cep}/json", cep)
            .retrieve()
            .bodyToMono(Endereco.class);
        return monoEndereco.block();
    }
}
