package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.resource.ProdutoTO;

public class ProdutoBO {
	private ProdutoDAO pd;
	
	public List<ProdutoTO> listar() {
		pd = new ProdutoDAO();
		
		return pd.select();
	}
}
