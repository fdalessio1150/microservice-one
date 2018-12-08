package br.com.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceThreeFallback implements ServiceThree {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Override
    public String callServiceThree(Long time) {
    	logger.warn("Fallback ativado - callServiceThree.");
        return "Fallback do serviço 3 ativado.";
    }
}
