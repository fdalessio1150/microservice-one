package br.com.application.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceThreeFallback implements ServiceThree {
    @Override
    public String callServiceThree(Long time) {
        return "Fallback do serviço 3 ativado.";
    }
}
