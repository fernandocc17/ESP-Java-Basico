package Animal;

public class Coralillo extends Animales  {

	public Coralillo(int edad, String sexo, String nombre) {
		super(edad, sexo, nombre);
		mover();
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void mover()
	{
		System.out.println("Me estoy arrastrando");
	}
	
}