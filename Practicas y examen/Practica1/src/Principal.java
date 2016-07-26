import java.util.Scanner;

import movedor.Movedor;
import Animal.Ballena;
import Animal.Cobra;
import Animal.Coralillo;
import Animal.Persona;
import Animal.Raton;
import Motorizado.Automovil;
import Motorizado.Avion;
import Motorizado.Bicicleta;
import Motorizado.Moto;
import Motorizado.Triciclo;


public class Principal {

	static String nombre;
	static int radio;
	static int edad;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String goku = null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Que quieres crear?");
		goku=sc.next();
		System.out.println("Haz creado a "+ goku);
		Lista x=null;
		
		x=x.valueOf(goku);
			
		Movedor m=null; //Variable polimòrfica

		switch(x)
	{
		case PERSONA:
			System.out.println("Dame el nombre de la persona");
			nombre=sc.next();
			System.out.println("Dame la edad de la persona");
			edad=sc.nextInt();
			m=new Persona(edad,"Masculino",nombre);	
			
			break;

		case RATON:
			System.out.println("Dame el nombre del raton");
			nombre=sc.next();
			System.out.println("Dame la edad del raton");
			edad=sc.nextInt();
			m=new Raton(edad,"Masculino",nombre);
			break;
		case BALLENA:
			System.out.println("Dame el nombre de la ballena");
			nombre=sc.next();
			System.out.println("Dame la edad de la ballena");
			edad=sc.nextInt();
			m=new Ballena(edad,"Masculino",nombre);
			break;
			
		case CORALILLO:
			System.out.println("Dame el nombre del coralillo");
			nombre=sc.next();
			System.out.println("Dame la edad del coralillo");
			edad=sc.nextInt();
			m=new Coralillo(edad,"Masculino",nombre);
			break;
			
		case COBRA:
			System.out.println("Dame el nombre de la cobra");
			nombre=sc.next();
			System.out.println("Dame la edad de la cobra");
			edad=sc.nextInt();
			m=new Cobra(edad,"Masculino",nombre);
			break;
			
		case MOTO:
			System.out.println("Dame el radio : ");
			radio=sc.nextInt()	;
			m=new Moto(radio);
			
			break;
		
		case TRICICLO:
			System.out.println("Dame el radio : ");
			radio=sc.nextInt();
			m=new Triciclo(radio);
			
			break;
			
		case BICICLETA:
			System.out.println("Dame el radio : ");
			radio=sc.nextInt();
			m=new Bicicleta(radio);
			
			break;
			
		case AVION:
			System.out.println("Dame el radio : ");
			radio=sc.nextInt();
			m=new Avion(radio);
			
			break;
			
		case AUTOMOVIL:
			System.out.println("Dame el radio : ");
			radio=sc.nextInt();
			m=new Automovil(radio);
			
			break;
	}

	}

}
