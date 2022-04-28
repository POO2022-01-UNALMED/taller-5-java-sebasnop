package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona (String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona () {
		this(null,null);
	}
	
	public void agregarAnimales(Animal nuevo) {
		animales.add(nuevo);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	// Getters Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

}
