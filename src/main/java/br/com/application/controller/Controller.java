package br.com.application.controller;

import br.com.application.model.Client;
import br.com.application.service.ServiceThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.application.service.ServiceTwo;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private final ServiceTwo serviceTwo;

    @Autowired
    private final ServiceThree serviceThree;

    public Controller (ServiceTwo serviceTwo, ServiceThree serviceThree) {
        this.serviceTwo = serviceTwo;
        this.serviceThree = serviceThree;
    }

    @RequestMapping(value = "/v1/call-service-two/{time}", method = RequestMethod.POST)
    public String callServiceTwo(@PathVariable Long time, @RequestBody Client client) {
        return serviceTwo.callServiceTwo(time, client);
    }
    
    @RequestMapping(value = "/v1/call-service-two-list/{time}", method = RequestMethod.POST)
    public String callServiceTwoList(@PathVariable Long time, @RequestBody List<Client> clientList) {
        return serviceTwo.callServiceTwoList(time, clientList);
    }

    @RequestMapping(value = "/v1/call-service-three/{time}", method = RequestMethod.GET)
    public String callServiceThree(@PathVariable Long time) {
        return serviceThree.callServiceThree(time);
    }

}
