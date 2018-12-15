package server.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

 
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class Carrinho {
	
	private List<Produto> carrinho = new ArrayList<>();
	
	public void add(Produto produto) {
		carrinho.add(produto);
		System.out.println("Adicionando o produto " + produto);
		System.out.println("Quantidade de itens no carrinho é " + carrinho.size());
	}
	
	public List<Produto> get() {
		return carrinho;
		
	}
}
