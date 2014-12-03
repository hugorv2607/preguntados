package unlam.tp_preguntados.cliente.core;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	private Socket socket;

	
	public void connect(int port){
		try {
			socket = new Socket("localhost", port);
			System.out.println("Se conecto exitosamente");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void send(String text) throws IOException{
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF(text);
	}
	
	
	public void send(Object object) throws IOException{
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		out.writeObject(object);
	}
	
	
	public static void main(String[] args) throws IOException {
Cliente cliente = new Cliente();
		
		cliente.connect(8888);
		
		cliente.send("Primer mensaje");
	}
}
