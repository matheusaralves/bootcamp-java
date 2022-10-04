package br.com.dh.spring01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping(path = "/{name}") // /Matheus
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping(path = "/nome") // /nome?nome=Matheus
    public String helloRequestParam(@RequestParam (name = "name") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping (path = "{name}/{lastname}/{age}")
    public String helloParam(@PathVariable String name,
                             @PathVariable String lastname,
                             @PathVariable Integer age) {
        return ("Hello, " + name + " " + lastname + ". You are: " + age + " years old.");
    }

}
