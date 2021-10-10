package dad.maven.gson.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nombre;
		String apellidos;
		int edad;
		
		System.out.println("Introduzca el nombre: ");
		nombre = in.nextLine();
		
		System.out.println("Introduzca el apellido: ");
		apellidos = in.nextLine();
		
		System.out.println("Introduzca la edad: ");
		edad = in.nextInt();
		
		in.close();
		
		Persona p = new Persona(nombre, apellidos, edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		

	}

}
