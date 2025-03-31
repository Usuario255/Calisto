package br.com.calisto.calistoapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/information")
    public String getInformation() {
        return new String("teste rota");
    }
}
