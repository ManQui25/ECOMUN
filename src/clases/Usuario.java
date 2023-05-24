package clases;

import java.util.ArrayList;
import java.util.Random;

public class Usuario extends Entidad{
	String _informacionDePago;
	Region _region;
	ArrayList<Producto> _listaProductos = new ArrayList<Producto>();
	
	public void setInfPago(String infPago) {
		this._informacionDePago = infPago;
	}
	
	public String getInfPago() {
		return ((this._informacionDePago != null) ? 
				(this._informacionDePago) : (new String("!")));
	}
	
	
	
	public Boolean pagar() {		// para que varíe un tris le puse que el pago a veces pasara y a veces no
		Random rand = new Random();
		int i = rand.nextInt(6);
		
		return (i % 2 == 0);
	}
	
	public Boolean recibirPago(Producto producto) {		// el dinero es una ilusión
		return this.pagar();		
	}
	
	
	
	public void addToLista(Producto producto) {
		this._listaProductos.add(producto);
	}
	
	public void addToLista(Producto p1, Producto p2) {
		this._listaProductos.add(p1);
		this._listaProductos.add(p2);
	}
	
	public void addToLista(Producto p1, Producto p2, Producto p3) {
		this._listaProductos.add(p1);
		this._listaProductos.add(p2);
		this._listaProductos.add(p3);
	}
	
	
	public Boolean rmFromLista(Producto p) {
		Boolean valor = this._listaProductos.remove(p);
		return valor;
	}
	
	public Boolean rmFromLista(int indice) {
		Boolean valor = this._listaProductos.remove(indice);
		return valor;
	}
	
	
	
	public void setRegion(Region region) {
		this._region = region;
	}
}
