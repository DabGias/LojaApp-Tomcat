package br.com.fiap.resource;

import javax.ws.rs.Path;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.bo.ProdutoBO;

@Path("/produto")
public class ProdutoResource {
	private ProdutoBO pb = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar() {
		return pb.listar();
	}
}
