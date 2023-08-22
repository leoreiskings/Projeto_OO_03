package controllers;

import java.util.Scanner;
import entities.Produto;
import repositories.ProdutoRepositoryMySql;

public class ProdutoController {

	public void cadastrarProduto() throws Exception {

		System.out.println("\n*** CADASTRO DE PRODUTO ***\n");
		
		//@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		
		  /* System.out.print("INFORME O ID DO PRODUTO..........: ");
		   Integer idProduto = Integer.parseInt(scanner.nextLine());*/
		
		
		System.out.print("INFORME O NOME DO PRODUTO........: ");
		String nome = scanner.nextLine();
		
		System.out.print("INFORME O PREÇO DO PRODUTO.......: ");
		Double preco = Double.parseDouble(scanner.nextLine());
		
		System.out.print("INFORME A QUANTIDADE DO PRODUTO..: ");
		Integer quantidade = Integer.parseInt(scanner.nextLine());
		
		// criando uma variavel de instância para a classe Produto
		Produto produto = new Produto(nome, preco, quantidade);
		
		// imprimindo os dados do produto
		/*
		 * System.out.println("\nDADOS DO PRODUTO:"); System.out.println("ID.....: " +
		 * produto.getIdProduto()); System.out.println("NOME...: " + produto.getNome());
		 * System.out.println("PRECO..: " + produto.getPreco());
		 * System.out.println("QTD....: " + produto.getQuantidade());
		 */
		
		ProdutoRepositoryMySql produtoRepositoryMySql = new ProdutoRepositoryMySql();
		
		produtoRepositoryMySql.inserir(produto);
		
		System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");

	}

}
