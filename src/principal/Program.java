package principal;

import controllers.ProdutoController;

public class Program {

	public static void main(String[] args) {

		try {

			ProdutoController produtoController = new ProdutoController();

			produtoController.cadastrarProduto();

		} catch (Exception e) {
			System.out.println("Erro ao tentar cadastrar Produto!" + e.getMessage());
		}

	}

}
