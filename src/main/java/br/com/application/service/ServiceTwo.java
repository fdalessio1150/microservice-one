package br.com.application.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SERVICE-TWO", url = "http://localhost:8081", fallback = ServiceTwoFallback.class)
public interface ServiceTwo {
    @RequestMapping(method = RequestMethod.GET, value = "/v1/work/{time}")
    public String callServiceTwo(@PathVariable("time") Long time);
}
