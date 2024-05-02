package br.com.ygorgoes.springsecurityjwt.repository;

import br.com.ygorgoes.springsecurityjwt.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String username);
}
