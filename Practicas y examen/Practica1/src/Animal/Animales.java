package Animal;
import movedor.Movedor;


public abstract class Animales implements Movedor {

	public Animales(int edad, String sexo, String nombre) {
		super();
		setEdad(edad);
		setSexo(sexo);
		setNombre(nombre);
	}
	
	public int edad;
	public String sexo;
	public String nombre;  //atributos
	
	
	
	
	abstract public void mover(); 
	
	public void setNombre(String nombre) //Asigna
	{
		this.nombre=nombre;
	}
	
	public String getNombre() //Devuelve
	{
		return nombre;
	}
	
	public boolean setEdad(int edad)
	{
		
		if (edad>=0)
		{
		this.edad=edad;
		return true;
		}
		else 
			return false;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	
	public String getSexo(String sexo)
	{
		return sexo;
	}

	public void respirar()
	{}
	public void comer(){}
	
	
	
	
	}


