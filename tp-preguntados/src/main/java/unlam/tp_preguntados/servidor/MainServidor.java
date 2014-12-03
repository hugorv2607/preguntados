package unlam.tp_preguntados.servidor;

import unlam.tp_preguntados.servidor.core.Servidor;


public class MainServidor {
	
	
	public static void main(String[] args) {
		new Servidor(8888).start();
	}
}
