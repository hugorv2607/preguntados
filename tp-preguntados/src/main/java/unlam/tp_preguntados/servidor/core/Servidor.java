package unlam.tp_preguntados.servidor.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	private ServerSocket serverSocket;
	private int port;
	
	public Servidor(int port) {
		this.port = port;
	}
	
	public void start(){
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Escuchando en el puerto: " + port);
			
			while (true){
				Socket clienteSocket = serverSocket.accept();				
				System.out.println("Se conecto un socket");	
				
				new AdmistradorCliente(clienteSocket).run();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
