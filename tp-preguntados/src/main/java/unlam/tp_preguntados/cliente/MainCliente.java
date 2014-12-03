package unlam.tp_preguntados.cliente;

import java.io.IOException;

import unlam.tp_preguntados.cliente.core.Cliente;


public class MainCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.connect(8888);
		
		try {
			cliente.send("Primer mensaje");
			//cliente.send(new DataLogin("pepe", "1234"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
