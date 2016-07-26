package Animal;

public class Cobra extends Animales  {

	public Cobra(int edad, String sexo, String nombre) {
		super(edad, sexo, nombre);
		mover();
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void mover()
	{
		System.out.println("Me arrastro con mi cuepo");
	}
	
}
