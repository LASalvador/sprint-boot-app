package br.gov.sp.fatec.sprintapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.sprintapp.entity.Usuario;
import br.gov.sp.fatec.sprintapp.repository.UsuarioRepository;

@SpringBootTest
@Transactional
@Rollback
class SprintAppApplicationTests {
	@Autowired
	private UsuarioRepository usuarioRepo;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testaInsercao () {
		Usuario usuario = new Usuario();
		usuario.setNome("Lucas1");
		usuario.setSenha("1234");
		usuarioRepo.save(usuario);
		assertNotNull(usuario.getId());
		
	}
	
	@Test
	void testaAutorizacao () {
		 Usuario usuario = usuarioRepo.findById(1L).get();
         assertEquals("ROLE_ADMIN", usuario.getAutorizacoes().iterator().next().getNome());
	}

}
