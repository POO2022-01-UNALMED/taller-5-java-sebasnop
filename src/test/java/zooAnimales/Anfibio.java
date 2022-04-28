package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private String colorPiel;
	private boolean venenoso;
	
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        setTotalAnfibios(1);
    }
	
	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero){
        String colorPiel = "rojo";
        Boolean venenoso = true;
        String habitat = "selva";
        Anfibio rana = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        listado.add(rana);
        
        ranas++;
        
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
    	
        String colorPiel = "negro y amarillo";
        Boolean venenoso = false;
        String habitat = "selva";

        Anfibio salamandra = new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
        listado.add(salamandra);
        salamandras++;
        return salamandra;
   }
	
	// Getters Setters
	
	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public int getSalamadras() {
		return salamandras;
	}

	public void setSalamadras(int salamadras) {
		Anfibio.salamandras = salamadras;
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
	
}
