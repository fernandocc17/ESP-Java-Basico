import java.io.*;
public class Lectora {
static String cad; 

public static String leeCadena(){	
InputStreamReader tec=new InputStreamReader(System.in);
BufferedReader ent=new BufferedReader(tec);
try{
	cad=ent.readLine();
	}catch(IOException e){
	   System.out.println("Errores en la entrada...");	 
    }
   return cad;
	 }

public static int leeInt(){	
	int i=0;	
	leeCadena();
	try{  i=Integer.parseInt(cad);
	}catch(NumberFormatException e){	               
     System.out.println("Debe insertarse un Entero...");
 	}  return i; 
}	 

public static double leeDoble(){
	double d=0;	
	leeCadena();
	try{  d=Double.parseDouble(cad);
	}catch(NumberFormatException e){	  	System.out.println("insertar un real...");	 
   }  return d; 
} 


}   // fin clase





