package com.davi.dev.desafio_picpay.database.repository;

import org.hibernate.Transaction;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

import java.util.UUID;

public interface ITransactionRepository extends JpaAttributeConverter<Transaction, UUID> {
}
