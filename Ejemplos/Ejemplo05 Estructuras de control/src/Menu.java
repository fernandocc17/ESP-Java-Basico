public class Menu {

	public double promedio (int cantidad){
		double arreglo []=new double [cantidad];
		double pro;
		double acumulador=0;
				
		int indice=0;
		
		
		while (indice<cantidad){
			System.out.println("Dame la nota: "+(indice +1));
			arreglo[indice]=Lectora.leeDoble();
			indice++;
			
		}
		indice=0;
		
		while (indice<cantidad){
			
			acumulador+=arreglo[indice];
			
			indice++;
			
		}
		
		
		pro=acumulador/cantidad;
		return pro;
	}
	
	public void mostrar(){
		System.out.println("BIENVENIDO A LA TIENDA CHAFA de APPLE");
		int opc,cant;
		do{
			System.out.println("1)Ipad ");
			System.out.println("2)Ipod ");
			System.out.println("3)Mac book air \n 4)Mac Pro ");
			System.out.println("5)SALIR!");
			System.out.println("6)SALIR!");
			opc=Lectora.leeInt();
			
			
			switch (opc){
			
			case 1: System.out.println("FELICIDADES TIRASTE 500 dolaresa a la basura");
					break;
	
			case 2:System.out.println("FELICIDADES ESTO SI PARECE ALGO DE APPLE");
					break;
			
			case 3:System.out.println("TE estafaron");
					break;
			
			case 4:System.out.println("Seleccionaste el mejor articulo de tu vida");
					break;
			
			case 5: System.out.println("ADIOS!");
			
			case 6: System.out.println("Cuantas notas vas promediar?");
				cant=Lectora.leeInt();
				double acumulador=0,temporal;
				for (int i=0;i<cant;i++){
					System.out.println("Dane la nota:"+ (i+1) );
					temporal=Lectora.leeDoble();
					//acumulador+=temporal
					acumulador=acumulador+temporal;
				}
				
				System.out.println("El promedio es: "+ acumulador/cant);
			
			break;
			
			case 7: 
				 System.out.println("Cuantas notas vas promediar?");
					cant=Lectora.leeInt();
				 System.out.println("El promedio es: "+ promedio(cant) );
				 
				break;
			default: System.out.println("Opcion invalida");
			}
			
		}while(opc!=5);
		
		
		
	}
}
