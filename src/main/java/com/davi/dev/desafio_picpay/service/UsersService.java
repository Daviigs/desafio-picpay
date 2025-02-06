package com.davi.dev.desafio_picpay.service;

import com.davi.dev.desafio_picpay.database.model.Users;
import com.davi.dev.desafio_picpay.database.repository.IUsersRepository;
import com.davi.dev.desafio_picpay.dto.UsersRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private IUsersRepository iUsersRepository;

    public void createUser(UsersRequest userRequest){
        iUsersRepository.save(Users.builder().build());

    }
}
