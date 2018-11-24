package br.com.application.service;

import br.com.application.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceTwoFallback implements ServiceTwo {
    @Override
    public String callServiceTwo(Long time, Client client) {
        return "Fallback do serviço 2 ativado.";
    }

	@Override
	public String callServiceTwoList(Long time, List<Client> client) {
		return "Fallback do serviço 2 ativado - lista.";
	}
}
