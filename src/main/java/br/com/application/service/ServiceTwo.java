package br.com.application.service;

import br.com.application.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "SERVICE-TWO", url = "http://localhost:8081", fallback = ServiceTwoFallback.class)
public interface ServiceTwo {
    @RequestMapping(method = RequestMethod.POST, value = "/v1/work/{time}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String callServiceTwo(@PathVariable("time") Long time, Client client);
    
    @RequestMapping(method = RequestMethod.POST, value = "/v1/work-list/{time}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String callServiceTwoList(@PathVariable("time") Long time, List<Client> client);
}
