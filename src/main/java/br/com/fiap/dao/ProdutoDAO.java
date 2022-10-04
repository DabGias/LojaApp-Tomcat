package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.resource.ProdutoTO;

public class ProdutoDAO {
	public static List<ProdutoTO> produto;
	
	public ProdutoDAO() {
		if (produto == null) {
			produto = new ArrayList<ProdutoTO>();
			ProdutoTO pto = new ProdutoTO();
			
			pto.setCodigo(1);
			pto.setPreco(27.99);
			pto.setQuant(10);
			pto.setTitulo("Grampeador");
			produto.add(pto);
			
			pto.setCodigo(2);
			pto.setPreco(30.50);
			pto.setQuant(5);
			pto.setTitulo("Mouse Pad");
			produto.add(pto);
			
			pto.setCodigo(3);
			pto.setPreco(120.30);
			pto.setQuant(3);
			pto.setTitulo("Teclado");
			produto.add(pto);
			
			pto.setCodigo(4);
			pto.setPreco(90.99);
			pto.setQuant(3);
			pto.setTitulo("Mouse");
			produto.add(pto);
			
			pto.setCodigo(5);
			pto.setPreco(900.50);
			pto.setQuant(3);
			pto.setTitulo("Monitor");
			produto.add(pto);
		}
	}
	
	public List<ProdutoTO> select() {
		return produto;
	}
}
