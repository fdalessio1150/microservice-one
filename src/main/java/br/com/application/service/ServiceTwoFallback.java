package br.com.application.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceTwoFallback implements ServiceTwo {
    @Override
    public String callServiceTwo(Long time) {
        return "Fallback do serviço 2 ativado.";
    }
}
