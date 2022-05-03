package zooAnimales;

import java.util.ArrayList;

public class Anfibio  extends Animal{
	
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public  static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
        setTotalAnfibios(1);
       
			
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        setTotalAnfibios(1);
       
    }
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		this.ranas = ranas;
	}

	public int getSalamadras() {
		return salamandras;
	}

	public void setSalamadras(int salamadras) {
		this.salamandras = salamadras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
		
	public String movimiento() {
		return "saltar";
		
	}

	
	public static Anfibio crearRana(String nombre,int edad,String genero){
        ranas ++;

        String colorPiel = "rojo";
        Boolean venenoso = true;
        String habitat = "selva";
        Anfibio rana = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        listado.add(rana);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
        salamandras ++;
        
        String colorPiel = "negro y amarillo";
        Boolean venenoso = false;
        String habitat = "selva";

        Anfibio salamandra = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        listado.add(salamandra);
        return salamandra;
       
   }
	
}