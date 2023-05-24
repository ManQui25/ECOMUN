package abstractas;

public abstract class Entidad {

	String _nombre;
	String _telContacto;
	
	public void setNombre(String nombre) {
		this._nombre = nombre;
	}
	
	public String getNombre() {
		if (this._nombre != null) {
			return this._nombre;
		}
		else {
			return new String("!");
		}
	}
	
	
	
	
	public void setTel(String numero) {
		this._telContacto = numero;
	}
	
	public String getTel() {
		if (this._telContacto != null) {
			return this._telContacto;
		}
		else {
			return new String("!");
		}
	}
}
