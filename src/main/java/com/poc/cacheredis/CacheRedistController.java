package com.poc.cacheredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CacheRedistController {

    @Autowired
    CacheRedisRepository cacheRedisRepository;

    @GetMapping("/armazenar/{numero}")
    @ResponseStatus(HttpStatus.CREATED)
    public Dados armazenarNumero(@PathVariable String numero){
        return cacheRedisRepository.armazenarNumero(numero);
    }

    @GetMapping("/limpar")
    @ResponseStatus(HttpStatus.OK)
    public String limparTudo(){
        cacheRedisRepository.limparTudo();
        return "OK";
    }

    @GetMapping("/limpar/{numero}")
    @ResponseStatus(HttpStatus.OK)
    public String limpar(@PathVariable String numero){
        cacheRedisRepository.limpar(numero);
        return "OK";
    }
}
