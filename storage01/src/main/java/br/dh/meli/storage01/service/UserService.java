package br.dh.meli.storage01.service;

import br.dh.meli.storage01.model.UserBD;
import br.dh.meli.storage01.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
// Classe que vai fazer o uso do repositório para entregar para o Controller o serviço que irá disponibilizar
public class UserService {

    @Autowired
    private UserRepo repo;

    // PUT
    public UserBD insert(UserBD userBD) {
        UserBD newUser = repo.save(userBD);
        return  newUser;
    }

    // GET
    public Optional<UserBD> find (long cod) {
        return repo.findById(cod);
    }

    // PUT
    public UserBD update(UserBD userBD) {
        return repo.save(userBD);
    }

    // DELETE
    public void delete(long cod) {
        repo.deleteById(cod);
    }

}