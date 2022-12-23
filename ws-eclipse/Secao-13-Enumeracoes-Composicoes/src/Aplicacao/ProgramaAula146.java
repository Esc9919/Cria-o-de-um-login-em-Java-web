package Aplicacao;

import java.util.Date;

import Entidades.Pedido;
import Entidades.enums.OrdemStatus;

public class ProgramaAula146 {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);

		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
