package br.com.decimal.panda.web.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.decimal.panda.web.entity.Categoria;

@Configuration
@ComponentScan
public class Application {

	

	public static void main(String[] args) {

		//UsuarioService service = context.getBean(UsuarioService.class);
		//service.inserir(new Usuario());
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		CategoriaService service = context.getBean(CategoriaService.class);
		
		Categoria categoria = new Categoria();
		categoria.setDescricao("BEBIDA");
		categoria.setSituacao(1L);
		
		service.inserir(categoria);

	}
}
