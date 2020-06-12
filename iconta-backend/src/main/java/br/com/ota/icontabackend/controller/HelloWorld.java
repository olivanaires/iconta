package br.com.ota.icontabackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
	
	private static Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
	
	@GetMapping("/hello")
	public @ResponseBody String sayHello() {
	    LOG.info("GET called on /hello resource");
	    return "Hello Olivan!";
	}

}
