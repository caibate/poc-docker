package com.docker.demodocker.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/docker")
    public String index(){
        return "Teste Docker";
    }
}
