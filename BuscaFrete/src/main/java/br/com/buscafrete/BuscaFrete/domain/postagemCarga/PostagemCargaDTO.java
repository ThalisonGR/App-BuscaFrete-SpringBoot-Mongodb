package br.com.buscafrete.BuscaFrete.domain.postagemCarga;

import java.math.BigDecimal;

public record PostagemCargaDTO(String origemCarga, String destinoCarga , BigDecimal pesoTonelada, BigDecimal valorFrete) {
}
