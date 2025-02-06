package com.davi.dev.desafio_picpay.service;

import com.davi.dev.desafio_picpay.database.repository.ITransactionRepository;
import com.davi.dev.desafio_picpay.dto.TransferRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferService {

    private ITransactionRepository iTransactionRepository;

    public void createTransfer(TransferRequest transferRequest){

    }
}
