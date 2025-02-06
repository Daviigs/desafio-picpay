package com.davi.dev.desafio_picpay.database.repository;

import com.davi.dev.desafio_picpay.database.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUsersRepository extends JpaRepository<Users, UUID> {
}
