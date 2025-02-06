package com.davi.dev.desafio_picpay.controller;

import com.davi.dev.desafio_picpay.dto.TransferRequest;
import com.davi.dev.desafio_picpay.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transfer")
public class TrasnferController {

    private final TransferService transferService;

    @PostMapping
    public ResponseEntity<Void> createTransfer(@RequestBody TransferRequest request){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
