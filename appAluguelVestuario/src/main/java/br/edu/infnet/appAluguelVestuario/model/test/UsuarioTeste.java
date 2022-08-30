package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.controller.UsuarioController;
import br.edu.infnet.appAluguelVestuario.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("admin@admin.com");
		usuario.setNome("Administrador");
		usuario.setSenha("123");
		
		UsuarioController.incluir(usuario);
		
	}

}
