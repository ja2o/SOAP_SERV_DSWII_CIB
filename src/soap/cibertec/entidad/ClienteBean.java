package soap.cibertec.entidad;

public class ClienteBean {
	
	private int codigo;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private String password;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "ClienteBean [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
