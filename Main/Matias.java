package Main;
// javac Main\Matias.java Class\Perro.java
import Class.Perro;
import Class.Gato;
import java.util.ArrayList;
import java.util.Scanner;
import static service.ServiceAnimales.*;
public class Matias{

	public static void main(String[] args){
		
		System.out.println("Hola Mundo");
		
		crearAnimal();

		/*ArrayList<Gato> gatos = new ArrayList();
		gatos.add(crearGato());
		gatos.add(crearGato());
		gatos.add(crearGato());
		ArrayList<Perro> perros = new ArrayList();
		perros.add(crearPerro());
		perros.add(crearPerro());
		perros.add(crearPerro());		
		System.out.println(perros);

		for(Perro perrin : perros){
			System.out.println(perrin);
		}
		for(Gato gatito : gatos){
			System.out.println(gatito);
		}*/
	}

	static Gato crearGato(){
		Scanner leer = new Scanner(System.in);
		Gato gatito = new Gato();
		System.out.println("Cual es el nombre de el gato ?");
		gatito.setNombre(leer.next());
		System.out.println("Cuantas patas tiene el gato ? ");
		gatito.setPatas(leer.nextInt());
		System.out.println("De que color es el gato ?");
		gatito.setColor(leer.next());
		return gatito;
	}
	static Perro crearPerro(){
		Scanner leer = new Scanner(System.in);
		Perro perrin = new Perro();

		System.out.println("Ingrese el nombre de el perro");
		perrin.setNombre(leer.next());
		System.out.println("Cuantas patas tiene tu perro ?");
		perrin.setPatas(leer.nextInt());
		leer.nextLine();
		System.out.println("De que color es tu perro ?");
		perrin.setColor(leer.next());
	
		return perrin;
	}
}



