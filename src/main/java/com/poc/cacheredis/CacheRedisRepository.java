package com.poc.cacheredis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheRedisRepository {
    @Cacheable("numero")
    public Dados armazenarNumero(String numero) {
        Dados dado = new Dados();
        dado.setNome("Nome Qualquer");
        dado.setIdade("Qualquer");
        dado.setNumeroReferencia(numero);

        System.out.println("cache do numero " + numero);
        return dado;
    }

    @CacheEvict(value = "numero", allEntries = true)
    public void limparTudo() {
        System.out.println("limpou tudo");
    }

    @CacheEvict(value = "numero")
    public void limpar(String numero) {
        System.out.println("limpou " + numero);
    }
}
