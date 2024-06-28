package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem (String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		itemList.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		if (!itemList.isEmpty()) {
			for (Item item : itemList) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		
		compras.adicionarItem("Celular", 1200, 2);
		compras.adicionarItem("Notebook",3000, 7);
		compras.calcularValorTotal();
		System.out.println(compras.calcularValorTotal());
		compras.exibirItens();
		
		
	}
	
	
	
	
	
}
	

	


































