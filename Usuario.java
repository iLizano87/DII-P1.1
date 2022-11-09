package webPackage;

public class Usuario {

	String nombre;
	String pass;
	String pass2;

	public Usuario() {
	}

	public Usuario(String nombre, String pass, String pass2) {
		this.nombre = nombre;
		this.pass = pass;
		this.pass2 = pass2;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getPass() {
		return this.pass;
	}

	public String getPass2() {
		return this.pass2;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
}
