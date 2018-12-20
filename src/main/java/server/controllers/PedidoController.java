package server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import server.daos.PedidoDAO;
import server.models.Carrinho;
import server.models.Pedido;
import server.models.StatusPedido;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PedidoController {
	
		@Autowired
		private Carrinho carrinho;
		@Autowired
		private PedidoDAO pedidoDAO;

		@RequestMapping(value="/pedido/criar", method=RequestMethod.POST)
		public ModelAndView cria(Pedido pedido) {
			ModelAndView modelAndView = new ModelAndView("/pedido/confirmado"); 
			
			pedido.setStatus(StatusPedido.COZINHA);
			pedido.setProdutos(carrinho.get());
			
			System.out.println(pedido);
			
			pedidoDAO.save(pedido);
			
			return modelAndView;
			}
		}

