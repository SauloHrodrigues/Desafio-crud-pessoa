package com.desafio_pessoas02.Pessoa02.web.facades.Implementacao;

import com.desafio_pessoas02.Pessoa02.core.aplication.service.LogService;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import com.desafio_pessoas02.Pessoa02.web.facades.LogAplicationFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class LogFacadeImpl implements LogAplicationFacade {

    private final LogService logService;

    @Override
    public List<Log> getLogs() {
        return logService.getLogs();
    }
}
