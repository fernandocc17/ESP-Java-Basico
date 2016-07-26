package Animal;

public class Raton extends Animales  {

	public Raton(int edad, String sexo, String nombre) {
		super(edad, sexo, nombre);
		mover();
	}
	

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Me estoy escabullendo");
	}
}