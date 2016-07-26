package Motorizado;

public class Bicicleta extends Ruedas{

	public Bicicleta(int radio) {
		super(radio);
		mover();
		calcular();
	}
	
	final int num=2;

	@Override
	public void mover() {
		System.out.println("Me muevo sobre 2 ruedas y me pedalean");
	}

	@Override
	public void calcular() {
		
		System.out.println("El area es: " + PI*radio*radio*num);
		
		// TODO Auto-generated method stub
		
	}

}