package com.davi.dev.desafio_picpay.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferRequest {

    private BigDecimal value;
    private UUID payer;
    private UUID payee;
}
