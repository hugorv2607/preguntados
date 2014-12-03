package unlam.tp_preguntados.protocolo;

import java.io.Serializable;

public class DataLogin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String usuario, password;
	
	public DataLogin(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
