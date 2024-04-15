package br.com.fiap.cinewave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{usuario.nome.notblank}")
    @Size(min = 3, message =  "{usuario.nome.size}")
    private String nome;

    @NotBlank(message = "{usuario.email.notblank}") @Email
    private String email;

    @NotBlank @Size(min = 6, max = 6, message = "{usuario.senha.size}")
    private String senha;

    
}
