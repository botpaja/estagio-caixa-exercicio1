package projeto_estagio_caixa_exercicio1.main;
import projeto_estagio_caixa_exercicio1.classes.Garcon;
import projeto_estagio_caixa_exercicio1.classes.Mesa;
import projeto_estagio_caixa_exercicio1.classes.Pedido;
import projeto_estagio_caixa_exercicio1.classes.Prato;

public class Main {

	public static void main(String[] args) {
		Garcon garcon1 = new Garcon("Marcio");
		Garcon garcon2 = new Garcon("Mario");
		Garcon garcon3 = new Garcon("Mauricio");
		
		Mesa mesa1 = new Mesa(1);
		Mesa mesa2 = new Mesa(2);
		Mesa mesa3 = new Mesa(3);
		
		Prato prato1 = new Prato(1, "Bife");
		Prato prato2 = new Prato(2, "Feijoada");
		Prato prato3 = new Prato(1, "Omelete");
		
		Pedido pedido1 = new Pedido(1, garcon1, mesa1, prato1);
		Pedido pedido2 = new Pedido(2, garcon3, mesa3, prato3);
		Pedido pedido3 = new Pedido(3, garcon2, mesa2, prato2);
		
		pedido1.imprimir_Pedido();
		pedido2.imprimir_Pedido();
		pedido3.imprimir_Pedido();

	}

}
