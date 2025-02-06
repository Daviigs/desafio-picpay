package com.davi.dev.desafio_picpay.database.model;

import com.davi.dev.desafio_picpay.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;
    private String password;
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType type;

    @Column(length = 11, unique = true)
    private String cpf;

    @Column(unique = true)
    private String email;


}
