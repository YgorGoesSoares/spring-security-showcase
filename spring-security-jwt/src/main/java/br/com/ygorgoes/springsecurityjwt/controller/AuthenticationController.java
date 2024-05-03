package br.com.ygorgoes.springsecurityjwt.controller;

import br.com.ygorgoes.springsecurityjwt.entities.AuthenticationRequest;
import br.com.ygorgoes.springsecurityjwt.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthenticationRequest authentication) {
        return authenticationService.authenticate(authentication);
    }

}
