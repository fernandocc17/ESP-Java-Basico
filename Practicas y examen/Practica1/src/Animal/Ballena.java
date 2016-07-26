package Animal;


public class Ballena extends Animales  {

	public Ballena(int edad, String sexo, String nombre) {
		super(edad, sexo, nombre);
		mover();
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void mover()
	{
		System.out.println("Estoy nadando en el oceano");
	}
	
}