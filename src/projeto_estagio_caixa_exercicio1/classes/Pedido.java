package projeto_estagio_caixa_exercicio1.classes;
public class Pedido {
	
	private int numeroPedido;
	private Garcon garcon;
	private Mesa mesa;
	private Prato prato;
	
	public Pedido(int numeroPedido, Garcon garcon, Mesa mesa, Prato prato) {
		this.numeroPedido = numeroPedido;
		this.garcon = garcon;
		this.mesa = mesa;
		this.prato = prato;
	}
	
	public void imprimir_Pedido() {
		System.out.println("Pedido "+numeroPedido+" - Garcon: "+garcon.getNomeGarcon()+", Mesa: "+mesa.getNumeroMesa()+", Prato: "+prato.getNomePrato());
	}
}
