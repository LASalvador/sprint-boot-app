package br.gov.sp.fatec.sprintapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.sprintapp.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
