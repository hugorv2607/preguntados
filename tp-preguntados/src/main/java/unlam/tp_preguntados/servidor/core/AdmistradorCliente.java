package unlam.tp_preguntados.servidor.core;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class AdmistradorCliente implements Runnable{

	private Socket socket;
	
	public AdmistradorCliente(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {	
		try {
			this.readString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readString() throws IOException{
		DataInputStream in = new DataInputStream(socket.getInputStream());
		System.out.println(in.readUTF());
	}

}
