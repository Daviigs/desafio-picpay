package com.davi.dev.desafio_picpay.controller;


import com.davi.dev.desafio_picpay.dto.UsersRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    public ResponseEntity<Void> createUser(@RequestBody UsersRequest userRequest){
        return new ResponseEntity<>(HttpStatus.CREATED)

    }
}
