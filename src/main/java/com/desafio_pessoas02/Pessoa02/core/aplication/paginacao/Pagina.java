package com.desafio_pessoas02.Pessoa02.core.aplication.paginacao;

import java.util.List;

public record Pagina<T>(
        List<T> conteudo,
        int pagina,
        int tamanho,
        long totalElementos,
        int totalPaginas
) {}
