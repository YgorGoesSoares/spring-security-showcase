package br.com.ygorgoes.springsecurityjwt.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("TB_USERS")
public class User {
    @Id
    private String username;
    private String password;
}
