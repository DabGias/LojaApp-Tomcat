package br.com.fiap.resource;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/nomes")
public class PessoaResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[][] listar() {
		String[][] nomes = new String[5][3];
		nomes[0][0] = "Luís";
		nomes[0][1] = "123456789-10";
		nomes[0][2] = "luis@fiap.com.br";
		
		nomes[1][0] = "Gabriel";
		nomes[1][1] = "123456789-10";
		nomes[1][2] = "gabriel@fiap.com.br";
		
		nomes[2][0] = "Allanis";
		nomes[2][1] = "123456789-10";
		nomes[2][2] = "allanis@fiap.com.br";
		
		nomes[3][0] = "Mateus";
		nomes[3][1] = "123456789-10";
		nomes[3][2] = "mateus@fiap.com.br";
		
		nomes[4][0] = "Lucas";
		nomes[4][1] = "123456789-10";
		nomes[4][2] = "lucas@fiap.com.br";
		
		return nomes;
	}
}
