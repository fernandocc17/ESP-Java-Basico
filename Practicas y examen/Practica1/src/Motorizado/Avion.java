package Motorizado;

public class Avion extends Ruedas{

	public Avion(int radio) {
		super(radio);
		mover();
		calcular();
	}
	
	final int num=8;

	@Override
	public void mover() {
		System.out.println("Vuelo por los aires!");
	}

	@Override
	public void calcular() {
		
		System.out.println("El area es: " + PI*radio*radio*num);
		
		// TODO Auto-generated method stub
		
	}

}

