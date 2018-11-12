package br.com.application.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SERVICE-THREE", url = "http://localhost:8082", fallback = ServiceThreeFallback.class)
public interface ServiceThree {
    @RequestMapping(method = RequestMethod.GET, value = "/v1/work/{time}")
    public String callServiceThree(@PathVariable("time") Long time);
}
