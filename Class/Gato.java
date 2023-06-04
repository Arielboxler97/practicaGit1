package Class;
//{}
public class Gato{

	private String nombre;
	private int patas;
	private String color;

	public Gato(){}

	public Gato(String nombre, int patas, String color){
		this.nombre = nombre;
		this.patas = patas;
		this.color = color;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getPatas(){
		return patas;
	}

	public void setPatas(int patas){
		this.patas = patas;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	@Override
	public String toString(){
		return "Gato {" + "Nombre = " + nombre + " Patas = " + patas + " Color = " + color + " }";
	}

}