package br.com.decimal.panda.web.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.decimal.panda.web.entity.Usuario;

@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		UsuarioService service = context.getBean(UsuarioService.class);
		service.save(new Usuario());
		
	}

}
