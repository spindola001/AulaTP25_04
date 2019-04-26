package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Marcos Davi");
		
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Rua Alvorada");
		
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Vila Nova Curuça");
		
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(3804170);
		
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("São Paulo");
		
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("São Paulo");
		
		System.out.println(pessoa.getEstado());
	}

}
