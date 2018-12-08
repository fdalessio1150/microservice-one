package br.com.application.service;

import br.com.application.model.Client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceTwoFallback implements ServiceTwo {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
		
	@Override
	public String callServiceTwoClients(Client client) throws InterruptedException {
	    Thread.sleep(400);
    	logger.warn("Fallback ativado - callServiceTwoClients.");
        return "Fallback do serviço 2 ativado - Clients.";
	}
	
    @Override
    public String callServiceTwo(Long time, Client client) {
    	logger.warn("Fallback ativado - callServiceTwo.");
        return "Fallback do serviço 2 ativado.";
    }

	@Override
	public String callServiceTwoList(Long time, List<Client> client) {
    	logger.warn("Fallback ativado - callServiceTwoList.");
		return "Fallback do serviço 2 ativado - lista.";
	}

}
