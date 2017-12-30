package de.rieckpil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${my.config.word}")
    private String wordFromConfigFile;

    @GetMapping("/")
    public String sayHello() {
        return wordFromConfigFile;
    }

}
