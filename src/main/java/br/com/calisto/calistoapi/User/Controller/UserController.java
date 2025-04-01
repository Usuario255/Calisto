package br.com.calisto.calistoapi.User.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @GetMapping("/information")
    public String getInformation() {
        return new String("teste rota");
    }
}
